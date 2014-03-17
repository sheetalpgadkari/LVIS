
package com.dialog.lvis.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MARSRequestAuthentication complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MARSRequestAuthentication">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="userID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="password" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="tier1ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="tier2ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="tier3ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="tier4ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MARSRequestAuthentication")
public class MARSRequestAuthentication {

    @XmlAttribute(name = "userID")
    protected String userID;
    @XmlAttribute(name = "password")
    protected String password;
    @XmlAttribute(name = "tier1ID")
    protected String tier1ID;
    @XmlAttribute(name = "tier2ID")
    protected String tier2ID;
    @XmlAttribute(name = "tier3ID")
    protected String tier3ID;
    @XmlAttribute(name = "tier4ID")
    protected String tier4ID;

    /**
     * Gets the value of the userID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserID(String value) {
        this.userID = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the tier1ID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTier1ID() {
        return tier1ID;
    }

    /**
     * Sets the value of the tier1ID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTier1ID(String value) {
        this.tier1ID = value;
    }

    /**
     * Gets the value of the tier2ID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTier2ID() {
        return tier2ID;
    }

    /**
     * Sets the value of the tier2ID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTier2ID(String value) {
        this.tier2ID = value;
    }

    /**
     * Gets the value of the tier3ID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTier3ID() {
        return tier3ID;
    }

    /**
     * Sets the value of the tier3ID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTier3ID(String value) {
        this.tier3ID = value;
    }

    /**
     * Gets the value of the tier4ID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTier4ID() {
        return tier4ID;
    }

    /**
     * Sets the value of the tier4ID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTier4ID(String value) {
        this.tier4ID = value;
    }

}
