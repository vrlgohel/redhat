package com.redhat.gss.wss;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.4.6-redhat-1
 * 2012-11-29T16:47:34.960+10:00
 * Generated source version: 2.4.6-redhat-1
 * 
 */
@WebService(targetNamespace = "http://wss.gss.redhat.com/", name = "SecureService")
@XmlSeeAlso({ObjectFactory.class})
public interface SecureService {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "sayGoodbye", targetNamespace = "http://wss.gss.redhat.com/", className = "com.redhat.gss.wss.SayGoodbye")
    @WebMethod
    @ResponseWrapper(localName = "sayGoodbyeResponse", targetNamespace = "http://wss.gss.redhat.com/", className = "com.redhat.gss.wss.SayGoodbyeResponse")
    public java.lang.String sayGoodbye(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "sayHello", targetNamespace = "http://wss.gss.redhat.com/", className = "com.redhat.gss.wss.SayHello")
    @WebMethod
    @ResponseWrapper(localName = "sayHelloResponse", targetNamespace = "http://wss.gss.redhat.com/", className = "com.redhat.gss.wss.SayHelloResponse")
    public java.lang.String sayHello(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );
}
