package baseball.domain;

import baseball.execption.RetryCommandException;

import java.util.Arrays;

public enum RetryCommand {

    RETRY("1", true),
    QUIT("2", false);

    final private String command;
    final private boolean value;

    RetryCommand(String command, boolean value) {
        this.command = command;
        this.value = value;
    }

    public static RetryCommand commandOf(String command) {
        return Arrays.stream(values())
                .filter(retry -> retry.command.equals(command))
                .findAny()
                .orElseThrow(RetryCommandException::new);
    }

    public boolean getValue() {
        return value;
    }
}
