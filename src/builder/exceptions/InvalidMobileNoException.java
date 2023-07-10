package builder.exceptions;

public class InvalidMobileNoException extends RuntimeException {
    public InvalidMobileNoException() {
    }

    public InvalidMobileNoException(String message) {
        super(message);
    }

    public InvalidMobileNoException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidMobileNoException(Throwable cause) {
        super(cause);
    }

    public InvalidMobileNoException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
