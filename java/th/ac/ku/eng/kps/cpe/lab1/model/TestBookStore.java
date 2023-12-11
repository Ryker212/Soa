package th.ac.ku.eng.kps.cpe.lab1.model;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.dom4j.Document;
import org.dom4j.DocumentFactory;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

public class TestBookStore {
	public static void main(String[] args) throws Exception {
		BookStore b = new BookStore(); 
		  b.setTitle("Java For Dummies"); 
		  b.setAuthor("Tan Ah Teck"); 
		  b.setCatagory("Programming"); 
		  b.setYear(2009); 
		  b.setEdition((byte)7); 
		  b.setPrice(19.99); 
		  
		  Document doc = DocumentFactory.getInstance()
					.createDocument();
				Element book = doc.addElement("book");
				book.addAttribute("ISBN"," 0123456001");
				Element elem1 = book.addElement("title");
				elem1.addText(b.getTitle());
				Element elem2 = book.addElement("author");
				elem2.addText(b.getAuthor());
				Element elem3 = book.addElement("category");
				elem3.addText(b.getCategory());
				Element elem4 = book.addElement("year");
				elem4.addText(""+b.getYear());
				Element elem5 = book.addElement("edition");
				elem5.addText(""+b.getEdition());
				Element elem6 = book.addElement("price");
				elem6.addText(""+b.getPrice());
				
				
				FileOutputStream fos = new FileOutputStream("book.xml");
				OutputFormat format = OutputFormat.createPrettyPrint();
				XMLWriter writer = new XMLWriter(fos, format);
				writer.write(doc);
				writer.flush();
				writer.close();
				fos.close();
	   
	}
}
