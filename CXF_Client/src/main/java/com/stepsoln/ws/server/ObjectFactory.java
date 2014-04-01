
package com.stepsoln.ws.server;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.stepsoln.ws.server package. 
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

    private final static QName _GetFullNameResponse_QNAME = new QName("http://server.ws.stepsoln.com/", "getFullNameResponse");
    private final static QName _GetFullName_QNAME = new QName("http://server.ws.stepsoln.com/", "getFullName");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.stepsoln.ws.server
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetFullNameResponse }
     * 
     */
    public GetFullNameResponse createGetFullNameResponse() {
        return new GetFullNameResponse();
    }

    /**
     * Create an instance of {@link GetFullName }
     * 
     */
    public GetFullName createGetFullName() {
        return new GetFullName();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFullNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.ws.stepsoln.com/", name = "getFullNameResponse")
    public JAXBElement<GetFullNameResponse> createGetFullNameResponse(GetFullNameResponse value) {
        return new JAXBElement<GetFullNameResponse>(_GetFullNameResponse_QNAME, GetFullNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFullName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.ws.stepsoln.com/", name = "getFullName")
    public JAXBElement<GetFullName> createGetFullName(GetFullName value) {
        return new JAXBElement<GetFullName>(_GetFullName_QNAME, GetFullName.class, null, value);
    }

}
