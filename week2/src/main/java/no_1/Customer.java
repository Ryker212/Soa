package no_1;
import java.util.ArrayList;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement 
public class Customer {
		private String name ;
		ArrayList<Phonenumber> phone;
		
		public Customer() {
		this.phone = new ArrayList();
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
		@XmlElement(name="phone-number") 
		public ArrayList<Phonenumber> getPhoneNumbers()
		{
			return this.phone;
		}
}
