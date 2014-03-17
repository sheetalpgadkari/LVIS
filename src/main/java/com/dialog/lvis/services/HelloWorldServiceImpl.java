package com.dialog.lvis.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dialog.lvis.dto.AddressSearchRequest;
import com.dialog.lvis.dto.AddressSearchResponse;
import com.dialog.lvis.dto.Feature;
import com.dialog.lvis.webservices.Address;
import com.dialog.lvis.webservices.MARSResponse;
import com.dialog.lvis.webservices.MARSResponseResult;
import com.dialog.lvis.webservices.Request;
import com.dialog.lvis.webservices.RequestResponse;



@Service("helloWorldService")
public class HelloWorldServiceImpl implements HelloWorldService{

	@Override
	public String sayHi(String name) {
		return "Hi " + name + " FROM LVIS";
	}

	@Override
	public AddressSearchResponse doSearch(
			AddressSearchRequest addressSearchRequest) {
		AddressSearchResponse addressSearchResponse = new AddressSearchResponse();
		addressSearchResponse.setConfidence(100);
		addressSearchResponse.setGeocodeLevel("4");
		addressSearchResponse.setResultId(3452245);
		Feature[] features = new Feature[3];
		Feature feature1 = new Feature("STATE_ELECTORATE", "ALBERT PARK");
		Feature feature2 = new Feature("LGA", "PORT PHILLIP CITY");
		Feature feature3 = new Feature("LGA_CODE", "358");
		features[0] = feature1;
		features[1] = feature2;
		features[2] = feature3;
		addressSearchResponse.setFeatures(features);
		return addressSearchResponse;
	}

	@Override
	public RequestResponse doAddressSearch(Request addressSearchRequest) {
		
		RequestResponse reponse = new  RequestResponse();
		
		MARSResponse marsReponse = new MARSResponse();
		marsReponse.setNumberOfResults("1");
		List<MARSResponseResult> resultList = marsReponse.getResult();
		
		MARSResponseResult result1 = new MARSResponseResult();
		result1.setConfidence("90");
		result1.setGeocodeLevel("ADDRESS");		
		resultList.add(result1);
		
		Address address = new Address();
		address.setAddressLine("1/31 MACGOWAN AVENUE, GLEN HUNTLY VIC 3163");
		address.setCountry("Australia");
		result1.getAddress().add(address);
		
		result1.getFeature().add(new com.dialog.lvis.webservices.Feature());
		
		com.dialog.lvis.webservices.Feature feature2 = new com.dialog.lvis.webservices.Feature();
		feature2.setName("STATE_ELECTORATE");
		feature2.setValue("ALBERT PARK");
		result1.getFeature().add(feature2);
		
		reponse.setRequestResult(marsReponse);
		return reponse;
	}

	
}
