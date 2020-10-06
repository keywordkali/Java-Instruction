package ui;

import java.util.Arrays;

import business.Product;

//p357
public class ArrayDemoApp {

	public static void main(String[] args) {
		System.out.println("Hello");

	//array of ints
		int[] numbers = new int[5];
		numbers[0] = 5;
		numbers[1] = 10;
		numbers[2] = 15;
		numbers[3] = 20;
		numbers[4] = 25;
		
		for (int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
			System.out.println("Goodbye");	
		}
		//System.out.println(numbers[5]);//this throws an exception
	
	int[] randNbrs = new int[100];
	for (int i=0; i < randNbrs.length; i++) {
		int r = (int)(Math.random()*100)+1;
		randNbrs[i] = r;
	System.out.println(r);
	}
	//array of strings
	String[] names = {"Sean", "Jack", "Jonathan", "Ohmmaih", "Kali", "Tanya", "Hung"};
	
	for(int i=0; i<names.length;i++) {
		System.out.println(names[i]);
	}
	
	//array of products
	
	Product p1 = new Product("java", "Murach's Java", 57.50);
	Product p2 = new Product("mySQL", "Murach's mySQL", 52.50);
	Product p3 = new Product ("android", "Murach's Android", 59.00);
	Product [] products = {p1,p2,p3};
	
	//enhanced for loop p 360
		for (Product product: products) {
			System.out.println(product);
		}
	
		//arrays class 362
		// sort names
		Arrays.sort(names);
		for(String name: names) {
			System.out.println(name);
		}
		//binary search
		int position = Arrays.binarySearch(names, "Kali");
	
		//sort products
		Arrays.sort(products);
		for (Product p: products) {
			System.out.println(p);
		}
		
		System.out.println(position);
	System.out.println("bye");
		
	
	}

	
	
}
