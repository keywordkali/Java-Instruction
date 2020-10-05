import java.util.Scanner;

public class InputTestApp {

	public static void main(String[] args) {
		int num = 0;
		String strInput;
		boolean valid = false;
		// setup scanner
		Scanner in = new Scanner(System.in);
		// keep looping until valid input
		while (valid == false) {
			// prompt the user
			System.out.print("Enter an integer value: ");
			// grab input from keyboard
			strInput = in.nextLine();
			try {
				// try to convert String to int
				num = Integer.parseInt(strInput);
				valid = true;

			} catch (NumberFormatException e) {
				System.out.println("Error - enter an integer value.");
			}

		}

		// output the number entered by user
		System.out.println("You entered the number " + num);

	}

}
