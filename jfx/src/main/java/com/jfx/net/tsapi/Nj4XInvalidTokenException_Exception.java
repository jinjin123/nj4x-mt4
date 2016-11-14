
package com.jfx.net.tsapi;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "Nj4xInvalidTokenException", targetNamespace = "http://ts.nj4x.com/")
public class Nj4XInvalidTokenException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private Nj4XInvalidTokenException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public Nj4XInvalidTokenException_Exception(String message, Nj4XInvalidTokenException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public Nj4XInvalidTokenException_Exception(String message, Nj4XInvalidTokenException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.jfx.net.tsapi.Nj4XInvalidTokenException
     */
    public Nj4XInvalidTokenException getFaultInfo() {
        return faultInfo;
    }

}