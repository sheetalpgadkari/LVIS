package com.dialog.lvis.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "requestResponse")
public class AddressSearchResponse extends LVISDTO{
	
    @XmlAttribute(name = "ResultId")
	private int resultId;
    
    @XmlAttribute(name = "Confidence")
	private int confidence;
    
    @XmlAttribute(name = "GeocodeLevel")
	private String geocodeLevel;
    
    @XmlElement(name = "Feature")
	private Feature[] features;
	
	public int getResultId() {
		return resultId;
	}
	public void setResultId(int resultId) {
		this.resultId = resultId;
	}
	public int getConfidence() {
		return confidence;
	}
	public void setConfidence(int confidence) {
		this.confidence = confidence;
	}
	public String getGeocodeLevel() {
		return geocodeLevel;
	}
	public void setGeocodeLevel(String geocodeLevel) {
		this.geocodeLevel = geocodeLevel;
	}
	public Feature[] getFeatures() {
		return features;
	}
	public void setFeatures(Feature[] features) {
		this.features = features;
	}
	
			
}
