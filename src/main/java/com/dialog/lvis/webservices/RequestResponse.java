
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
 *         &lt;element name="requestResult" type="{http://webservices.lvis.dialog.com/}MARSResponse" minOccurs="0"/>
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
    "requestResult"
})
@XmlRootElement(name = "requestResponse")
public class RequestResponse {

    protected MARSResponse requestResult;

    /**
     * Gets the value of the requestResult property.
     * 
     * @return
     *     possible object is
     *     {@link MARSResponse }
     *     
     */
    public MARSResponse getRequestResult() {
        return requestResult;
    }

    /**
     * Sets the value of the requestResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link MARSResponse }
     *     
     */
    public void setRequestResult(MARSResponse value) {
        this.requestResult = value;
    }

}
