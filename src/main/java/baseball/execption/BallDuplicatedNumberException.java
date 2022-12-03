package baseball.execption;

public class BallDuplicatedNumberException extends IllegalArgumentException {

    private static final String EXCEPTION_MESSAGE_DUPLICATED_NUMBER = "[ERROR] 숫자 야구 게임은 중복되지 않은 수를 입력해야합니다.";

    public BallDuplicatedNumberException() {
        super(EXCEPTION_MESSAGE_DUPLICATED_NUMBER);
    }
}
