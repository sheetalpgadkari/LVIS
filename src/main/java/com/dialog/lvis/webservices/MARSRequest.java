
package com.dialog.lvis.webservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MARSRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MARSRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Authentication" type="{http://webservices.lvis.dialog.com/}MARSRequestAuthentication" minOccurs="0"/>
 *         &lt;element name="AddressLookup" type="{http://webservices.lvis.dialog.com/}ArrayOfAddress" minOccurs="0"/>
 *         &lt;element name="FeatureLookup" type="{http://webservices.lvis.dialog.com/}ArrayOfFeature" minOccurs="0"/>
 *         &lt;element name="DirectoryLookup" type="{http://webservices.lvis.dialog.com/}ArrayOfMARSRequestDirectory" minOccurs="0"/>
 *         &lt;element name="Characteristic" type="{http://webservices.lvis.dialog.com/}Characteristic" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="functionID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MARSRequest", propOrder = {
    "authentication",
    "addressLookup",
    "featureLookup",
    "directoryLookup",
    "characteristic"
})
public class MARSRequest {

    @XmlElement(name = "Authentication")
    protected MARSRequestAuthentication authentication;
    @XmlElement(name = "AddressLookup")
    protected ArrayOfAddress addressLookup;
    @XmlElement(name = "FeatureLookup")
    protected ArrayOfFeature featureLookup;
    @XmlElement(name = "DirectoryLookup")
    protected ArrayOfMARSRequestDirectory directoryLookup;
    @XmlElement(name = "Characteristic")
    protected List<Characteristic> characteristic;
    @XmlAttribute(name = "functionID")
    protected String functionID;
    @XmlAttribute(name = "version")
    protected String version;

    /**
     * Gets the value of the authentication property.
     * 
     * @return
     *     possible object is
     *     {@link MARSRequestAuthentication }
     *     
     */
    public MARSRequestAuthentication getAuthentication() {
        return authentication;
    }

    /**
     * Sets the value of the authentication property.
     * 
     * @param value
     *     allowed object is
     *     {@link MARSRequestAuthentication }
     *     
     */
    public void setAuthentication(MARSRequestAuthentication value) {
        this.authentication = value;
    }

    /**
     * Gets the value of the addressLookup property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAddress }
     *     
     */
    public ArrayOfAddress getAddressLookup() {
        return addressLookup;
    }

    /**
     * Sets the value of the addressLookup property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAddress }
     *     
     */
    public void setAddressLookup(ArrayOfAddress value) {
        this.addressLookup = value;
    }

    /**
     * Gets the value of the featureLookup property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFeature }
     *     
     */
    public ArrayOfFeature getFeatureLookup() {
        return featureLookup;
    }

    /**
     * Sets the value of the featureLookup property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFeature }
     *     
     */
    public void setFeatureLookup(ArrayOfFeature value) {
        this.featureLookup = value;
    }

    /**
     * Gets the value of the directoryLookup property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMARSRequestDirectory }
     *     
     */
    public ArrayOfMARSRequestDirectory getDirectoryLookup() {
        return directoryLookup;
    }

    /**
     * Sets the value of the directoryLookup property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMARSRequestDirectory }
     *     
     */
    public void setDirectoryLookup(ArrayOfMARSRequestDirectory value) {
        this.directoryLookup = value;
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
     * Gets the value of the functionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunctionID() {
        return functionID;
    }

    /**
     * Sets the value of the functionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunctionID(String value) {
        this.functionID = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
