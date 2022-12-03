package baseball.execption;

public class BallLengthException extends IllegalArgumentException {

    private static final String EXCEPTION_MESSAGE_BALL_LENGTH = "[ERROR] 숫자 야구 게임은 3자리 숫자를 입력해야합니다.";

    public BallLengthException() {
        super(EXCEPTION_MESSAGE_BALL_LENGTH);
    }
}
