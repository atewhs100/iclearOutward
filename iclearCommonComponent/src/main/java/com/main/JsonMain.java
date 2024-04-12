package com.main;

import com.iclear.entity.Cheque;
import com.iclear.utils.JsonUtils;

public class JsonMain {

	private static Cheque cheque = new Cheque();

	public static void main(String[] args) {
		cheque.setAmount(56.0);
		cheque.setChequeId(1L);
		cheque.setChequeType("DD");

		String jsonResult = JsonUtils.convertJavaToJson(cheque);
		System.out.println(jsonResult);

		// will convert java object to json and save it in File

		JsonUtils.convertJavatoStringAndSaveInFile(cheque);

	}
}
