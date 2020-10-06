package ui;

import business.Product;
import ui.console.Console;

public class ProductFinderApp {
	private static Product[] products = new Product[3];

	public static void main(String[] args) {
		System.out.println("hi");

		// initialize an array of products

		products[0] = new Product("java", "Murach's Java", 57.5);
		products[1] = new Product("mySQL", "Murach's mySQL", 54.5);
		products[2] = new Product("andriod", "Murach's Andriod", 59.5);

		String code = "";
		while (!code.equalsIgnoreCase("x")) {
			System.out.println("Search for a product: ");
			code = Console.getString("Enter code: ");
			Product p = getProduct(code);
			if (p != null) {
				System.out.println("Product Found:" + p);
			} else {
				System.out.println("No product found for code.");
			}
		}

	}

	private static Product getProduct(String code) { // use this for bmbd
		Product p = null;

		// loop through my array of products and find the one whose code matches the
		// code entered by the user
		for (Product product : products) {
			if (product.getCode().equalsIgnoreCase(code)) {
				p = product;
				break;
			}
		}

		return p;

	}
}