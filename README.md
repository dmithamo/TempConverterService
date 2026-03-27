# Temperature Converter SOAP Service

A Java-based implementation of a SOAP (Simple Object Access Protocol) web service that converts temperatures between Fahrenheit and Celsius. This project is designed to emulate the structure and contract of the official W3Schools Temperature Convert Service.

## 🚀 Overview

This project demonstrates how to build a Contract-First web service using Jakarta XML Web Services (JAX-WS). Unlike REST APIs that use JSON, this service communicates using strictly defined XML "Envelopes" over HTTP.

## 📚 Key Terminology

### Term Definition

_XML_ - Extensible Markup Language. The data format used for all SOAP communication.

_SOAP_ - A strict protocol for exchanging structured information using an "Envelope" (Header + Body) structure.

_WSDL_ - Web Services Description Language. An XML document that acts as the "Instruction Manual" for the service, defining methods, inputs, and outputs.

_JAX-WS_ - Java API for XML Web Services. The standard Java library used to create and host SOAP services.

_Namespace_ - A unique URI (e.g., http://w3schools.com/xml/) used in XML to prevent tag name conflicts.

_Jakarta EE_ - The modern evolution of "Java EE." It provides the libraries needed for Web Services in Java 17+.

## Project structure

```bash
.
└── Makefile
└── target
    └── generated-sources
        └── annotations
    └── classes
        └── com
            └── tempconvert
                └── App.class
                └── TempConvert.class
    └── maven-status
        └── maven-compiler-plugin
            └── compile
                └── default-compile
                    └── inputFiles.lst
                    └── createdFiles.lst
└── pom.xml
└── README.md
└── request.xml
└── src
    └── test
        └── java
            └── com
                └── tempconvert
                    └── AppTest.java
    └── main
        └── java
            └── com
                └── tempconvert
                    └── TempConvert.java
                    └── App.java

19 directories, 11 files

```

# 🛠️ Installation & Running

1. Requirements

- JDK 17+

- Maven (CLI)

- Neovim (or any text editor)

2. Start the Service

- From the project root, run:

```bash
make run
```

- The service is now live. You can view the generated WSDL at:

```bash
http://localhost:8080/tempconvert?wsdl
```

# 🧪 How to Test

## Method A: Via SoapUI (GUI)

_SoapUI_ is the industry-standard tool for exploring and testing SOAP services.

- Create Project: Click File > New SOAP Project.

- Initial WSDL: Paste http://localhost:8080/tempconvert?wsdl.

- Generate Request: SoapUI will parse the WSDL and generate a sample XML request.

- Execute: Replace the ? with a number (e.g., 100) and click the Green Play Arrow.

<img width="1792" height="1162" alt="image" src="https://github.com/user-attachments/assets/25919903-42b8-49a5-afa0-ff298ced81f7" />


## Method B: Via CLI (The Raw "Wrapper" Method)

- Run the following commands:

```bash
make test-f # test convert to Fahrenheit to Celsius

make test-c # test convert Celsius to Fahrenheit
```

<img width="1680" height="405" alt="image" src="https://github.com/user-attachments/assets/0fa53338-3cab-43d7-b5b1-2d53b01ff03a" />

<img width="709" height="300" alt="image" src="https://github.com/user-attachments/assets/bca24ab9-8534-40cb-84d2-2c5b207b4dd7" />

