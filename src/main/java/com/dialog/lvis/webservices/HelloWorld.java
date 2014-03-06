package com.dialog.lvis.webservices;

import javax.jws.WebService;

@WebService
public interface HelloWorld {
	
	public String sayHello ();
	
	public String sayHi (String name);

}
