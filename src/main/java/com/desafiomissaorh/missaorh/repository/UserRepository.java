package com.desafiomissaorh.missaorh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desafiomissaorh.missaorh.models.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findById(long id);
	
}
