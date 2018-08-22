package org.checkerframework.javacutil;

/**
 * Exception type indicating a mistake by an end user in using the Checker Framework, such as
 * incorrect command-line arguments.
 */
@SuppressWarnings("serial")
public class UserError extends RuntimeException {

    /**
     * Constructs a new CheckerError with the specified detail message.
     *
     * @param message the detail message
     */
    public UserError(String msg) {
        super(msg);
        if (msg == null) {
            throw new Error("Must have a detail message.");
        }
    }

    /**
     * Constructs a new CheckerError with a detail message composed from the given arguments.
     *
     * @param message the detail message
     */
    public UserError(String fmt, Object... args) {
        this(String.format(fmt, args));
    }
}
