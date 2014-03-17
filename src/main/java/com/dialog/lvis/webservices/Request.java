
package com.dialog.lvis.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pRequest" type="{http://webservices.lvis.dialog.com/}MARSRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pRequest"
})
@XmlRootElement(name = "request")
public class Request {

    protected MARSRequest pRequest;

    /**
     * Gets the value of the pRequest property.
     * 
     * @return
     *     possible object is
     *     {@link MARSRequest }
     *     
     */
    public MARSRequest getPRequest() {
        return pRequest;
    }

    /**
     * Sets the value of the pRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link MARSRequest }
     *     
     */
    public void setPRequest(MARSRequest value) {
        this.pRequest = value;
    }

}
