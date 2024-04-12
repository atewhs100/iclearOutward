package com.iclear.utils;

import java.io.File;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtils {

	// objectMapper class contains in jackson library which helps to serialize java
	// object to json and vise versa

	private static final Logger logger = LoggerFactory.getLogger(JsonUtils.class);
	private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

	public static String convertJavaToJson(Object javaObject) {
		String jsonResult = "";
		try {
			jsonResult = OBJECT_MAPPER.writeValueAsString(javaObject);
		} catch (JsonProcessingException e) {
			logger.error("", e);
		}
		return jsonResult;
	}

	public static void convertJavatoStringAndSaveInFile(Object javaObject) {
		try {
			OBJECT_MAPPER.writeValue(new File("D:\\shweta\\abc.txt"), javaObject);
		} catch (StreamWriteException e) {
			e.printStackTrace();
		} catch (DatabindException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
