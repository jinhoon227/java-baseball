package baseball.domain;

import java.util.Collections;
import java.util.List;

public class Ball {

    private final List<Integer> ball;

    public Ball(List<Integer> ball) {
        this.ball = Collections.unmodifiableList(ball);
    }
}
