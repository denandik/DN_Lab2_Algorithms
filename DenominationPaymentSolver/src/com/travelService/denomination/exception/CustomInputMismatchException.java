package com.travelService.denomination.exception;

public class CustomInputMismatchException extends RuntimeException {
    private CustomExceptions errorCode;

    public CustomInputMismatchException(CustomExceptions customInputMismatch, Throwable cause) {
        super("Enter the valid values in input!!!", cause);
        this.errorCode = customInputMismatch;
    }

    // Getter method for errorCode
    public int getErrorCode() {
        return errorCode.getCode();
    }

    @Override
    public String toString() {
        return "CustomInputMismatchException [errorCode=" + getErrorCode() + "]: " + getMessage();
    }
}