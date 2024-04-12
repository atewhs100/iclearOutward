package com.java.iclear.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.iclear.entity.UserEntity;

public interface UserEntityRepository extends JpaRepository<UserEntity, Long>{

	Optional<UserEntity> findByUsername(String username);

}
