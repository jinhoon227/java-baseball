package baseball.execption;

public class RetryCommandException extends IllegalArgumentException{

    private static final String EXCEPTION_MESSAGE_RETRY_COMMAND_RANGE = "[ERROR] 재시작 커맨드는 1 또는 2를 입력해야합니다.";

    public RetryCommandException() {
        super(EXCEPTION_MESSAGE_RETRY_COMMAND_RANGE);
    }
}
