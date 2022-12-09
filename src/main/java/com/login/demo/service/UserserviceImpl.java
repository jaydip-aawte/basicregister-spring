package com.login.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.login.demo.entity.User;
import com.login.demo.repository.UserRepository;

@Service
public class UserserviceImpl implements UserService
{
	@Autowired
	private UserRepository userRepository;

	@Override
	public void saveUser(User user) {
		// TODO Auto-generated method stub
		userRepository.save(user);
	}
}
