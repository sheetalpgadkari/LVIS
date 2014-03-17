package com.dialog.lvis.services;

import com.dialog.lvis.dto.AddressSearchRequest;
import com.dialog.lvis.dto.AddressSearchResponse;
import com.dialog.lvis.webservices.Request;
import com.dialog.lvis.webservices.RequestResponse;

public interface HelloWorldService {
	public String sayHi (String name);
	
	public AddressSearchResponse doSearch (AddressSearchRequest addressSearchRequest);
	
	public RequestResponse doAddressSearch (Request addressSearchRequest);

	
}
