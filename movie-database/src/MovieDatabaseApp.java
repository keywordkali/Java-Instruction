import java.util.Scanner;

public class MovieDatabaseApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Movie Database! :) ");
		System.out.println(" ");
		int response = Console.getInt("Add Actor\n Add Movie \n Exit \n (1/2/3):");
		while (response != 3) {
			switch (response) {
			case 1:
				addActor();

				break;
			case 2:
				addMovie();

			}

			System.out.print("Add Actor\n Add Movie \n Exit \n (1/2/3):");
			response = Console.getInt("1,2,3");
		}

	}

	public static void addMovie() {

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.println();
			String movieTitle = Console.getLine("Movie Title: ");
			String movieGenre = Console.getString("Movie Genre: ");
			String dateReleased = Console.getString("Date Released: ");
			String rating = Console.getString("Rating:");
			System.out.println();
			Movie movie = new Movie(movieTitle, movieGenre, dateReleased, rating);
			System.out.println(movie.displayMovie());
			choice = Console.getString("Continue?(y/n)");

		}

	}

	public static void addActor() {

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.println();
			String firstName = Console.getString("Actor First name: ");
			String lastName = Console.getString("Actor Last name ");
			String gender = Console.getString("Actor Gender: ");
			String birthdate = Console.getString("Actor Birthdate:");
			System.out.println();
			Actor actor = new Actor(firstName, lastName, gender, birthdate);
			System.out.println(actor.displayActor());
			choice = Console.getString("Continue?(y/n)");

		}

	}

	public static void savecode() {

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Welcome to the Movie Database! :) ");
			System.out.println(" ");
			System.out.print("Add Actor\n Add Movie \n Exit \n (1/2/3):");
			int dataType = 1;

			while (choice.equalsIgnoreCase("y")) {
				System.out.println();
				String firstName = Console.getString("Actor First name: ");
				String lastName = Console.getString("Actor Last name ");
				String gender = Console.getString("Actor Gender: ");
				String birthdate = Console.getString("Actor Birthdate:");

				System.out.println();
				// Contact.displayContact(); > can't call until I create an instance of it
				Actor.displayActor();
				Actor a = new Actor(firstName, lastName, gender, birthdate);
				System.out.println(a.displayActor());
				System.out.println();

				choice = Console.getString("Continue?");
			}
			while (choice.equalsIgnoreCase("y")) {
				System.out.println();
				String movieTitle = Console.getString("Movie Title: ");
				String movieGenre = Console.getString("Movie Genre: ");
				String dateReleased = Console.getString("Date Released: ");
				String rating = Console.getString("Rating:");

				System.out.println();
				// Contact.displayContact(); > can't call until I create an instance of it
				// Movie.displayMovie();
				Movie m = new Movie(movieTitle, movieGenre, dateReleased, rating);
				System.out.println(m.displayMovie());
				System.out.println();

				choice = Console.getString("Continue?");
			}
			System.out.println("Bye");
		}

	}
}

