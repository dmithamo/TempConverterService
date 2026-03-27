package com.tempconvert;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;

@WebService(serviceName = "TempConverterService", targetNamespace = "http://w3schools.com/xml/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class TempConvert {

    @WebMethod(operationName = "FahrenheitToCelsius")
    @WebResult(name = "FahrenheitToCelsiusResult")
    public double fahrenheitToCelsius(@WebParam(name = "Fahrenheit") double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    @WebMethod(operationName = "CelsiusToFahrenheit")
    @WebResult(name = "CelsiusToFahrenheitResult")
    public double celsiusToFahrenheit(@WebParam(name = "Celsius") double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}
