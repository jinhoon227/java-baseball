package baseball.domain;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BallMaker {

    public static final int BASEBALL_MAX = 3;
    private final BallNumberGenerator ballNumberGenerator;

    public BallMaker(BallNumberGenerator ballNumberGenerator) {
        this.ballNumberGenerator = ballNumberGenerator;
    }

    public Ball makeBall() {
        return Ball.of(Stream.generate(ballNumberGenerator::generate)
                .distinct()
                .limit(BASEBALL_MAX).
                collect(Collectors.toList()));
    }
}
