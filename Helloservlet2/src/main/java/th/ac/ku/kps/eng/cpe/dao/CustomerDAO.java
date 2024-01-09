package th.ac.ku.kps.eng.cpe.dao;

import java.util.ArrayList;

import th.ac.ku.kps.eng.cpe.entity.Customer;

public class CustomerDAO {

	public CustomerDAO() {
		
	}
	public static ArrayList<Customer> getAllCustomer() {
		ArrayList<Customer> listOfCustomers = new ArrayList<>();
		Customer c1 = new Customer("Best");
		Customer c2 = new Customer("thar");
		listOfCustomers.add(c1);
		listOfCustomers.add(c2);
		return listOfCustomers;
	}
}
