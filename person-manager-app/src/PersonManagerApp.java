
public class PersonManagerApp {
	public static void main(String[] args) {
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Welcome to the person manager app :) ");
			System.out.println(" ");
			System.out.print("Add Customer\n Add Employee \n Exit \n (1/2/3):");
			int dataType = 1;

			while (choice.equalsIgnoreCase("y")) {
				System.out.println();
				String firstName = Console.getString("Customer First name: ");
				String lastName = Console.getString("Customer Last name:  ");
				String number = Console.getString("Customer Number: ");

				System.out.println();
				// Contact.displayContact(); > can't call until I create an instance of it

				while (choice.equalsIgnoreCase("y")) {
					System.out.println();
					String employeFirstName = Console.getString("Employee first Name: ");
					String employeLastName = Console.getString("Employee Last Name:");
					String sSN = Console.getString("SSN: ");

					System.out.println();
					// Contact.displayContact(); > can't call until I create an instance of it
					// Movie.displayMovie();
					Employee e = new Employee(firstName, lastName, sSN);
					System.out.println(e.toString());
					System.out.println();

					choice = Console.getString("Continue?");
				}
				System.out.println("Bye");
			}

		}
	}
}



	


