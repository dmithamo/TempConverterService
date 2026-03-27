# Variables
URL=http://localhost:8080/tempconvert
WSDL=$(URL)?wsdl
MAIN_CLASS=com.tempconvert.App

.PHONY: run test-f test-c clean help

help:
	@echo "Usage:"
	@echo "  make run      - Compile and start the SOAP server"
	@echo "  make test-f   - Send a FahrenheitToCelsius request via curl"
	@echo "  make test-c   - Send a CelsiusToFahrenheit request via curl"
	@echo "  make clean    - Remove compiled target files"

run:
	mvn compile exec:java -Dexec.mainClass="$(MAIN_CLASS)"

test-f:
	@echo "Sending FahrenheitToCelsius Request..."
	curl -s -X POST \
		-H "Content-Type: text/xml; charset=utf-8" \
		-H "SOAPAction: \"\"" \
		-d @request.xml \
		$(URL) | xmllint --format -

test-c:
	@echo "Sending CelsiusToFahrenheit Request (37.78C)..."
	@echo '<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:web="http://w3schools.com/xml/"><soapenv:Header/><soapenv:Body><web:CelsiusToFahrenheit><Celsius>37.78</Celsius></web:CelsiusToFahrenheit></soapenv:Body></soapenv:Envelope>' > temp_req.xml
	curl -s -X POST \
		-H "Content-Type: text/xml; charset=utf-8" \
		-H "SOAPAction: \"\"" \
		-d @temp_req.xml \
		$(URL) | xmllint --format -
	@rm temp_req.xml

clean:
	mvn clean
