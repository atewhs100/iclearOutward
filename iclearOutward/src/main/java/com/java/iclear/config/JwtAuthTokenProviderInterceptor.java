package com.java.iclear.config;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

public class JwtAuthTokenProviderInterceptor implements ClientHttpRequestInterceptor {

	@Override
	public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution)
			throws IOException {

		String jwtAuthToken = StringUtils.EMPTY;

		jwtAuthToken = "qwer";
		HttpServletRequest httpServletRequest = getCurrentHttpServletRequest();

		request.getHeaders().add("Authorization", "Bearer;" + jwtAuthToken);
		return execution.execute(request, body);
	}

	private HttpServletRequest getCurrentHttpServletRequest() {
		return (null != RequestContextHolder.getRequestAttributes())
				? ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest()
				: null;
	}
}
