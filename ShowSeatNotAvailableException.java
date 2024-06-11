package Exceptions;

public class ShowSeatNotAvailableException extends RuntimeException {
    public ShowSeatNotAvailableException(String message) {
        super(message);
    }
}
