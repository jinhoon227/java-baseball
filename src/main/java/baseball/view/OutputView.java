package baseball.view;

import baseball.domain.BallResult;

public class OutputView {

    private static final String MESSAGE_START_GAME = "숫자 야구 게임을 시작합니다.";
    private static final String MESSAGE_INPUT_NUMBER = "숫자를 입력해주세요 : ";
    private static final String MESSAGE_CORRECT_ANSWER = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";
    private static final String MESSAGE_ASK_RETRY = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";

    public void printStartGame() {
        System.out.println(MESSAGE_START_GAME);
    }

    public void printPleaseInputNumber() {
        System.out.print(MESSAGE_INPUT_NUMBER);
    }

    public void printExceptionMessage(IllegalArgumentException exceptionMessage) {
        exceptionMessage.printStackTrace();
    }

    public void printResult(BallResult ballResult) {
        System.out.println(ResultMap.of(ballResult));
        if (ballResult.isAllStrike()) {
            System.out.println(MESSAGE_CORRECT_ANSWER);
        }
    }

    public void printAskRetry() {
        System.out.println(MESSAGE_ASK_RETRY);
    }
}
