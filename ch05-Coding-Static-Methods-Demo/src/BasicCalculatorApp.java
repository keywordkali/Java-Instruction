import java.util.InputMismatchException;
import java.util.Scanner;

public class BasicCalculatorApp {
	public static void main(String[] args) {
//p.152
		printWelcomeMessage();

		Scanner sc = new Scanner(System.in);
		int nbr = getInt("How many times to print?", sc);
		printHello(nbr);
		int a = getInt("Enter a whole number:",sc);
		int b = getInt("Enter another whole number:",sc);
		System.out.println("Sum of"+ a +"+"+ b+"=" + sum(a, b));

		sc.close();

	}

	private static int getInt(String prompt, Scanner sc) {
		int nbr = 0;
		while (true) {
			try {

				System.out.println(prompt);
				nbr = sc.nextInt();
				break;
			} catch (InputMismatchException ime) {
				System.out.println("Error invalid number please try again\n");
				sc.nextLine(); // toclearbuffer
				continue;
			}
		}
		return nbr;
	}

// static method, no inputs and no return type
	private static void printWelcomeMessage() {
		System.out.println("Welcome to the basic Calculator App!");

	}

//an input and no return type 
	private static void printHello(int n) {
		// print hello 'n' times
		for (int i = 0; i <= n; i++) {
			System.out.println("Hello" + i);

		}

	}

// 2 inputs and a return type
// accept 2 ints, return sum
	private static int sum(int a, int b) {
		int sum = a + b;

		return sum;

	}

}
