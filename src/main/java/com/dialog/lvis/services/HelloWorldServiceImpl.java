package com.dialog.lvis.services;

import org.springframework.stereotype.Service;



@Service("helloWorldService")
public class HelloWorldServiceImpl implements HelloWorldService{

	@Override
	public String sayHi(String name) {
		return "Hi " + name + " FROM LVIS";
	}

	
}
