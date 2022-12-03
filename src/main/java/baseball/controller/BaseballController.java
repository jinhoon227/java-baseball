package baseball.controller;

import baseball.domain.*;
import baseball.view.InputView;
import baseball.view.OutputView;

public class BaseballController {

    private final InputView inputView = new InputView();
    private final OutputView outputView = new OutputView();
    private BaseballGame baseballGame;

    public void runGame() {
        startGame();
    }

    private void startGame() {
        outputView.printStartGame();
        do {
            baseballGame = new BaseballGame(createBall());
            playBaseballGame();
        } while (baseballGame.retryGame(askRetry()));
    }

    private RetryCommand askRetry() {
        outputView.printAskRetry();
        return inputView.readGameCommand();
    }

    private void playBaseballGame() {
        BallResult ballResult;
        do {
            ballResult = baseballGame.judgeBall(askBall());
            outputView.printResult(ballResult);
        } while (!ballResult.isAllStrike());
    }

    private Ball askBall() {
        outputView.printPleaseInputNumber();
        return inputView.readBall();
    }

    private Ball createBall() {
        BallMaker ballMaker = new BallMaker(new BallRandomNumberGenerator());
        return ballMaker.makeBall();
    }
}
