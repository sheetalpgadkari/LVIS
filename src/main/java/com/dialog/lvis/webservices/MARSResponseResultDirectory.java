
package com.dialog.lvis.webservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MARSResponseResultDirectory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MARSResponseResultDirectory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DirectoryItem" type="{http://webservices.lvis.dialog.com/}MARSResponseResultDirectoryDirectoryItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="itemCount" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MARSResponseResultDirectory", propOrder = {
    "directoryItem"
})
public class MARSResponseResultDirectory {

    @XmlElement(name = "DirectoryItem")
    protected List<MARSResponseResultDirectoryDirectoryItem> directoryItem;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "itemCount")
    protected String itemCount;

    /**
     * Gets the value of the directoryItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the directoryItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDirectoryItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MARSResponseResultDirectoryDirectoryItem }
     * 
     * 
     */
    public List<MARSResponseResultDirectoryDirectoryItem> getDirectoryItem() {
        if (directoryItem == null) {
            directoryItem = new ArrayList<MARSResponseResultDirectoryDirectoryItem>();
        }
        return this.directoryItem;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the itemCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemCount() {
        return itemCount;
    }

    /**
     * Sets the value of the itemCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemCount(String value) {
        this.itemCount = value;
    }

}
