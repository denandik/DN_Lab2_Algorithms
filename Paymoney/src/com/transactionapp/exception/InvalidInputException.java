package com.transactionapp.exception;

public class InvalidInputException extends Exception{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidInputException(){
        super("Exception: Enter the values greater than zero.");
    }
}
