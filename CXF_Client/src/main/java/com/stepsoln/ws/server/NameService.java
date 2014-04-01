
package com.stepsoln.ws.server;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebService(name = "NameService", targetNamespace = "http://server.ws.stepsoln.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface NameService {


    /**
     * 
     * @param lastName
     * @param firstName
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getFullName", targetNamespace = "http://server.ws.stepsoln.com/", className = "com.stepsoln.ws.server.GetFullName")
    @ResponseWrapper(localName = "getFullNameResponse", targetNamespace = "http://server.ws.stepsoln.com/", className = "com.stepsoln.ws.server.GetFullNameResponse")
    public String getFullName(
        @WebParam(name = "firstName", targetNamespace = "")
        String firstName,
        @WebParam(name = "lastName", targetNamespace = "")
        String lastName);

}