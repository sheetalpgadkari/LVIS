
package com.dialog.lvis.webservices;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MARSRequestDirectorySearchFieldSearchType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MARSRequestDirectorySearchFieldSearchType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="equal"/>
 *     &lt;enumeration value="notEqual"/>
 *     &lt;enumeration value="greaterThan"/>
 *     &lt;enumeration value="lessThan"/>
 *     &lt;enumeration value="isLike"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MARSRequestDirectorySearchFieldSearchType")
@XmlEnum
public enum MARSRequestDirectorySearchFieldSearchType {

    @XmlEnumValue("equal")
    EQUAL("equal"),
    @XmlEnumValue("notEqual")
    NOT_EQUAL("notEqual"),
    @XmlEnumValue("greaterThan")
    GREATER_THAN("greaterThan"),
    @XmlEnumValue("lessThan")
    LESS_THAN("lessThan"),
    @XmlEnumValue("isLike")
    IS_LIKE("isLike");
    private final String value;

    MARSRequestDirectorySearchFieldSearchType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MARSRequestDirectorySearchFieldSearchType fromValue(String v) {
        for (MARSRequestDirectorySearchFieldSearchType c: MARSRequestDirectorySearchFieldSearchType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
