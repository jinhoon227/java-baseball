package baseball.domain;

public class BaseballGame {

    private final Ball ball;

    public BaseballGame(Ball ball) {
        this.ball = ball;
    }

    public BallResult judgeBall(Ball userBall) {
        return BallResult.countBallAndStrike(ball, userBall);
    }

    public boolean retryGame(RetryCommand retryCommand) {
        return retryCommand.getValue();
    }
}
