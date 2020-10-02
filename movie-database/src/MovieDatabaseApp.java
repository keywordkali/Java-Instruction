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
		String movieTitle = Console.getString("Movie Title: ");
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
			Actor actor = new Actor (firstName, lastName, gender, birthdate);
			System.out.println(actor.displayActor());
			choice = Console.getString("Continue?(y/n)");
			
	 }
 
 }
	public static void savecode () {

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Welcome to the Movie Database! :) ");
			System.out.println(" ");
			 System.out.print("Add Actor\n Add Movie \n Exit \n (1/2/3):"); int dataType = 1;
					

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
				//Movie.displayMovie();
				Movie m = new Movie(movieTitle, movieGenre, dateReleased, rating);
				System.out.println(m.displayMovie());
				System.out.println();

				choice = Console.getString("Continue?");
			}
			System.out.println("Bye");
		}

	}
}

/*
 * while (choice.equalsIgnoreCase("y")) {
 * System.out.println("Welcome to the Movie Database! :) ");
 * System.out.println(" ");
 * 
 * System.out.print("Add Actor\n Add Movie \n Exit \n (1/2/3):"); int dataType =
 * sc.nextInt();
 * 
 * if (dataType == 1) { sc.nextLine(); System.out.println("Actor First name: ");
 * String actorFirstName = sc.nextLine();
 * System.out.println("Actor Last name: "); String actorLastName =
 * sc.nextLine(); System.out.println("Actor Gender: "); String actorGender =
 * sc.nextLine(); System.out.println("Actor Birthday: "); String actorBirthdate
 * = sc.nextLine(); String message = "Actor First name:\n "+actorFirstName+"\n"+
 * " Actors Last name:\n "+actorLastName+"\n"+
 * " Actor Gender: \n"+actorGender+"\n"+ " Actor Birthdate:\n "+actorBirthdate;
 * System.out.println(message); continue; }
 * 
 * else if (dataType == 2) { sc.nextLine(); System.out.println("Title: ");
 * String movieTitle = sc.nextLine(); sc.nextLine();
 * System.out.println("Genre: "); String movieGenre = sc.nextLine();
 * sc.nextLine(); System.out.println("Date Released: "); String dateReleased =
 * sc.nextLine(); sc.nextLine(); System.out.println("Rating: "); String
 * movieRating = sc.nextLine(); sc.nextLine(); String message =
 * movieTitle+"\n"+"Genre: "+"\n"+
 * "Was made in: "+dateReleased+"\n"+movieRating; System.out.println(message);
 * continue; //String message = movieTitle+"\n"+movieRating+"\n"+
 * "Was made in: "+dateReleased+"\n"+"Genre: "+movieGenre; } if (dataType == 3)
 * { System.out.println("Goodbye ");
 * 
 * 
 * }
 * 
 * } sc.close();
 * 
 * } }
 */