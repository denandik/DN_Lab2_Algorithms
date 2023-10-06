package com.travelService.denomination.exception;

public enum CustomExceptions {
	    PAYMENT_NOT_POSSIBLE(1),
	    INVALID_INPUT(2),
	    CUSTOM_INDEX_OUT_OF_BOUNDS(3),
	    CUSTOM_DIVIDED_BY_ZERO(4),
	    CUSTOM_INPUT_MISMATCH(5);

	    private final int code;

	    CustomExceptions(int code) {
	        this.code = code;
	    }

	    public int getCode() {
	        return this.code;
	    }

}
