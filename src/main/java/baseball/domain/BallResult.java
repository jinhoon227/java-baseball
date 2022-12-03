package baseball.domain;

import java.util.List;
import java.util.Objects;

public class BallResult {

    public static final int ALL_STRIKE = 3;
    public static final int NO_BALL = 0;
    public static final int NO_STRIKE = 0;
    private final int strike;
    private final int ball;

    private BallResult(int strike, int ball) {
        this.strike = strike;
        this.ball = ball;
    }

    public static BallResult countBallAndStrike(Ball ball, Ball userBall) {
        return new BallResult(countStrike(ball, userBall), countBall(ball, userBall));
    }

    private static int countStrike(Ball ball, Ball userBall) {
        return ball.countSameNumber(userBall);
    }

    private static int countBall(Ball ball, Ball userBall) {
        return ball.countContainNumber(userBall);
    }

    public boolean isAllStrike() {
        return (strike == ALL_STRIKE);
    }

    public boolean isOut() {
        return ((strike == NO_STRIKE) && (ball == NO_BALL));
    }

    public boolean isOnlyBall() {
        return ((strike == NO_STRIKE) && (ball != NO_BALL));
    }

    public boolean isOnlyStrike() {
        return ((strike != NO_STRIKE) && (ball == NO_BALL));
    }

    public boolean isBallAndStrike() {
        return ((strike != NO_STRIKE) && (ball != NO_BALL));
    }

    public int getStrike() {
        return strike;
    }

    public int getBall() {
        return ball;
    }
}
