package baseball.controller;

import baseball.view.InputView;
import baseball.view.OutputView;

public class BaseballController {

    private final InputView inputView = new InputView();
    private final OutputView outputView = new OutputView();

    public void runGame(){
        startGame();
    }

    private void startGame() {
        outputView.printStartGame();
    }
}
