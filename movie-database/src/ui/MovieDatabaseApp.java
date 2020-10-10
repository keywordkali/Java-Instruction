package ui;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import business.Actor;
import business.Movie;
import ui.console.Console;

public class MovieDatabaseApp {

	private static List<Movie> movies = new ArrayList<>(100); // movies and actors is the variable name

	private static List<Actor> actors = new ArrayList<>(100);

	public static void main(String[] args) {

		movies.add(new Movie(1, "Star Wars", "Sci-fi", "1977", "PG"));
		movies.add(new Movie(2, "Star Trek", "Sci-fi", "1980", "G"));
		movies.add(new Movie(3, "Gone With The Wind", "Musical", "1960", "G")); // java needs to be told your adding
																				// something new

//		actors.add(new Actor(1, "Mark", "Hamill", "M", LocalDate.parse("1951-09-25")));// actors and movies have to be plural because the
//																		// variable name is plural
//		actors.add(new Actor(2, "Whoopie ", "Goldberg", "F", "11-13-1955"));
//		actors.add(new Actor(3, "Clark", "Gable", "M", "02-01-1901"));

		int command = 0;

		while (command != 7) {
			System.out.println("Command Menu:");
			int response = Console.getInt("Add Actor\n Add Movie \n List Actors \n "
					+ "Find Actor \n List Movies \n Find Movie \n Exit \n (1/2/3/4/5/6/7):");
			System.out.println();

			switch (response) {
			case 1:

				System.out.println("Add an Actor: ");
				int id = Console.getInt("ID?");
				String fn = Console.getString("First Name?: ");
				String ln = Console.getString("Last Name?: ");
				String g = Console.getString("Gender?: ");
				String bd = Console.getString("Birth Date?: ");
				LocalDate ld = LocalDate.parse(bd);
				Actor actor = new Actor(id, fn, ln, g, ld);
				actors.add(actor);

				System.out.println("Actor Added!");
				System.out.println(actor.displayActor());
				System.out.println();
				break;

			case 2:
				// list actors
				System.out.println("List of all Actors:");
				for (Actor a : actors) {
					if (a != null) {
						System.out.println(a.displayActor());
					}
				}
				System.out.println();
				break;

			case 3:
				// find Actor
				System.out.println("Find an Actor by ID:");
				id = Console.getInt("Actor ID?");
				for (Actor a : actors) {
					if (a != null && a.getActorID() == id) {
						System.out.println("Actor Found!");
						System.out.println(a.displayActor());
						System.out.println();
					}
				}

				break;

			case 4:
				// add Movies
				System.out.println("Add a Movie: ");
				int i = Console.getInt("Movie ID ");
				String t = Console.getLine("Title? ");
				String y = Console.getLine("Date Released");
				String r = Console.getLine("Rating? ");
				String gr = Console.getLine("Genre? ");

				Movie movie = new Movie(i, t, y, r, gr);
				System.out.println(movie.displayMovie());
				System.out.println();
				break;

			case 5:
				// list Movies
				System.out.println("List of all Movies");
				for (Movie m : movies) {
					if (m != null) {
						System.out.println(m.displayMovie());

					}
				}
				System.out.println();
				break;

			case 6:
				// find Movie
				System.out.println("Find an Movie by ID:");
				id = Console.getInt("Movie ID?");
				for (Movie m : movies) {
					if (m != null && m.getMovieID() == id) {
						System.out.println("Movie Found!");
						System.out.println(m.displayMovie());

					}
				}

				System.out.println();
				break;
			case 7:
				// exit
				break;
			default:
				System.out.println("Invalid input. Please try again.");
				break;

			}

		}

	}
}
