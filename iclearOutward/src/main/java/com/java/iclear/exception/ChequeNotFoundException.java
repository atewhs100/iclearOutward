package com.java.iclear.exception;

public class ChequeNotFoundException extends Exception {

	public ChequeNotFoundException() {
		super();
	}

	public ChequeNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public ChequeNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public ChequeNotFoundException(String message) {
		super(message);
	}

	public ChequeNotFoundException(Throwable cause) {
		super(cause);
	}

}
