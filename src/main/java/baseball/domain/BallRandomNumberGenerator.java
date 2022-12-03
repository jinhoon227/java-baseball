package baseball.domain;

import camp.nextstep.edu.missionutils.Randoms;

public class BallRandomNumberGenerator implements BallNumberGenerator {

    private static final int LOWER_NUMBER = 1;
    private static final int UPPER_NUMBER= 9;

    @Override
    public int generate() {
        return Randoms.pickNumberInRange(LOWER_NUMBER, UPPER_NUMBER);
    }
}
