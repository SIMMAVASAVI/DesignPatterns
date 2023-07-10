package builder.exceptions;

public class InavalidIdException extends RuntimeException {
    public InavalidIdException() {
    }

    public InavalidIdException(String message) {
        super(message);
    }

    public InavalidIdException(String message, Throwable cause) {
        super(message, cause);
    }

    public InavalidIdException(Throwable cause) {
        super(cause);
    }

    public InavalidIdException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
