package com.tempconvert;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class TempConvert {

    @WebMethod
    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    @WebMethod
    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}
