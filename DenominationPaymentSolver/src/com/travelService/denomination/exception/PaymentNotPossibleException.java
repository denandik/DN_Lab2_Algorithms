package com.travelService.denomination.exception;

// Custom exception class for "Not available" error
public class PaymentNotPossibleException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private CustomExceptions errorCode;

    // Constructor to set the error message
    public PaymentNotPossibleException(CustomExceptions errorCode) {

        super("Payment is not possible.");
        this.errorCode = errorCode;
    }

    // Getter method for errorCode
    public int getErrorCode() {
        return errorCode.getCode();
    }

    @Override
    public String toString() {
        return "PaymentNotPossibleException [errorCode=" + getErrorCode() + "] : " + getMessage();
    }

    //
}