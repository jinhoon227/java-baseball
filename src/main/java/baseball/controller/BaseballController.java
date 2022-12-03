package baseball.controller;

import baseball.domain.*;
import baseball.view.InputView;
import baseball.view.OutputView;

public class BaseballController {

    private final InputView inputView = new InputView();
    private final OutputView outputView = new OutputView();
    private BaseballGame baseballGame;

    public void runGame() {
        try {
            startGame();
            playGame();
        } catch (IllegalArgumentException exception) {
            outputView.printExceptionMessage(exception);
        }
    }

    private void playGame() {
        do {
            playBaseballGame();
        } while (true);
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

    private void startGame() {
        outputView.printStartGame();
        baseballGame = new BaseballGame(createBall());
    }

    private Ball createBall() {
        BallMaker ballMaker = new BallMaker(new BallRandomNumberGenerator());
        return ballMaker.makeBall();
    }
}
