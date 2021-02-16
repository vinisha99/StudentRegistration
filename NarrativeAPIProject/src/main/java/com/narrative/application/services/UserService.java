package com.narrative.application.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.narrative.application.model.UserRecords;
import com.narrative.application.repository.UserRepository;

@Service
@Transactional
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public UserRecords saveUserData(UserRecords userRecord) {
		System.out.println("Inside save service");
		System.out.println(userRecord.getUserId());
		return userRepository.save(userRecord);
	}
	
//	public UserRecords fetchDataByTime(String dateTime) {
//		return userRepository.fetchDataByTime(dateTime);
//	}
	
	public UserRecords findUserById(Long ID) {
		return userRepository.findById(ID).get();
	}
	
	public UserRecords getUniqueUsersByTimestamp(Long epochTime) {
		return userRepository.getUniqueUsersByTimestamp(epochTime);
	}
}
