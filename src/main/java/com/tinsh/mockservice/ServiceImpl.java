package com.tinsh.mockservice;

import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Component;


@Component
public class ServiceImpl implements Service{

	public String getUser() throws InterruptedException {
	     
		System.out.println("inside getUser");
		
		TimeUnit.SECONDS.sleep(5);
	     
	    System.out.println("getUser completed");
	    
	    return "Tinshuk";
	}

	@Override
	public String getAllUsers() throws InterruptedException {
		System.out.println("inside getAllUsers");
		
		TimeUnit.SECONDS.sleep(10);
		
		System.out.println("getAllUsers completed");
		return "Singh";
	}

}
