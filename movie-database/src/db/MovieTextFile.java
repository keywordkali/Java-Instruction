package db;
import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;
import business.Movie;
import db.DAO;

public class MovieTextFile implements DAO<Movie> {
	private List<Movie> movie = null;
	private Path moviePath = null;
	private File movieFile = null;
	private final String FIELD_SEP = "\t";

	public MovieTextFile() {
		moviePath = Paths.get("movie.txt");
		movieFile = moviePath.toFile();
		movie = getAll();
	}

	public Movie get(int movieID) {
		// TODO Auto-generated method stub
		return null;
	}

	// get all products from text file if our list is null
	@Override
	public List<Movie> getAll() {
		if (movie != null) {
			return movie;
		}
		movie = new ArrayList<>();
		if (Files.exists(moviePath)) {
			try (BufferedReader in = new BufferedReader(new FileReader(movieFile))) {

				// read products from file into our list
				String line = in.readLine();
				while (line != null) {
					String[] fields = line.split(FIELD_SEP);
					int movieID = Integer.parseInt(fields[0]);
					String movieTitle = fields[1];
					String movieGenre = fields[2];
					String dateReleased = fields[3];
					String rating = fields[4];
					Movie m = new Movie(movieID, movieTitle, movieGenre, dateReleased, rating);
					movie.add(m);
					line = in.readLine();
				}
			} catch (IOException ioe) {
				System.out.println(ioe);
				return null;
			}

		} else {
			System.out.println(moviePath.toAbsolutePath() + " doesn't exist.");
			return null;
		}

		return movie;
	}

	@Override

	public boolean add(Movie m) {
		movie.add(m);
		return saveAll();
	}

	@Override
	public boolean update(Movie m) {
		// get old product and remove it
		Movie oldMovie = this.get(m.getMovieID());
		int i = movie.indexOf(oldMovie);
		movie.remove(i);
		movie.add(i, m);
		return saveAll();
	}

	@Override
	public boolean delete(Movie m) {
		movie.remove(m);
		return saveAll();
	}

	private boolean saveAll() {
		// after every maintenance (add, update, delete) function,
		// rewrite the text file
		try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(movieFile)))) {
			// write all products in the list to the file
			for (Movie m : movie) {
				out.print(m.getMovieID() + FIELD_SEP);
				out.print(m.getMovieTitle() + FIELD_SEP);
				out.print(m.getMovieGenre()+ FIELD_SEP);
				out.print(m.getDateReleased()+ FIELD_SEP);
				out.println(m.getRating());
			}
			return true;
		} catch (IOException ioe) {
			System.out.println(ioe);
			return false;
		}
	}

	@Override
	public List<Movie> findByLastName(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
