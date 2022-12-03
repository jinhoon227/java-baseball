package baseball.controller;

import baseball.domain.Ball;
import baseball.domain.BallMaker;
import baseball.domain.BallRandomNumberGenerator;
import baseball.domain.BaseballGame;
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
        do{
            playBaseballGame();
        }while (true);
    }

    private void playBaseballGame() {
        askBall();
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
