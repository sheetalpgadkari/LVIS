package com.dialog.lvis.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

import com.dialog.lvis.dto.LVISDTO;

@XmlAccessorType(XmlAccessType.FIELD)
public class Feature extends LVISDTO {
	
    @XmlAttribute(name = "Name")
	private String name;
	
    @XmlAttribute(name = "Value")
    private String value;
	
	public Feature (String name, String value){
		this.name = name;
		this.value = value;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
}
