package com.springboot.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.web.model.UserEntity;
import com.springboot.web.model.UserEntityCrudRepository;

@Service
public class LoginService {
	
	@Autowired
	UserEntityCrudRepository userEntityCrudRepository;

	public boolean validateUser(UserEntity user) {
		Iterable<UserEntity> listOfUsers = userEntityCrudRepository.findAll();
		
		for(UserEntity userEntity: listOfUsers) {
			if(userEntity.getUsername().equals(user.getUsername()) && userEntity.getPassword().equals(user.getPassword())) {
//				System.out.println(userEntity.getUsername()+" "+userEntity.getPassword());
//				System.out.println(user.getUsername()+" "+user.getPassword());
				return true;
			}
		}
		return false;

	}

}
