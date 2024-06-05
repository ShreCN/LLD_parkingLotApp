package lld.design.parkinglotapplication.exceptions;

public class InvalidInputException extends RuntimeException{
    public InvalidInputException(String invalidGateId) {
        super(invalidGateId);
    }
}
