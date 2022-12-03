package baseball.view;

import baseball.domain.BallResult;
import baseball.execption.ResultMapException;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public enum ResultMap {

    OUT("낫싱", BallResult::isOut),
    ONLY_BALL("${ball}볼", BallResult::isOnlyBall),
    ONLY_STRIKE("${strike}스트라이크", BallResult::isOnlyStrike),
    BALL_STRIKE("${ball}볼 ${strike}스트라이크", BallResult::isBallAndStrike);

    private final String message;
    private final Predicate<BallResult> condition;

    ResultMap(String message, Predicate<BallResult> condition) {
        this.message = message;
        this.condition = condition;
    }

    public static String of(BallResult ballResult) {
        return Arrays.stream(values())
                .filter(rule -> rule.condition.test(ballResult))
                .findAny()
                .map(resultMap -> resultMap.getMessage(ballResult))
                .orElseThrow(ResultMapException::new);
    }

    private String getMessage(BallResult ballResult) {
        return message.replaceAll("\\$\\{ball}", Integer.toString(ballResult.getBall()))
                .replaceAll("\\$\\{strike}", Integer.toString(ballResult.getStrike()));
    }
}
