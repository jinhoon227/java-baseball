package baseball.view;

public class OutputView {

    private static final String MESSAGE_START_GAME = "숫자 야구 게임을 시작합니다.";
    private static final String MESSAGE_INPUT_NUMBER = "숫자를 입력해주세요 : ";

    public void printStartGame() {
        System.out.println(MESSAGE_START_GAME);
    }

    public void printPleaseInputNumber() {
        System.out.print(MESSAGE_INPUT_NUMBER);
    }

    public void printExceptionMessage(IllegalArgumentException exceptionMessage) {
        exceptionMessage.printStackTrace();
    }

}
