package com.java.iclear.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.java.iclear.entity.UserEntity;
import com.java.iclear.repository.UserEntityRepository;

@Component
public class UserLogicBean {
	// A Spring Data JPA repo
	@Autowired
	private UserEntityRepository repo;

	public boolean hasPermission(String username, PermissionEntity permission) {
		List<PermissionEntity> userPermissions = retrieveUserPermissions(username);
		return userPermissions.contains(permission);
	}

	@Transactional(readOnly = true)
	public List<PermissionEntity> retrieveUserPermissions(String username) {

		Optional<UserEntity> userEntity = repo.findByUsername(username);
		UserEntity user = userEntity.orElseThrow(() -> new CustomUserNameNotFoundException("DATA NOT FOUND"));
		return user.getPermissions();
	}
}
