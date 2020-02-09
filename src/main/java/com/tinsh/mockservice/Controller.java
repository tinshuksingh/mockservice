package com.tinsh.mockservice;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@Autowired
	Service service;
	
	@RequestMapping(value = "/user", produces = MediaType.APPLICATION_JSON_VALUE,  method = RequestMethod.GET)
	public String myController() throws InterruptedException {
		
		System.out.println("inside base");
		long startTime = System.currentTimeMillis();
		
		String user =service.getUser();
		
		long endTime   = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("total time:"+totalTime);
		return user;
		
		
	}
	
	@RequestMapping(value = "/users", produces = MediaType.APPLICATION_JSON_VALUE,  method = RequestMethod.GET)
	public String myAsyncController() throws Throwable {
		 
		System.out.println("inside users");
		long startTime = System.currentTimeMillis();
		
		String users=service.getAllUsers();
		
		long endTime   = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("total time :"+totalTime);
		return users;
		
		
	}
}
