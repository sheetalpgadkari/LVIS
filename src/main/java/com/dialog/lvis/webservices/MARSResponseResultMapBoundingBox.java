
package com.dialog.lvis.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MARSResponseResultMapBoundingBox complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MARSResponseResultMapBoundingBox">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="minX" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="minY" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="maxX" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="maxY" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="centreX" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="centreY" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="coordSystem" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MARSResponseResultMapBoundingBox")
public class MARSResponseResultMapBoundingBox {

    @XmlAttribute(name = "minX")
    protected String minX;
    @XmlAttribute(name = "minY")
    protected String minY;
    @XmlAttribute(name = "maxX")
    protected String maxX;
    @XmlAttribute(name = "maxY")
    protected String maxY;
    @XmlAttribute(name = "centreX")
    protected String centreX;
    @XmlAttribute(name = "centreY")
    protected String centreY;
    @XmlAttribute(name = "coordSystem")
    protected String coordSystem;

    /**
     * Gets the value of the minX property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinX() {
        return minX;
    }

    /**
     * Sets the value of the minX property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinX(String value) {
        this.minX = value;
    }

    /**
     * Gets the value of the minY property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinY() {
        return minY;
    }

    /**
     * Sets the value of the minY property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinY(String value) {
        this.minY = value;
    }

    /**
     * Gets the value of the maxX property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxX() {
        return maxX;
    }

    /**
     * Sets the value of the maxX property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxX(String value) {
        this.maxX = value;
    }

    /**
     * Gets the value of the maxY property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxY() {
        return maxY;
    }

    /**
     * Sets the value of the maxY property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxY(String value) {
        this.maxY = value;
    }

    /**
     * Gets the value of the centreX property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCentreX() {
        return centreX;
    }

    /**
     * Sets the value of the centreX property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCentreX(String value) {
        this.centreX = value;
    }

    /**
     * Gets the value of the centreY property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCentreY() {
        return centreY;
    }

    /**
     * Sets the value of the centreY property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCentreY(String value) {
        this.centreY = value;
    }

    /**
     * Gets the value of the coordSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoordSystem() {
        return coordSystem;
    }

    /**
     * Sets the value of the coordSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoordSystem(String value) {
        this.coordSystem = value;
    }

}
