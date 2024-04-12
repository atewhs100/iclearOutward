package com.iclear.utils;

import java.util.UUID;

public class AppUtils {

	public AppUtils() {
		// TODO Auto-generated constructor stub
	}

	public static Long getUniqueId() {
		Long uniqueId = UUID.randomUUID().getLeastSignificantBits();
		String uniqueString = uniqueId.toString().substring(1);
		Long uniqLong = Long.parseLong(uniqueString);
		return uniqLong;

	}

	public static boolean checkNumbers(String numbers) {
		return numbers.matches("[0-9+]");
	}

	public static boolean checkChars(String value) {
		return value.matches("[a-zA-Z_+]");
	}
}
