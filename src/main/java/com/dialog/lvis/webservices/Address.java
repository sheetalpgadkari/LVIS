
package com.dialog.lvis.webservices;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Address complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Address">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Characteristic" type="{http://webservices.lvis.dialog.com/}Characteristic" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Pos" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="unitType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="unitNumberPrefix" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="unitNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="unitNumberSuffix" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="thoroughfareNumberFromPrefix" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="thoroughfareNumberFrom" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="thoroughfareNumberFromSuffix" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="thoroughfareNumberToPrefix" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="thoroughfareNumberTo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="thoroughfareNumberToSuffix" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="thoroughfareName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="thoroughfareTrailingType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="thoroughfarePostDirection" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="locality" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="postcode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="country" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="levelType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="levelNumberPrefix" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="levelNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="levelNumberSuffix" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="buildingName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="lotNumberPrefix" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="lotNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="lotNumberSuffix" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="addressLine" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Address", propOrder = {
    "content"
})
public class Address {

    @XmlElementRefs({
        @XmlElementRef(name = "Pos", namespace = "http://webservices.lvis.dialog.com/", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Characteristic", namespace = "http://webservices.lvis.dialog.com/", type = JAXBElement.class, required = false)
    })
    @XmlMixed
    protected List<Serializable> content;
    @XmlAttribute(name = "unitType")
    protected String unitType;
    @XmlAttribute(name = "unitNumberPrefix")
    protected String unitNumberPrefix;
    @XmlAttribute(name = "unitNumber")
    protected String unitNumber;
    @XmlAttribute(name = "unitNumberSuffix")
    protected String unitNumberSuffix;
    @XmlAttribute(name = "thoroughfareNumberFromPrefix")
    protected String thoroughfareNumberFromPrefix;
    @XmlAttribute(name = "thoroughfareNumberFrom")
    protected String thoroughfareNumberFrom;
    @XmlAttribute(name = "thoroughfareNumberFromSuffix")
    protected String thoroughfareNumberFromSuffix;
    @XmlAttribute(name = "thoroughfareNumberToPrefix")
    protected String thoroughfareNumberToPrefix;
    @XmlAttribute(name = "thoroughfareNumberTo")
    protected String thoroughfareNumberTo;
    @XmlAttribute(name = "thoroughfareNumberToSuffix")
    protected String thoroughfareNumberToSuffix;
    @XmlAttribute(name = "thoroughfareName")
    protected String thoroughfareName;
    @XmlAttribute(name = "thoroughfareTrailingType")
    protected String thoroughfareTrailingType;
    @XmlAttribute(name = "thoroughfarePostDirection")
    protected String thoroughfarePostDirection;
    @XmlAttribute(name = "locality")
    protected String locality;
    @XmlAttribute(name = "postcode")
    protected String postcode;
    @XmlAttribute(name = "state")
    protected String state;
    @XmlAttribute(name = "country")
    protected String country;
    @XmlAttribute(name = "levelType")
    protected String levelType;
    @XmlAttribute(name = "levelNumberPrefix")
    protected String levelNumberPrefix;
    @XmlAttribute(name = "levelNumber")
    protected String levelNumber;
    @XmlAttribute(name = "levelNumberSuffix")
    protected String levelNumberSuffix;
    @XmlAttribute(name = "buildingName")
    protected String buildingName;
    @XmlAttribute(name = "lotNumberPrefix")
    protected String lotNumberPrefix;
    @XmlAttribute(name = "lotNumber")
    protected String lotNumber;
    @XmlAttribute(name = "lotNumberSuffix")
    protected String lotNumberSuffix;
    @XmlAttribute(name = "addressLine")
    protected String addressLine;

    /**
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Characteristic }{@code >}
     * 
     * 
     */
    public List<Serializable> getContent() {
        if (content == null) {
            content = new ArrayList<Serializable>();
        }
        return this.content;
    }

    /**
     * Gets the value of the unitType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitType() {
        return unitType;
    }

    /**
     * Sets the value of the unitType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitType(String value) {
        this.unitType = value;
    }

    /**
     * Gets the value of the unitNumberPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitNumberPrefix() {
        return unitNumberPrefix;
    }

    /**
     * Sets the value of the unitNumberPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitNumberPrefix(String value) {
        this.unitNumberPrefix = value;
    }

    /**
     * Gets the value of the unitNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitNumber() {
        return unitNumber;
    }

    /**
     * Sets the value of the unitNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitNumber(String value) {
        this.unitNumber = value;
    }

    /**
     * Gets the value of the unitNumberSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitNumberSuffix() {
        return unitNumberSuffix;
    }

    /**
     * Sets the value of the unitNumberSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitNumberSuffix(String value) {
        this.unitNumberSuffix = value;
    }

    /**
     * Gets the value of the thoroughfareNumberFromPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThoroughfareNumberFromPrefix() {
        return thoroughfareNumberFromPrefix;
    }

    /**
     * Sets the value of the thoroughfareNumberFromPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThoroughfareNumberFromPrefix(String value) {
        this.thoroughfareNumberFromPrefix = value;
    }

    /**
     * Gets the value of the thoroughfareNumberFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThoroughfareNumberFrom() {
        return thoroughfareNumberFrom;
    }

    /**
     * Sets the value of the thoroughfareNumberFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThoroughfareNumberFrom(String value) {
        this.thoroughfareNumberFrom = value;
    }

    /**
     * Gets the value of the thoroughfareNumberFromSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThoroughfareNumberFromSuffix() {
        return thoroughfareNumberFromSuffix;
    }

    /**
     * Sets the value of the thoroughfareNumberFromSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThoroughfareNumberFromSuffix(String value) {
        this.thoroughfareNumberFromSuffix = value;
    }

    /**
     * Gets the value of the thoroughfareNumberToPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThoroughfareNumberToPrefix() {
        return thoroughfareNumberToPrefix;
    }

    /**
     * Sets the value of the thoroughfareNumberToPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThoroughfareNumberToPrefix(String value) {
        this.thoroughfareNumberToPrefix = value;
    }

    /**
     * Gets the value of the thoroughfareNumberTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThoroughfareNumberTo() {
        return thoroughfareNumberTo;
    }

    /**
     * Sets the value of the thoroughfareNumberTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThoroughfareNumberTo(String value) {
        this.thoroughfareNumberTo = value;
    }

    /**
     * Gets the value of the thoroughfareNumberToSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThoroughfareNumberToSuffix() {
        return thoroughfareNumberToSuffix;
    }

    /**
     * Sets the value of the thoroughfareNumberToSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThoroughfareNumberToSuffix(String value) {
        this.thoroughfareNumberToSuffix = value;
    }

    /**
     * Gets the value of the thoroughfareName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThoroughfareName() {
        return thoroughfareName;
    }

    /**
     * Sets the value of the thoroughfareName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThoroughfareName(String value) {
        this.thoroughfareName = value;
    }

    /**
     * Gets the value of the thoroughfareTrailingType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThoroughfareTrailingType() {
        return thoroughfareTrailingType;
    }

    /**
     * Sets the value of the thoroughfareTrailingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThoroughfareTrailingType(String value) {
        this.thoroughfareTrailingType = value;
    }

    /**
     * Gets the value of the thoroughfarePostDirection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThoroughfarePostDirection() {
        return thoroughfarePostDirection;
    }

    /**
     * Sets the value of the thoroughfarePostDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThoroughfarePostDirection(String value) {
        this.thoroughfarePostDirection = value;
    }

    /**
     * Gets the value of the locality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocality() {
        return locality;
    }

    /**
     * Sets the value of the locality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocality(String value) {
        this.locality = value;
    }

    /**
     * Gets the value of the postcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * Sets the value of the postcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostcode(String value) {
        this.postcode = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the levelType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevelType() {
        return levelType;
    }

    /**
     * Sets the value of the levelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevelType(String value) {
        this.levelType = value;
    }

    /**
     * Gets the value of the levelNumberPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevelNumberPrefix() {
        return levelNumberPrefix;
    }

    /**
     * Sets the value of the levelNumberPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevelNumberPrefix(String value) {
        this.levelNumberPrefix = value;
    }

    /**
     * Gets the value of the levelNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevelNumber() {
        return levelNumber;
    }

    /**
     * Sets the value of the levelNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevelNumber(String value) {
        this.levelNumber = value;
    }

    /**
     * Gets the value of the levelNumberSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevelNumberSuffix() {
        return levelNumberSuffix;
    }

    /**
     * Sets the value of the levelNumberSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevelNumberSuffix(String value) {
        this.levelNumberSuffix = value;
    }

    /**
     * Gets the value of the buildingName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuildingName() {
        return buildingName;
    }

    /**
     * Sets the value of the buildingName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuildingName(String value) {
        this.buildingName = value;
    }

    /**
     * Gets the value of the lotNumberPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLotNumberPrefix() {
        return lotNumberPrefix;
    }

    /**
     * Sets the value of the lotNumberPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLotNumberPrefix(String value) {
        this.lotNumberPrefix = value;
    }

    /**
     * Gets the value of the lotNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLotNumber() {
        return lotNumber;
    }

    /**
     * Sets the value of the lotNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLotNumber(String value) {
        this.lotNumber = value;
    }

    /**
     * Gets the value of the lotNumberSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLotNumberSuffix() {
        return lotNumberSuffix;
    }

    /**
     * Sets the value of the lotNumberSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLotNumberSuffix(String value) {
        this.lotNumberSuffix = value;
    }

    /**
     * Gets the value of the addressLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine() {
        return addressLine;
    }

    /**
     * Sets the value of the addressLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine(String value) {
        this.addressLine = value;
    }

}
