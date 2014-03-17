
package com.dialog.lvis.webservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.dialog.lvis.webservices package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddressCharacteristic_QNAME = new QName("http://webservices.lvis.dialog.com/", "Characteristic");
    private final static QName _AddressPos_QNAME = new QName("http://webservices.lvis.dialog.com/", "Pos");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.dialog.lvis.webservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RequestResponse }
     * 
     */
    public RequestResponse createRequestResponse() {
        return new RequestResponse();
    }

    /**
     * Create an instance of {@link MARSResponse }
     * 
     */
    public MARSResponse createMARSResponse() {
        return new MARSResponse();
    }

    /**
     * Create an instance of {@link Request }
     * 
     */
    public Request createRequest() {
        return new Request();
    }

    /**
     * Create an instance of {@link MARSRequest }
     * 
     */
    public MARSRequest createMARSRequest() {
        return new MARSRequest();
    }

    /**
     * Create an instance of {@link ArrayOfAddress }
     * 
     */
    public ArrayOfAddress createArrayOfAddress() {
        return new ArrayOfAddress();
    }

    /**
     * Create an instance of {@link Characteristic }
     * 
     */
    public Characteristic createCharacteristic() {
        return new Characteristic();
    }

    /**
     * Create an instance of {@link MARSResponseResultMapLegendLegendItem }
     * 
     */
    public MARSResponseResultMapLegendLegendItem createMARSResponseResultMapLegendLegendItem() {
        return new MARSResponseResultMapLegendLegendItem();
    }

    /**
     * Create an instance of {@link MARSResponseResultMap }
     * 
     */
    public MARSResponseResultMap createMARSResponseResultMap() {
        return new MARSResponseResultMap();
    }

    /**
     * Create an instance of {@link ArrayOfMARSRequestDirectory }
     * 
     */
    public ArrayOfMARSRequestDirectory createArrayOfMARSRequestDirectory() {
        return new ArrayOfMARSRequestDirectory();
    }

    /**
     * Create an instance of {@link MARSResponseResultMapBoundingBox }
     * 
     */
    public MARSResponseResultMapBoundingBox createMARSResponseResultMapBoundingBox() {
        return new MARSResponseResultMapBoundingBox();
    }

    /**
     * Create an instance of {@link MARSResponseResultDirectoryDirectoryItem }
     * 
     */
    public MARSResponseResultDirectoryDirectoryItem createMARSResponseResultDirectoryDirectoryItem() {
        return new MARSResponseResultDirectoryDirectoryItem();
    }

    /**
     * Create an instance of {@link MARSRequestDirectory }
     * 
     */
    public MARSRequestDirectory createMARSRequestDirectory() {
        return new MARSRequestDirectory();
    }

    /**
     * Create an instance of {@link MARSRequestDirectorySearchField }
     * 
     */
    public MARSRequestDirectorySearchField createMARSRequestDirectorySearchField() {
        return new MARSRequestDirectorySearchField();
    }

    /**
     * Create an instance of {@link MARSResponseResultDirectory }
     * 
     */
    public MARSResponseResultDirectory createMARSResponseResultDirectory() {
        return new MARSResponseResultDirectory();
    }

    /**
     * Create an instance of {@link Feature }
     * 
     */
    public Feature createFeature() {
        return new Feature();
    }

    /**
     * Create an instance of {@link MARSResponseError }
     * 
     */
    public MARSResponseError createMARSResponseError() {
        return new MARSResponseError();
    }

    /**
     * Create an instance of {@link ArrayOfFeature }
     * 
     */
    public ArrayOfFeature createArrayOfFeature() {
        return new ArrayOfFeature();
    }

    /**
     * Create an instance of {@link MARSResponseResultMapLegend }
     * 
     */
    public MARSResponseResultMapLegend createMARSResponseResultMapLegend() {
        return new MARSResponseResultMapLegend();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link MARSRequestAuthentication }
     * 
     */
    public MARSRequestAuthentication createMARSRequestAuthentication() {
        return new MARSRequestAuthentication();
    }

    /**
     * Create an instance of {@link MARSResponseResult }
     * 
     */
    public MARSResponseResult createMARSResponseResult() {
        return new MARSResponseResult();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Characteristic }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.lvis.dialog.com/", name = "Characteristic", scope = Address.class)
    public JAXBElement<Characteristic> createAddressCharacteristic(Characteristic value) {
        return new JAXBElement<Characteristic>(_AddressCharacteristic_QNAME, Characteristic.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.lvis.dialog.com/", name = "Pos", scope = Address.class)
    public JAXBElement<String> createAddressPos(String value) {
        return new JAXBElement<String>(_AddressPos_QNAME, String.class, Address.class, value);
    }

}
