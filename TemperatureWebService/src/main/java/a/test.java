package a;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;

import jakarta.xml.ws.Endpoint;
import jakarta.xml.ws.Service;
import th.ac.ku.kps.eng.cpe.soa.service.UnitConversion;
import th.ac.ku.kps.eng.cpe.soa.service.impl.UnitConversionImpl;

public class test{
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		 URL url = new URL("http://localhost:8080/UC?wsdl");
		 QName qname = new QName("http://impl.service.soa.cpe.eng.kps.ku.ac.th/",
				 "UnitConversionImplService");
				 Service service = Service.create(url, qname);
				 qname = new QName("http://impl.service.soa.cpe.eng.kps.ku.ac.th/",
				"UnitConversionImplPort");
				 UnitConversion uc = service.getPort(qname, UnitConversion.class);
				 System.out.printf("DC to DF: 37 DC = %f DF%n", uc.c2f(37.0));
				 System.out.printf("CM to IN: 10 CM = %f IN%n", uc.cm2in(10));
				 System.out.printf("DF to DC: 212 DF = %f DC%n", uc.f2c(212.0));
				 System.out.printf("IN to CM: 10 IN = %f CM%n", uc.in2cm(10));
				}
}
