package baseball.execption;

public class ResultMapException extends IllegalArgumentException {

    private static final String EXCEPTION_MESSAGE_RESULT_MAP = "[ERROR] 잘못된 값이 들어왔습니다";

    public ResultMapException() {
        super(EXCEPTION_MESSAGE_RESULT_MAP);
    }
}
