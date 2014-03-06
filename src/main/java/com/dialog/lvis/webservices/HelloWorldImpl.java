package com.dialog.lvis.webservices;

import javax.jws.WebParam;
import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.dialog.lvis.services.HelloWorldService;

@WebService(endpointInterface = "com.dialog.lvis.webservices.HelloWorld",serviceName = "HelloWorld")
@Component("helloWorldWebService")
public class HelloWorldImpl implements HelloWorld{


	@Autowired
	@Qualifier("helloWorldService")
	private HelloWorldService helloWorldService;
	
	@Override
	public String sayHello() {
		return "Hello LVIS";
	}

	@Override
	public String sayHi(@WebParam(name="name") String name) {
		return helloWorldService.sayHi(name);
	}

	
}
