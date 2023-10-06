package com.travelService.denomination.exception;

public class InvalidInputException extends Exception {
    private CustomExceptions errorCode;

    public InvalidInputException(CustomExceptions invalidInput) {
        super("Enter the greater values from zero.");
        this.errorCode = invalidInput;
    }

     // Getter method for errorCode
     public int getErrorCode() {
        return errorCode.getCode();
    }

    @Override
    public String toString() {
        return "InvalidInputExpection [errorCode=" + getErrorCode() + "] : " + getMessage();
    }

}
