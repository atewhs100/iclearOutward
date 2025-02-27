package com.java.iclear.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.iclear.DTO.impl.UserDTO;
import com.java.iclear.entity.User;
import com.java.iclear.repository.UserRepository;
import com.java.iclear.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	@Override
	public User addUserService(UserDTO user) {
		
		
		return userRepository.save(user);

	}

}
