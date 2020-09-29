import java.util.Scanner;

public class MenuDemoApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Calculator App!");
		Scanner sc = new Scanner(System.in);
		/*
		 * provide addition, subtraction functions
		 */
		String command = "";
		while (!command.equalsIgnoreCase("x")) {
			System.out.println("Command Menu:");
			System.out.println("=====================");
			System.out.println("+ : Addition");
			System.out.println("+ : Subtration");
			System.out.println("+ : Exit App");
			System.out.println();
			System.out.println("Enter command: ");
			command = sc.next();
			int n1 = 0;
			int n2 = 0;
			int result = 0;
			switch (command) {
			case "+":
				System.out.println("Addition:");
				System.out.println("Enter 2 numbers");
				n1 = sc.nextInt();
				n2 = sc.nextInt();
				result = n1 + n2;
				System.out.println("Result:"+result);
				break;
			case "-":
				System.out.println("Subtraction:");
				System.out.println("Enter 2 numbers");
				n1 = sc.nextInt();
				n2 = sc.nextInt();
				result = n1 - n2;
				System.out.println("Result:"+result);
				break;
			case "x":
			case "X":
				// exit
				break;
			default:
				System.out.println("Invalid Entry");
				break;
				

			}

		}

		System.out.println("Bye");
	}

}
