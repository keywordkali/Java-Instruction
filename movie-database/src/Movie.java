
public class Movie {

	private String movieTitle; // define instance variables
	private String movieGenre;
	private String dateReleased;
	private String rating;

	public Movie() { // define empty constructor

		movieTitle = "";
		movieGenre = "";
		dateReleased = "";
		rating = "";
	}
	// define fully loaded constructor

	public void setmovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}

	public Movie(String movieTitle, String movieGenre, String dateReleased, String rating) {
		super();
		this.movieTitle = movieTitle;
		this.movieGenre = movieGenre;
		this.dateReleased = dateReleased;
		this.rating = rating;
	}
// define getters and setters

	public String getMovieTitle() {
		return movieTitle;
	}

	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}

	public String getMovieGenre() {
		return movieGenre;
	}

	public void setMovieGenre(String movieGenre) {
		this.movieGenre = movieGenre;
	}

	public String getDateReleased() {
		return dateReleased;
	}

	public void setDateReleased(String dateReleased) {
		this.dateReleased = dateReleased;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String displayMovie() {
		String str = "-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+\n";
		str += "-+-+-+-+-+-+-+-+-+-+-+-+-Movie-+-+-+-+-+-+-+-+-+-+-+-+-+\n";
		str += "-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+--+-+-\n";
		str += "Movie Title:\t\t" + movieTitle + "\n";
		str += "Movie Genre:\t\t" + movieGenre + "\n";
		str += "Date Released:\t\t" + dateReleased + "\n";
		str += "Rating:\t\t" + rating + "\n";
		str += "-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-\n";

		return str;

	}
}
