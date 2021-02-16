package com.narrative.application.controller;

import org.slf4j.Logger;
import java.time.Instant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.narrative.application.model.UserRecords;
import com.narrative.application.services.UserService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/analytics")
@Slf4j
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("")
	public UserRecords saveUserData(@RequestBody UserRecords userRecord) {
		System.out.println("Inside post Controller");
		System.out.println(userRecord.toString());
		long currentTimestamp = Instant.now().toEpochMilli();
		System.out.println("Epoch time: " + currentTimestamp);
		userRecord.setDateTime(currentTimestamp);
		return userService.saveUserData(userRecord);
	}
	
	@GetMapping("/{epochTime}")
	public UserRecords fetchDataByTime(@PathVariable("epochTime") Long epochTime ) {
		return userService.getUniqueUsersByTimestamp(epochTime);
	}

}
