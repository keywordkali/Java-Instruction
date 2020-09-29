import java.util.Scanner;

public class MovieDatabaseApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Welcome to the Movie Database! :) ");
			System.out.println(" ");

			System.out.print("Add Actor\n Add Movie \n Exit \n (1/2/3):");
			int dataType = sc.nextInt();

			if (dataType == 1) {
				sc.nextLine();
				System.out.println("Actor First name: ");
				String actorFirstName = sc.nextLine();
				System.out.println("Actor Last name: ");
				String actorLastName = sc.nextLine();
				System.out.println("Actor Gender: ");
				String actorGender = sc.nextLine();
				System.out.println("Actor Birthday: ");
				String actorBirtdate = sc.nextLine();
				String message = "Actor First name" + "Actors Last name" + "Actor Gender" + "Actor Birthdate";
				System.out.println(message);
				continue;
			}

			else if (dataType == 2) {
				sc.nextLine();
				System.out.println("Title: ");
				String movieTitle = sc.nextLine();
				System.out.println("Genre: ");
				String movieGenre = sc.nextLine();
				System.out.println("Date Released: ");
				int dateReleased = sc.nextInt();
				sc.nextLine();
				String movieRating = sc.nextLine();
				System.out.println("Rating: ");
				String message = movieTitle + movieGenre + dateReleased + movieRating;
				System.out.println(message);
				continue;
			}
			if (dataType == 3) {
				System.out.println("Goodbye ");
				continue;

			}

		}
		sc.close();

	}
}
