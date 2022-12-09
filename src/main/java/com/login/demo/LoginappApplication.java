package com.login.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.context.ApplicationContext;

import com.login.demo.repository.UserRepository;

@SpringBootApplication
public class LoginappApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(LoginappApplication.class, args);
		UserRepository userRepository=context.getBean(UserRepository.class);
		
//		User user=new User();
//		user.setName("jarvis"); 
//		user.setPassword("password");
//		
//		User user=userRepository.save(user);
	}
}
