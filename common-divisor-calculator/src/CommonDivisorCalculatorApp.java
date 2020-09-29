
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
			int num1 = sc.nextInt();
			System.out.println("Enter second number");
			int num2 = sc.nextInt();

			while (num1 != num2) {
				if (num1 > num2)
					num1 = num1 - num2;
				else
					num2 = num2 - num1;
			}

			System.out.printf("GCD of the two numbers is: %d", num2);
			System.out.print("Continue? (y/n): ");
			choice = sc.next();
			System.out.println();
			System.out.println("Goodbye :)");
			sc.close();

		}

	}
}
