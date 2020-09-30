
import java.util.Scanner;

public class CommonDivisorCalculatorApp {

	public static void main(String[] args) {
		// Lets take two numbers and find their GCD
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Welcome to the Common Divisor Calculator App!");
			System.out.println(" ");
			// get input from the user 2 numbers
			System.out.println("Enter first number");
			int x = sc.nextInt();
			System.out.println("Enter second number");
			int y = sc.nextInt();

			// while (num1 != num2) { //what I did
			// if (num1 > num2)
			// num1 = num1 - num2;
			// else
			// num2 = num2 - num1;
			// }
			while (x > 0) { // what we did in class
				while (y >= x) {
					y -= x;
				}
				int tempY = y;
				y = x;
				x = tempY;
			}

			System.out.printf("GCD of the two numbers is: " + y);
			System.out.println();
			System.out.print("Continue? (y/n): ");
			choice = sc.next();
			System.out.println();
			System.out.println("Goodbye :)");

		}
		sc.close();
	}
}
