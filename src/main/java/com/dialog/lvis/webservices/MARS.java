package com.dialog.lvis.webservices;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.10
 * 2014-03-12T16:07:53.213+11:00
 * Generated source version: 2.7.10
 * 
 */
@WebServiceClient(name = "MARS", 
                  wsdlLocation = "file:/home/sheetal/work/codebase/dse/lvis/src/main/resources/vmas.wsdl",
                  targetNamespace = "http://webservices.lvis.dialog.com/") 
public class MARS extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://webservices.lvis.dialog.com/", "MARS");
    public final static QName MARSSoap = new QName("http://webservices.lvis.dialog.com/", "MARSSoap");
    static {
        URL url = null;
        try {
            url = new URL("file:/home/sheetal/work/codebase/dse/lvis/src/main/resources/vmas.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(MARS.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/home/sheetal/work/codebase/dse/lvis/src/main/resources/vmas.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public MARS(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public MARS(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MARS() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public MARS(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public MARS(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public MARS(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns MARSSoap
     */
    @WebEndpoint(name = "MARSSoap")
    public MARSSoap getMARSSoap() {
        return super.getPort(MARSSoap, MARSSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MARSSoap
     */
    @WebEndpoint(name = "MARSSoap")
    public MARSSoap getMARSSoap(WebServiceFeature... features) {
        return super.getPort(MARSSoap, MARSSoap.class, features);
    }

}
