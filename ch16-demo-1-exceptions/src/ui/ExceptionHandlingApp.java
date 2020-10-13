package ui;

import java.util.Scanner;

public class ExceptionHandlingApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello ");
		int number = 0;
		while(number!=99) {
			System.out.print("Enter a number: ");
			try {                     //the try and catch block keeps the code running
				number = sc.nextInt();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				sc.nextLine();
			}
			System.out.println("You entered: "+number);
			System.out.println();;
		}
		System.out.println("Goodbye");
		sc.close();
		
	

	}
}
