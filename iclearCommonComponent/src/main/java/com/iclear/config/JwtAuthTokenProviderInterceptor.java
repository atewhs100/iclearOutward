package com.iclear.config;

import java.io.IOException;

import org.apache.commons.lang.StringUtils;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;

public class JwtAuthTokenProviderInterceptor implements ClientHttpRequestInterceptor {

	@Override
	public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution)
			throws IOException {

		String jwtAuthToken = StringUtils.EMPTY;
		
		jwtAuthToken = "qwer";
		
		request.getHeaders().add("Authorization", "Bearer;" + jwtAuthToken);
		return execution.execute(request, body);
	}

}
