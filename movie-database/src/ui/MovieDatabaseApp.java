package ui;

import db.ActorDB;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import business.Actor;
import business.Movie;
import db.ActorTextFile;
import db.DAO;
import db.MovieTextFile;
import ui.console.Console;

public class MovieDatabaseApp {
	private static DAO<Actor> actorDAO = new ActorDB();
	private static DAO<Movie> movieDAO = new MovieTextFile();

	public static void main(String[] args) {

		// movies.add(new Movie(1, "Star Wars", "Sci-fi", "1977", "PG"));
		// movies.add(new Movie(2, "Star Trek", "Sci-fi", "1980", "G"));
		/// movies.add(new Movie(3, "Gone With The Wind", "Musical", "1960", "G")); //
		/// java needs to be told your adding
		// something new

		System.out.println("Welcome to the Movie Database App! ");
		int command = 0;

		while (command != 7) {
			System.out.println("Command Menu:");
			int response = Console.getInt("1-Add Actor\n 2-List Actors \n 3-Find Actor \n "
					+ "4- Find Actor by last name "+"5-Add Movie \n 6-List Movies \n 7-Find Movie \n 8-Delete Actor\n9-Exit ");
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
				Actor actor = new Actor( fn, ln, g, ld);
				if (actorDAO.add(actor)) {
					System.out.println("Actor added successfully!");
				} else {
					System.out.println("Issue adding actor.");
				}
				System.out.println();

				System.out.println("Actor Added!");
				System.out.println(actor.displayActor());
				System.out.println();
				break;

			case 2:
				// list actors
				System.out.println("List of all Actors:");
				for (Actor a : actorDAO.getAll()) {
					if (a != null) {
						System.out.println(a.displayActor());
					}
				}
				System.out.println();
				break;

			case 3:
				// find Actor
				System.out.println("Find an Actor by ID:");
				int a = Console.getInt("ID? ");
				Actor ac = actorDAO.get(a);
				if (ac != null) {
					System.out.println(ac.displayActor());
				}
				else {
					System.out.println("No actor found for id: "+a);
				}
				System.out.println();
				break;
				
			case 4:
				// find Actor for last name
				//prompt for last name
			////need method find by last name call list <Actor> actor.DB.FindByLastName(String lName)
				// - findByLastName - should be able to base this on getAll method
				// print the list of actors with the same last name
				System.out.println("Find all Actors with this last name:");
				String actorln = Console.getRequiredString("Last name? ");
				List<Actor> aln = actorDAO.findByLastName(actorln);
				System.out.println("Actors");
				for (Actor act : aln) {
					if (aln.size() == 0) {
						System.out.println("No actors with that last name "+aln);
					System.out.println(act.displayActor());
				}
				}
				System.out.println();
				break;

			case 5:
				// add Movies
				System.out.println("Add a Movie: ");
				int i = Console.getInt("Movie ID ");
				String t = Console.getLine("Title? ");
				String y = Console.getLine("Date Released");
				String r = Console.getLine("Rating? ");
				String gr = Console.getLine("Genre? ");

				Movie movie = new Movie(i, t, y, r, gr);
				if (movieDAO.add(movie)) {
					System.out.println("Movie added successfully!");
				} else {
					System.out.println("Issue adding movie.");
				}
				System.out.println();

				System.out.println("Movie Added!");
				System.out.println(movie.displayMovie());
				System.out.println();
				break;

			case 6:
				// list Movies
				System.out.println("List of all Movies");
				for (Movie m : movieDAO.getAll()) {
					if (m != null) {
						System.out.println(m.displayMovie());

					}
				}
				System.out.println();
				break;

			case 7:
				// find Movie
				System.out.println("**Not implemented yet**");
				// id = Console.getInt("Movie ID?");
				// for (Movie m : movies) {
				// if (m != null && m.getMovieID() == id) {
				// System.out.println("Movie Found!");
				// System.out.println(m.displayMovie());

				System.out.println();
				break;

			case 8:
				// delete an actor
				// prompt user for id to delete use console class
				// get the actor for that id / actorDAO.get
				// delete the actor /actorDAO.delete
				System.out.println("Delete an actor by ID");
		        int  actorID = Console.getInt("Enter Movie ID to delete it: ");
				
		      Actor act = actorDAO.get(actorID); {
				if (actorDAO != null) {
					boolean success = actorDAO.delete(act);
					if (success) {
						System.out.println(act.displayActor() + " has been deleted from the database.\n");
					} else {
						System.out.println("Error! Unable to delete actor.\n");
					}
				} else {
					System.out.println("No actor matches that ID.\n");
					break;
				}
			}

			case 9:
				// exit
				break;
			default:
				System.out.println("Invalid input. Please try again.");
				break;

			}

		}

	}
}
