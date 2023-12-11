package th.ac.ku.eng.kps.cpe.lab1.model;

public class BookStore {
	private String title;
	private String author;
	private String category;
	private int year;
	private byte edition;
	private double price;
	
	public BookStore() {

	}
	public void setTitle(String string) {
		// TODO Auto-generated method stub
		title= string;
	}

	public void setAuthor(String string) {
		// TODO Auto-generated method stub
		author= string;
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
	public String getAuthor() {
		// TODO Auto-generated method stub
		return author;
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