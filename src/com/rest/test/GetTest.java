package com.rest.test;

import org.testng.annotations.Test;

import com.rest.base.RestCore;

public class GetTest {
	
	RestCore rc = new RestCore("https://reqres.in/api/users?page=2");
	
	@Test
	public void GetRequest() {
		rc.get();
		System.out.println(rc.getStatusCode());
		System.out.println(rc.getResponseAsString());		
	}

}
