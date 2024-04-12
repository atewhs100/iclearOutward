package com.java.iclear.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.iclear.DTO.impl.UserDTO;

@Repository
public interface UserRepository extends JpaRepository<UserDTO, Long> {

	void addUserDetails(UserDTO user);
}
