package com.tempconvert;

import jakarta.xml.ws.Endpoint;

public class App {
  public static void main(String[] args) {
    String url = "http://localhost:8080/tempconvert";
    System.out.println("Service starting at: " + url + "?wsdl");

    Endpoint.publish(url, new TempConvert());
  }
}
