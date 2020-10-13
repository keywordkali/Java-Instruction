package db;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import business.Movie;
	
	public class MovieDB implements DAO<Movie> {

		private Connection getConnection() throws SQLException {
			String dbURL = "jdbc:mysql://localhost:3306/bmdb";
			String username = "bmdb_user";
			String password = "sesame";

			Connection conn = DriverManager.getConnection(dbURL, username, password);
			return conn;
		}

		@Override
		public Movie get(int ID) {
			Movie m = null;
			String sql = "select * from movie where id = ?";

			try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
				ps.setInt(1, ID);
				ResultSet rs = ps.executeQuery();
				// we only expect one row
				if (rs.next()) {
					m = getMovieFromResultSet(rs);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return m;
		}

		@Override
		public boolean add(Movie m) {
			boolean success = false;
			String sql = "insert into movie values " + "(?,?,?,?,?)";

			try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
				ps.setInt(1, m.getMovieID());
				ps.setString(2, m.getMovieTitle());
				ps.setString(1, m.getDateReleased());
				ps.setString(1, m.getRating());
				ps.setString(1, m.getMovieGenre());
				ps.executeUpdate();
				success = true;
				
			} catch (SQLException e) {
				System.out.println("Error adding movie!");
				e.printStackTrace();
			}
			return success;
		}

		@Override
		public boolean update(Movie m) {
			boolean success = false;
			String sql = "update movie set " + 
						 " ID = ?," + 
						 " Title = ?," + 
						 " DateReleased = ?," + 
						 " rating = ? " + 
						 "Genre = ? " +
						 "  where id = ?";
			try (Connection conn = getConnection();
				 PreparedStatement ps = conn.prepareStatement(sql)) {
				
				ps.setString(1, m.getMovieTitle());
				ps.setString(2, m.getDateReleased());
				ps.setString(3, m.getMovieGenre());
				ps.setInt(4, m.getMovieID());
				ps.executeUpdate();
				success = true;
			} catch (SQLException e) {
				System.out.println("Error updating movie!");
				e.printStackTrace();
			}
			return success;
		}

		@Override
		public boolean delete(Movie m) {
			boolean success = false;
			String sql = "delete from movie"+
					"where id = ?";
			try (Connection conn = getConnection();
					 PreparedStatement ps = conn.prepareStatement(sql)) {
					ps.setInt(1, m.getMovieID());
					ps.executeUpdate();
					success = true;
				} catch (SQLException e) {
					System.out.println("Error deleting movie!");
					e.printStackTrace();
				}
				return success;
		
		}

		@Override
		public List<Movie> getAll() {
			List<Movie> movie = new ArrayList<>();

			String sql = "select * from movie;";
			try (Connection conn = getConnection();
					PreparedStatement ps = conn.prepareStatement(sql);
					ResultSet rs = ps.executeQuery(sql);) {
				// p681 - process result set
				while (rs.next()) {
					Movie m = getMovieFromResultSet(rs);
					movie.add(m);

				}

			} catch (SQLException e) {
				System.out.println("Error getting all movies!");
				e.printStackTrace();
				movie = null;
			}

			return null;
		}

		private Movie getMovieFromResultSet(ResultSet rs) throws SQLException {
			int   mID = rs.getInt(1);
			String t = rs.getString(2);
			String dr = rs.getString(3);
			String gn = rs.getString(4);
			String r = rs.getString(5);
			Movie m = new Movie(mID, t, dr, gn, r);
			return m;
			
		}

		@Override
		public List<Movie> findByLastName(String string) {
			// TODO Auto-generated method stub
			return null;
		}

	}


