package org.mule.demo.soap;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.5.1
 * 2015-02-06T14:21:36.432-08:00
 * Generated source version: 2.5.1
 * 
 */
@WebServiceClient(name = "contactService", 
                  wsdlLocation = "file:/Users/albin/dev/mulesoft/studio/projects/3.6.0/soap-rest-attchments/src/main/resources/xml/wsdl/contact.wsdl",
                  targetNamespace = "http://example.mule.mulesoft.com/") 
public class ContactService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://example.mule.mulesoft.com/", "contactService");
    public final static QName ContactPort = new QName("http://example.mule.mulesoft.com/", "contactPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/Users/albin/dev/mulesoft/studio/projects/3.6.0/soap-rest-attchments/src/main/resources/xml/wsdl/contact.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ContactService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/Users/albin/dev/mulesoft/studio/projects/3.6.0/soap-rest-attchments/src/main/resources/xml/wsdl/contact.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ContactService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ContactService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ContactService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ContactService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ContactService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ContactService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns Contact
     */
    @WebEndpoint(name = "contactPort")
    public Contact getContactPort() {
        return super.getPort(ContactPort, Contact.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Contact
     */
    @WebEndpoint(name = "contactPort")
    public Contact getContactPort(WebServiceFeature... features) {
        return super.getPort(ContactPort, Contact.class, features);
    }

}
