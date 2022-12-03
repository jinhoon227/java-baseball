package baseball.domain;

import baseball.execption.BallDuplicatedNumberException;
import baseball.execption.BallLengthException;
import baseball.execption.BallRangeException;
import baseball.execption.NumberInvalidException;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Ball {

    private static final int BASE_VALUE = '0';
    public static final int LOWER_NUMBER = 1;
    public static final int UPPER_NUMBER = 9;
    private final List<Integer> ball;

    private Ball(List<Integer> ball) {
        this.ball = Collections.unmodifiableList(ball);
    }

    public static Ball of(List<Integer> ball) {
        validate(ball);
        return new Ball(ball);
    }

    public static Ball createStringToBall(String ball) {
        List<Integer> numbers = convertStringToList(ball);
        validate(numbers);
        return new Ball(numbers);
    }

    private static List<Integer> convertStringToList(String ball) {
        return ball.codePoints()
                .map(character -> (character - BASE_VALUE))
                .boxed()
                .collect(Collectors.toList());
    }

    private static void validate(List<Integer> ball) {
        validateRange(ball);
        validateLength(ball);
        validateDuplicatedNumber(ball);
    }

    private static void validateRange(List<Integer> ball) {
        if (!ball.stream().allMatch(number -> ((number >= LOWER_NUMBER) && (number <= UPPER_NUMBER)))) {
            throw new BallRangeException();
        }
    }

    private static void validateDuplicatedNumber(List<Integer> ball) {
        ball = ball.stream().distinct().collect(Collectors.toList());
        if (ball.size() != 3) {
            throw new BallDuplicatedNumberException();
        }
    }

    private static void validateLength(List<Integer> ball) {
        if (ball.size() != 3) {
            throw new BallLengthException();
        }
    }
}
