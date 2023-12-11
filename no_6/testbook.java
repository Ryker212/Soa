package no_6;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;

import org.dom4j.Document;
import org.dom4j.DocumentFactory;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

public class testbook{
	public static void main(String[] args) throws Exception {
		BookStore a = new BookStore(); 
		  a.setTitle("Java For Dummies"); 
		  a.setAuthor("Tan Ah Teck"); 
		  a.setCatagory("Programming"); 
		  a.setYear(2009); 
		  a.setEdition((byte)0); 
		  a.setPrice(19.99); 
		 BookStore b = new BookStore();
		  b.setTitle("Java For Dummies"); 
		  b.setAuthor("Tan Ah Teck"); 
		  b.setCatagory("Programming"); 
		  b.setYear(2008); 
		  b.setEdition((byte)7); 
		  b.setPrice(25.99); 
		 BookStore c = new BookStore();
		  c.setTitle("The"); 
		  c.setAuthor("Tan Ah Teck");
		  c.setAuthor("Dis");
		  c.setAuthor("bst");
		  c.setCatagory("Programming"); 
		  c.setYear(2000); 
		  c.setEdition((byte)2); 
		  c.setPrice(25.99); 
		  
		  Document doc = DocumentFactory.getInstance()
					.createDocument();
				Element book = doc.addElement("book");
				book.addAttribute("ISBN"," 0123456001");
				Element elem1 = book.addElement("title");
				elem1.addText(a.getTitle());
				
				ArrayList<String> author_a = a.getAuthor();
				for(int i = 0;i < author_a.size();i++) {
					Element elem2 = book.addElement("author");
					elem2.addText(author_a.get(i));
				}
				Element elem3 = book.addElement("category");
				elem3.addText(a.getCategory());
				Element elem4 = book.addElement("year");
				elem4.addText(""+a.getYear());
				Element elem5 = book.addElement("edition");
				elem5.addText(""+a.getEdition());
				Element elem6 = book.addElement("price");
				elem6.addText(""+a.getPrice());
				
				Element book2 = doc.addElement("book1");
				book2.addAttribute("ISBN"," 0123456002");
				//Element elem7_2 = book.addElement("ISBN"," 0123456002");
				Element elem1_2 = book.addElement("title");
				elem1_2.addText(b.getTitle());
				
				ArrayList<String> author_b = b.getAuthor();
				for(int i = 0;i < author_b.size();i++) {
					Element elem2_2 = book.addElement("author");
					elem2_2.addText(author_b.get(i));
				}
				Element elem3_2 = book.addElement("category");
				elem3_2.addText(b.getCategory());
				Element elem4_2 = book.addElement("year");
				elem4_2.addText(""+b.getYear());
				Element elem5_2 = book.addElement("edition");
				elem5_2.addText(""+b.getEdition());
				Element elem6_2 = book.addElement("price");
				elem6_2.addText(""+b.getPrice());
				
			
				Element book3 = doc.addElement("book2");
				book3.addAttribute("ISBN"," 012345600444");
				//book.addAttribute("ISBN"," 0123456002333");
				//Element elem7_3 = book.addElement("ISBN"," 0123456002");
				Element elem1_3 = book.addElement("title");
				elem1_3.addText(c.getTitle());
				ArrayList<String> author_c = c.getAuthor();
				
				for(int i = 0;i < author_c.size();i++) {
					Element elem2_3 = book.addElement("author");
					elem2_3.addText(author_c.get(i));
				}
				Element elem3_3 = book.addElement("category");
				elem3_3.addText(c.getCategory());
				Element elem4_3 = book.addElement("year");
				elem4_3.addText(""+c.getYear());
				Element elem5_3 = book.addElement("edition");
				elem5_3.addText(""+c.getEdition());
				Element elem6_3 = book.addElement("price");
				elem6_3.addText(""+c.getPrice());
				
				
				FileOutputStream fos = new FileOutputStream("book.xml");
				OutputFormat format = OutputFormat.createPrettyPrint();
				XMLWriter writer = new XMLWriter(fos, format);
				writer.write(doc);
				writer.flush();
				writer.close();
				fos.close();
	   
	}
}