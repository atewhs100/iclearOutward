package com.java.iclear.model;

import java.io.Serializable;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Response implements Serializable {

	private static final long serialVersionUID = -1235488751757455080L;
	private String status;
	private String message;
	private Object data;

	public Response(String status, String message, Object data) {
		super();
		this.status = status;
		this.message = message;
		this.data = data;
	}

}
