package baseball.execption;

public class BallRangeException extends IllegalArgumentException{

    private static final String EXCEPTION_MESSAGE_BALL_RANGE = "[ERROR] 숫자 야구 게임은 1 ~ 9 사이 숫자를 입력해야합니다.";

    public BallRangeException() {
        super(EXCEPTION_MESSAGE_BALL_RANGE);
    }
}
