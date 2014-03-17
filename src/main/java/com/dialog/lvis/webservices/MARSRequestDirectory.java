
package com.dialog.lvis.webservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MARSRequestDirectory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MARSRequestDirectory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Characteristic" type="{http://webservices.lvis.dialog.com/}Characteristic" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SearchField" type="{http://webservices.lvis.dialog.com/}MARSRequestDirectorySearchField" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="directoryType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MARSRequestDirectory", propOrder = {
    "characteristic",
    "searchField"
})
public class MARSRequestDirectory {

    @XmlElement(name = "Characteristic")
    protected List<Characteristic> characteristic;
    @XmlElement(name = "SearchField")
    protected List<MARSRequestDirectorySearchField> searchField;
    @XmlAttribute(name = "directoryType")
    protected String directoryType;

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
     * Gets the value of the searchField property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchField property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MARSRequestDirectorySearchField }
     * 
     * 
     */
    public List<MARSRequestDirectorySearchField> getSearchField() {
        if (searchField == null) {
            searchField = new ArrayList<MARSRequestDirectorySearchField>();
        }
        return this.searchField;
    }

    /**
     * Gets the value of the directoryType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectoryType() {
        return directoryType;
    }

    /**
     * Sets the value of the directoryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectoryType(String value) {
        this.directoryType = value;
    }

}
