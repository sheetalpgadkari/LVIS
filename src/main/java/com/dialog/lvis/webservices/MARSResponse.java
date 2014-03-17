
package com.dialog.lvis.webservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MARSResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MARSResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Error" type="{http://webservices.lvis.dialog.com/}MARSResponseError" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Result" type="{http://webservices.lvis.dialog.com/}MARSResponseResult" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Characteristic" type="{http://webservices.lvis.dialog.com/}Characteristic" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="referenceID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="success" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="numberOfResults" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MARSResponse", propOrder = {
    "error",
    "result",
    "characteristic"
})
public class MARSResponse {

    @XmlElement(name = "Error")
    protected List<MARSResponseError> error;
    @XmlElement(name = "Result")
    protected List<MARSResponseResult> result;
    @XmlElement(name = "Characteristic")
    protected List<Characteristic> characteristic;
    @XmlAttribute(name = "referenceID")
    protected String referenceID;
    @XmlAttribute(name = "success")
    protected String success;
    @XmlAttribute(name = "numberOfResults")
    protected String numberOfResults;

    /**
     * Gets the value of the error property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the error property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getError().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MARSResponseError }
     * 
     * 
     */
    public List<MARSResponseError> getError() {
        if (error == null) {
            error = new ArrayList<MARSResponseError>();
        }
        return this.error;
    }

    /**
     * Gets the value of the result property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the result property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MARSResponseResult }
     * 
     * 
     */
    public List<MARSResponseResult> getResult() {
        if (result == null) {
            result = new ArrayList<MARSResponseResult>();
        }
        return this.result;
    }

    /**
     * Gets the value of the characteristic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the characteristic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCharacteristic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Characteristic }
     * 
     * 
     */
    public List<Characteristic> getCharacteristic() {
        if (characteristic == null) {
            characteristic = new ArrayList<Characteristic>();
        }
        return this.characteristic;
    }

    /**
     * Gets the value of the referenceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceID() {
        return referenceID;
    }

    /**
     * Sets the value of the referenceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceID(String value) {
        this.referenceID = value;
    }

    /**
     * Gets the value of the success property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuccess() {
        return success;
    }

    /**
     * Sets the value of the success property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuccess(String value) {
        this.success = value;
    }

    /**
     * Gets the value of the numberOfResults property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberOfResults() {
        return numberOfResults;
    }

    /**
     * Sets the value of the numberOfResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOfResults(String value) {
        this.numberOfResults = value;
    }

}
