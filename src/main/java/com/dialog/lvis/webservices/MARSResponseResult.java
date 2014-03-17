
package com.dialog.lvis.webservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MARSResponseResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MARSResponseResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Address" type="{http://webservices.lvis.dialog.com/}Address" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Map" type="{http://webservices.lvis.dialog.com/}MARSResponseResultMap" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Feature" type="{http://webservices.lvis.dialog.com/}Feature" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Directory" type="{http://webservices.lvis.dialog.com/}MARSResponseResultDirectory" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Characteristic" type="{http://webservices.lvis.dialog.com/}Characteristic" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="resultID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="confidence" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="geocodeLevel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="geocodeLevelCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MARSResponseResult", propOrder = {
    "address",
    "map",
    "feature",
    "directory",
    "characteristic"
})
public class MARSResponseResult {

    @XmlElement(name = "Address")
    protected List<Address> address;
    @XmlElement(name = "Map")
    protected List<MARSResponseResultMap> map;
    @XmlElement(name = "Feature")
    protected List<Feature> feature;
    @XmlElement(name = "Directory")
    protected List<MARSResponseResultDirectory> directory;
    @XmlElement(name = "Characteristic")
    protected List<Characteristic> characteristic;
    @XmlAttribute(name = "resultID")
    protected String resultID;
    @XmlAttribute(name = "type")
    protected String type;
    @XmlAttribute(name = "confidence")
    protected String confidence;
    @XmlAttribute(name = "geocodeLevel")
    protected String geocodeLevel;
    @XmlAttribute(name = "geocodeLevelCode")
    protected String geocodeLevelCode;

    /**
     * Gets the value of the address property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the address property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Address }
     * 
     * 
     */
    public List<Address> getAddress() {
        if (address == null) {
            address = new ArrayList<Address>();
        }
        return this.address;
    }

    /**
     * Gets the value of the map property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the map property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMap().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MARSResponseResultMap }
     * 
     * 
     */
    public List<MARSResponseResultMap> getMap() {
        if (map == null) {
            map = new ArrayList<MARSResponseResultMap>();
        }
        return this.map;
    }

    /**
     * Gets the value of the feature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Feature }
     * 
     * 
     */
    public List<Feature> getFeature() {
        if (feature == null) {
            feature = new ArrayList<Feature>();
        }
        return this.feature;
    }

    /**
     * Gets the value of the directory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the directory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDirectory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MARSResponseResultDirectory }
     * 
     * 
     */
    public List<MARSResponseResultDirectory> getDirectory() {
        if (directory == null) {
            directory = new ArrayList<MARSResponseResultDirectory>();
        }
        return this.directory;
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
     * Gets the value of the resultID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultID() {
        return resultID;
    }

    /**
     * Sets the value of the resultID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultID(String value) {
        this.resultID = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the confidence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfidence() {
        return confidence;
    }

    /**
     * Sets the value of the confidence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfidence(String value) {
        this.confidence = value;
    }

    /**
     * Gets the value of the geocodeLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeocodeLevel() {
        return geocodeLevel;
    }

    /**
     * Sets the value of the geocodeLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeocodeLevel(String value) {
        this.geocodeLevel = value;
    }

    /**
     * Gets the value of the geocodeLevelCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeocodeLevelCode() {
        return geocodeLevelCode;
    }

    /**
     * Sets the value of the geocodeLevelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeocodeLevelCode(String value) {
        this.geocodeLevelCode = value;
    }

}
