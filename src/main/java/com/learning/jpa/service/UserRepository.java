package com.learning.jpa.service;

import org.aspectj.apache.bcel.util.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.jpa.entity.User;

public interface UserRepository  extends JpaRepository<User, Long>{
	
	
	

}
