package com.java.iclear.util;

import org.springframework.boot.web.servlet.server.Session;

public class ThreadSessionManager {

	public static Session currentUserSession() {
		Session session = new Session();
		return session;
	}

}
