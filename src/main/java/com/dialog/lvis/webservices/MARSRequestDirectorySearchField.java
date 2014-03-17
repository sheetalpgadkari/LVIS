
package com.dialog.lvis.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MARSRequestDirectorySearchField complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MARSRequestDirectorySearchField">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="fieldName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="fieldValue" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="searchType" type="{http://webservices.lvis.dialog.com/}MARSRequestDirectorySearchFieldSearchType" default="equal" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MARSRequestDirectorySearchField")
public class MARSRequestDirectorySearchField {

    @XmlAttribute(name = "fieldName")
    protected String fieldName;
    @XmlAttribute(name = "fieldValue")
    protected String fieldValue;
    @XmlAttribute(name = "searchType")
    protected MARSRequestDirectorySearchFieldSearchType searchType;

    /**
     * Gets the value of the fieldName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldName() {
        return fieldName;
    }

    /**
     * Sets the value of the fieldName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldName(String value) {
        this.fieldName = value;
    }

    /**
     * Gets the value of the fieldValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldValue() {
        return fieldValue;
    }

    /**
     * Sets the value of the fieldValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldValue(String value) {
        this.fieldValue = value;
    }

    /**
     * Gets the value of the searchType property.
     * 
     * @return
     *     possible object is
     *     {@link MARSRequestDirectorySearchFieldSearchType }
     *     
     */
    public MARSRequestDirectorySearchFieldSearchType getSearchType() {
        if (searchType == null) {
            return MARSRequestDirectorySearchFieldSearchType.EQUAL;
        } else {
            return searchType;
        }
    }

    /**
     * Sets the value of the searchType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MARSRequestDirectorySearchFieldSearchType }
     *     
     */
    public void setSearchType(MARSRequestDirectorySearchFieldSearchType value) {
        this.searchType = value;
    }

}
