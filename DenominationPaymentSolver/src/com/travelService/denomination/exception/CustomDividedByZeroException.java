/**
 * The CustomDividedByZeroException class is a custom exception that extends the RuntimeException class.
 * It is thrown when a division by zero operation is attempted.
 * 
 * This exception class includes an ErrorCode object to provide information about the error code associated with the exception.
 * 
 * Example usage:
 * 
 * try {
 *     // Perform division operation
 * } catch (CustomDividedByZeroException ex) {
 *     // Handle exception
 * }
 */
package com.travelService.denomination.exception;



public class CustomDividedByZeroException extends RuntimeException {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private CustomExceptions errorCode;


    public CustomDividedByZeroException(CustomExceptions errorCode, Throwable cause) {
        super(cause);
        this.errorCode = errorCode;
    }


    public int getErrorCode() {
        return errorCode.getCode();
    }


    @Override
    public String toString() {
        return "CustomDividedByZeroException [errorCode=" + getErrorCode() + "] : " + getMessage();
    }
}