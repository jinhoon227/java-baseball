package baseball;

import baseball.computer.Computer;
import baseball.verifier.VerifierInputToBaseballGame;
import baseball.verifier.VerifierInputToEndOrNewGame;
import baseball.verifier.Verifier;

import static baseball.BaseballConstants.NEW_GAME;


public class BaseballGame {
    private final Verifier verifierInputToEndOrNewGame = new VerifierInputToEndOrNewGame();
    private final Verifier verifierInputToBaseballGame = new VerifierInputToBaseballGame();
    private final Computer computer = new Computer();

    public void start() {
        View.printStartGame();
        do {
            computer.makeRandomNumber();
            playGame();
        } while (isEndGame());
    }

    private void playGame() {
        do {
            View.printPleaseInputNumber();
            String userInput = checkVerifierInputToBaseballGame(View.getUserInput());
            computer.countBallAndStrike(userInput);
            computer.replyBallAndStrike2();
        } while (!(computer.isCollect()));
    }

    public boolean isEndGame() {
        View.printChoiceEndOrNewGame();
        String userInput = checkVerifierInputToEndOrNewGame(View.getUserInput());
        return userInput.equals(NEW_GAME);
    }

    private String checkVerifierInputToEndOrNewGame(String input) {
        if(!(verifierInputToEndOrNewGame.validates(input))) {
            throw new IllegalArgumentException("잘못된 입력입니다.");
        }

        return input;
    }

    private String checkVerifierInputToBaseballGame(String input) {
        if(!(verifierInputToBaseballGame.validates(input))) {
            throw new IllegalArgumentException("잘못된 입력입니다.");
        }

        return input;
    }
}
