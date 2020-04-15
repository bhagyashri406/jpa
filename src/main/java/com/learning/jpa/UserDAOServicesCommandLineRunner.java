package com.learning.jpa;
import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.learning.jpa.entity.User;
import com.learning.jpa.service.UserDAOService;




@Component
public class UserDAOServicesCommandLineRunner implements CommandLineRunner{

	
	public static Logger log = LoggerFactory.logger(UserDAOServicesCommandLineRunner.class);
	@Autowired 
	public UserDAOService userDaoService ;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		User user = new User("bhagya shri", "teacher");
		userDaoService.insert(user);
		
		log.info("new user is created :"+ user);
		
		
		
		
	}

	
}
