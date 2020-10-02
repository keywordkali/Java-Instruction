import java.util.Scanner;

public class ContactListApp {

	public static void main(String[] args) {

		System.out.println("Welcome to the Contact List App!");
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.println();
			String firstName = Console.getString("Enter first name: ");
			String lastName = Console.getString("Enter last name: ");
			String email = Console.getString("Enter email name: ");
			String phone = Console.getString("Enter phone name: ");

			System.out.println();
			// Contact.displayContact(); > can't call until I create an instance of it
			Contact c = new Contact(firstName, lastName, email, phone);
			System.out.println(c.displayContact());
			System.out.println();

			choice = Console.getString("Continue?");
		}
		System.out.println("Bye");
	}

}