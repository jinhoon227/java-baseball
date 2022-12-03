package baseball.domain;

public class BaseballGame {

    private final Ball ball;

    public BaseballGame(Ball ball) {
        this.ball = ball;
    }

    public boolean retryGame(RetryCommand retryCommand) {
        return false;
    }

}
