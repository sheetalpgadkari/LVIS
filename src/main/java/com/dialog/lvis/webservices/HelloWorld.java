package com.dialog.lvis.webservices;

import javax.jws.WebService;


import com.dialog.lvis.webservices.Request;
import com.dialog.lvis.webservices.RequestResponse;

@WebService
public interface HelloWorld {
	
	public String sayHello ();
	
	public String sayHi (String name);

	public RequestResponse doAddressSearch (Request addressSearchRequest);

	
}
