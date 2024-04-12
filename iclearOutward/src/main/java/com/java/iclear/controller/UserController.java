package com.java.iclear.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.iclear.DTO.impl.UserDTO;
import com.java.iclear.entity.User;
import com.java.iclear.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;

	@PostMapping("/add")
	public ResponseEntity<User> addUserDetails(@RequestBody UserDTO userDTO) {
		User user = userService.addUserService(userDTO);
		return new ResponseEntity<>(user, HttpStatus.CREATED);

	}

}
