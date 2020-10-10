package db;

import java.io.*;

import java.nio.file.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import business.Actor;
import business.Movie;
import db.DAO;

public class MovieTextFile implements DAO<Movie> {
	private List<Movie> movies = null;
	private Path moviesPath = null;
	private File moviesFile = null;
	private final String FIELD_SEP = "\t";

	public MovieTextFile() { 
		moviesPath = Paths.get("movies.txt");
		moviesFile = moviesPath.toFile();
		movies = getAll();
	}

	@Override
	public Movie get(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	// get all products from text file if our list is null
	@Override
	public List<Movie> getAll() {
		if (movies != null) {
			return movies;
		}
		movies = new ArrayList<>();
		if (Files.exists(moviesPath)) {
			try (BufferedReader in = new BufferedReader(new FileReader(moviesFile))) {

				// read products from file into our list
				String line = in.readLine();
				while (line != null) {
					String[] fields = line.split(FIELD_SEP);
					String    movieID = Integer.parseInt(fields[0]);
					String movieTitle = fields[1];
					String movieGenre = fields[2];
					String dateReleased = fields[3];
					String rating = fields [4];
					int mID = Integer.parseInt(movieID);
					Movie m = new Movie(movieID, movieTitle, movieGenre, dateReleased, rating, mID);
					movies.add(m);
					line = in.readLine();
				}
			} catch (IOException ioe) {
				System.out.println(ioe);
				return null;
			}

		} else {
			System.out.println(moviesPath.toAbsolutePath() + " doesn't exist.");
			return null;
		}

		return movies;
	}

	@Override

	public boolean add(Movie m) {
		movies.add(m);
		return saveAll();
	}

	@Override
	public boolean update(Movie m) {
		// get old product and remove it
		Movie oldMovie = this.get(m.getMovieID());
		int i = movies.indexOf(oldMovie);
		movies.remove(i);
		movies.add(i, m);
		return saveAll();
	}

	@Override
	public boolean delete(Movie m) {
		movies.remove(m);
		return saveAll();
	}

	private boolean saveAll() {
		// after every maintenance (add, update, delete) function,
		// rewrite the text file
		try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(moviesFile)))) {
			// write all products in the list to the file
			for (Movie m : movies) {
				out.print(m.getMovieID() + FIELD_SEP);
				out.print(m.getMovieTitle() + FIELD_SEP);
				out.println(m.getMovieGenre());
				out.println(m.getDateReleased());
				out.println(m.getRating());
			}
			return true;
		} catch (IOException ioe) {
			System.out.println(ioe);
			return false;
		}
	}

	@Override
	public Movie get(String movieID) {
		// TODO Auto-generated method stub
		return null;
	}
}

	