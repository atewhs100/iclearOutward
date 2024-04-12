package com.java.iclear.util;

import java.util.HashSet;
import java.util.Set;

public class PasJwtToken {

	private Set<String> getPermissions() {
		Set<String> permissions = new HashSet<>();
		permissions.add("CanMake");
		permissions.add("canApprove");
		return permissions;
	}

	public String getUserName() {
		return "user1";
	}
}
