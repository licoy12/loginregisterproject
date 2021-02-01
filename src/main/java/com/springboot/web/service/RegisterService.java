package com.springboot.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.web.model.UserEntity;
import com.springboot.web.model.UserEntityCrudRepository;

@Service
public class RegisterService {
	
	@Autowired
	UserEntityCrudRepository userEntityCrudRepository;
	
	public boolean createUser(UserEntity user) {
		System.out.println("CREATEUSER");
		if(checkUser(user)) {
			userEntityCrudRepository.save(user);
			return true;
		}
		return false;
	}
	
	public boolean checkUser(UserEntity user) {
		Iterable<UserEntity> listOfUsers = userEntityCrudRepository.findAll();
		for(UserEntity userEntity:listOfUsers) {
			if(userEntity.getUsername().equalsIgnoreCase(user.getUsername())) {
				System.out.println("ID"+userEntity.getId());
				return false;
			}
		}
		return true;
	}
	
}


