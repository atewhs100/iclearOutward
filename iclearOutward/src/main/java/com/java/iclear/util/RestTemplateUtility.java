
package com.java.iclear.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.java.iclear.model.Response;

@Component
public class RestTemplateUtility<T> {

	/*
	 * @Autowired RestTemplate restTemplate;
	 */

	/*
	 * public ResponseEntity<T> get(String uri, Class<T> responseType, Object...
	 * code) {
	 * 
	 * HttpHeaders headers = getHeaders(); HttpEntity<String> httpEntity = new
	 * HttpEntity<>(headers); return restTemplate.exchange(uri, HttpMethod.GET,
	 * httpEntity, responseType, code); }
	 */

	private HttpHeaders getHeaders() {
		HttpHeaders headers = new HttpHeaders();
		headers.add("content-Type", MediaType.APPLICATION_JSON_VALUE);
		return headers;
	}

	/*
	 * public ResponseEntity<Response> post(String uri, T data, Object... code) {
	 * 
	 * HttpEntity<T> httpEntity = new HttpEntity<>(data, getHeaders()); return
	 * restTemplate.exchange(uri, HttpMethod.POST, httpEntity, Response.class,
	 * code); }
	 */

	public T convertValues(ResponseEntity<Response> response) {
		ObjectMapper objectMapper = new ObjectMapper();
		T converted = objectMapper.convertValue(response.getBody().getData(), new TypeReference<T>() {
		});
		return converted;
	}

	/*
	 * public ResponseEntity<Response> put(String uri, T data, Object... code) {
	 * HttpEntity<T> httpEntity = new HttpEntity<>(data, getHeaders()); return
	 * restTemplate.exchange(uri, HttpMethod.PUT, httpEntity, Response.class, code);
	 * }
	 */
}