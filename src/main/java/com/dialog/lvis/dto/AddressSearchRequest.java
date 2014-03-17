package com.dialog.lvis.dto;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "requestResponse")
public class AddressSearchRequest extends LVISDTO{
    @XmlAttribute(name = "Locality")
	private String locality;
    
    @XmlAttribute(name = "ThoroughfareName")
    private String thoroughfareName;
    
    @XmlAttribute(name = "ThoroughfareTrailingType")
    private String thoroughfareTrailingType;
	
	public String getLocality() {
		return locality;
	}
	public void setLocality(String locality) {
		this.locality = locality;
	}
	public String getThoroughfareName() {
		return thoroughfareName;
	}
	public void setThoroughfareName(String thoroughfareName) {
		this.thoroughfareName = thoroughfareName;
	}
	public String getThoroughfareTrailingType() {
		return thoroughfareTrailingType;
	}
	public void setThoroughfareTrailingType(String thoroughfareTrailingType) {
		this.thoroughfareTrailingType = thoroughfareTrailingType;
	}
}
