import java.util.Scanner;

public class IfStatementApp {

	public static void main(String[] args) {
		String color = "yellow";
		// if (color == "red") <<Dont do this
		if (color.equalsIgnoreCase("red"))
			System.out.println("color is red");
		System.out.println("hey there"); //part of if statement
		//the curly braces allow you to have multiple statements the below example only allows one statement
		
		{
			// this does something if the condition is met

		}
		if (color.equalsIgnoreCase("red"))
			System.out.println("color is red");
		System.out.println("hello"); //not part of if statement - will always execute
		
		int total = 100;
		if (total == 50) {
			System.out.println("toal is 50!");
		}
		else if (total > 50) {
			System.out.println("total is greater than 50");
		}
		else if (total < 50) {
			System.out.println("total is less than 50");
		}
		if (total >= 75) {
			System.out.println("total is greather than or equal to 75");
		}
		if (total <= 75) {
			System.out.println("total is less than or equal to 75");
		}
		if (total != 0) {
			System.out.println("total is not equal to 0!");
		}
		
		// traffic light example
		int distanceFromLight = 30; //yards from stop sign
		if (color.equalsIgnoreCase("red")) {
			System.out.println("Light is red stop");
		}
		else if (color.equalsIgnoreCase("green")) {
			System.out.println("light is green go");
		}
		
		else if (color.equalsIgnoreCase("yellow") && distanceFromLight > 30) {
			System.out.println("Light is yellow and far away slow down");
		}
		
		else if (color.equalsIgnoreCase("yellow") && distanceFromLight <= 30) {
			System.out.println("Light is yellow and close speed up or go");
		}
		
		else {  
			System.out.println("Error invalid light color");
		}
		
		// || or condition, p 123
		int favoriteNumber = 10;
		
		if (favoriteNumber == 10 || favoriteNumber == 11) {
			System.out.println("number is 10 or 11");
		}
		
		else {
			System.out.println("number is not 10 or 11");
		}
		
		//p 124 block scope
		// we want to add two numbers if favorite number is 10
		int n1=0;
		int n2=0;
		if (favoriteNumber == 10) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter 2 numbers on one line");
		 n1 = sc.nextInt();
		 n2 = sc.nextInt();
		}
		int sum = n1 + n2;
		System.out.println("sum = "+sum);
					
		}
		
			
		}
		
		
		
		
		
	


