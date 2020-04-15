package com.learning.jpa;

import java.util.List;
import java.util.Optional;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.learning.jpa.entity.User;
import com.learning.jpa.service.UserRepository;



@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner{

	
	public static Logger log = LoggerFactory.logger(UserRepositoryCommandLineRunner.class);
	@Autowired 
	public UserRepository userRepository ;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		User user = new User("Sachin Arya", "ENG");
		userRepository.save(user);
		log.info("new user is created :"+ user);
		
	Optional<User> userWithId  = userRepository.findById(1L);
	log.info("retrived user :"+ userWithId);
		
		List<User> users= userRepository.findAll();
		log.info("retrived all :"+ users);
	}
	
	
}