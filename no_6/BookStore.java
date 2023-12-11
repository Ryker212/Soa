package no_6;

import java.util.ArrayList;

public class BookStore {
	private String title;
	private ArrayList<String>  author = new ArrayList<String>();
	private String category;
	private int year;
	private byte edition;
	private double price;
	private int num = 0;
	
	public BookStore() {

	}
	public void setTitle(String string) {
		// TODO Auto-generated method stub
		title= string;
	}


	public void setCatagory(String string) {
		// TODO Auto-generated method stub
		category= string;
	}

	public void setEdition(byte b) {
		// TODO Auto-generated method stub
		edition= b;
	}

	public void setYear(int i) {
		// TODO Auto-generated method stub
		year= i;
	}

	public void setPrice(double d) {
		// TODO Auto-generated method stub
		price= d;
	}
	public String getTitle() {
		// TODO Auto-generated method stub
		return title;
	}
	

	public ArrayList<String> getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author.add(author);
	}
	public String getCategory() {
		// TODO Auto-generated method stub
		return category;
	}
	public int getYear() {
		// TODO Auto-generated method stub
		return year;
	}
	public double getPrice() {
		// TODO Auto-generated method stub
		return price;
	}
	public byte getEdition() {
		// TODO Auto-generated method stub
		return edition;
	}

}