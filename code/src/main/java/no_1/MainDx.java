package no_1;

import java.io.File;
import java.io.IOException;

import javax.naming.spi.DirStateFactory.Result;
import javax.xml.transform.stream.StreamResult;

import org.xml.sax.SAXException;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.SchemaOutputResolver;

public class MainDx {
	public static void main(String[] args) throws JAXBException, SAXException,
	IOException {
	 JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
	 SchemaOutputResolver sor = new SchemaOutputResolver() {

	 public StreamResult createOutput(String namespaceURI, String
	suggestedFileName) throws IOException {
	 File file = new File("customer.xsd");
	 StreamResult result = new StreamResult(file);
	 result.setSystemId(file.toURI().toURL().toString());
	 return result;
	 }

	 };
	 jaxbContext.generateSchema(sor);
	}

}
