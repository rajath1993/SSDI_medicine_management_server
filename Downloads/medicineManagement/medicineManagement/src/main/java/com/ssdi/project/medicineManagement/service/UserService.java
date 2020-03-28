package com.ssdi.project.medicineManagement.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ssdi.project.medicineManagement.model.User;
import com.ssdi.project.medicineManagement.repository.UserRepository;

@Service
@Transactional
public class UserService {
	private final UserRepository userRepository;
	
	
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public void saveUser(User user) {
		userRepository.save(user);
	}

}
