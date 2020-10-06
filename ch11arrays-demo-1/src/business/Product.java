package business;

import java.text.NumberFormat;

//it's a pojo
public class Product implements Comparable {

	// fields / instance variables
	private String code;
	private String description;
	private double price;

	// constructor - empty/or default constructor
	public Product() {

	}
	//constructor - fully loaded constructor
	public Product(String code, String description, double price) {
		super(); // calls the parent class
		this.code = code; //"this." is reference to this particular class of code
		this.description = description;
		this.price = price;
	}

	public String getCode() {
		return code;
	}
	
	public void setCode(String inCode) {
		code = inCode; // in for input
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getPriceFormatted() {
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		return currency.format(price);
	}
	@Override
	public String toString() {
		return "Product [code=" + code + ", description=" + description + ", price=" + getPriceFormatted()
				+ "]";
	}
	@Override
	public int compareTo(Object o) {
		if (o instanceof Product) {
			Product p = (Product)o;
			return code.compareTo(p.getCode());
		}
		return 0;
		
	}
	
	
	

	
	
	
}
