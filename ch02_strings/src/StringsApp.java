import java.util.Scanner;

public class StringsApp {

	public static void main(String[] args) {
		String firstName = "Bob";
		String lastName = "Marley";
		int age = 36;
		String message = "";
		
	message = firstName;
		message = message + " ";
		message += lastName;
		message += " was "+age+" years old when he passed.";
		System.out.println(message);
		
		
		// create a scanner instance and get data from user
		Scanner sc = new Scanner(System.in);
		
		// get a String
		System.out.println("Enter a sentence: ");
		String sentence = sc.nextLine();
		
		// get an int
		System.out.println("Enter a int: ");
		int n = sc.nextInt();
		
		
		// get an int
		System.out.println("Enter a double: ");
		double d = sc.nextDouble();
		
		System.out.println(sentence);
		System.out.println(n);
		System.out.println(d);
		
		
		

	}

}
