package com.travelService.denomination.exception;

public class CustomIndexOutOfBondException extends RuntimeException {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private CustomExceptions errorCode;

    public CustomIndexOutOfBondException(  CustomExceptions errorCode, Throwable cause) {
        super (cause);
        this.errorCode = errorCode; 
    }

    // Getter method for errorCode
    public int getErrorCode() {
        return errorCode.getCode();
    }

    @Override
    public String toString() {
        return "CustomIndexOutOfBondException [errorCode=" + getErrorCode() + "] : " + getMessage();
    }

    //
}
