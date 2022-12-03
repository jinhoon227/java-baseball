package baseball.view;

import baseball.domain.Ball;
import baseball.domain.RetryCommand;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class InputView {

    public Ball readBall() {
        return Ball.createStringToBall(readLine());
    }

    public RetryCommand readGameCommand() {
        return RetryCommand.commandOf(readLine());
    }
}
