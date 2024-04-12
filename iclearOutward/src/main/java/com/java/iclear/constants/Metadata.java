package com.java.iclear.constants;

public enum Metadata {

	PASCOOKIE("brownstoneauthcookie"), BATCH_UPLOAD_DIR("maindirectory");

	private String value;

	private Metadata(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}
