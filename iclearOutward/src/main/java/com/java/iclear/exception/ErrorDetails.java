package com.java.iclear.exception;

import java.util.Date;

public class ErrorDetails {

	String errorMessage;
	Date timeStamp;

	public ErrorDetails(String errorMessage, Date timeStamp) {
		super();
		this.errorMessage = errorMessage;
		this.timeStamp = timeStamp;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	@Override
	public String toString() {
		return "ErrorDetails [errorMessage=" + errorMessage + ", timeStamp=" + timeStamp + "]";
	}

	public Date getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}

}
