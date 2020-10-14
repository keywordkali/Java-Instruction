package db;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import business.Actor;

public class ActorDB implements DAO<Actor> {

	private Connection getConnection() throws SQLException {
		String dbURL = "jdbc:mysql://localhost:3306/bmdb?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&useSSL=false";
		String username = "bmdb_user";
		String password = "sesame";

		Connection conn = DriverManager.getConnection(dbURL, username, password);
		return conn;
	}

	@Override
	public Actor get(int ID) {
		Actor a = null;
		String sql = "select * from actor where id = ?";

		try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setInt(1, ID);
			ResultSet rs = ps.executeQuery();
			// we only expect one row
			if (rs.next()) {
				a = getActorFromResultSet(rs);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return a;
	}

	@Override
	public boolean add(Actor a) {
		boolean success = false;
		String sql = "insert into actor values " + "(?,?,?,?,?)";

		try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
		
			ps.setString(2, a.getActorFirstName());
			ps.setString(1, a.getActorLastName());
			ps.setString(1, a.getActorGender());
			ps.setString(1, a.getActorBirthdate().toString());
			ps.executeUpdate();
			success = true;
			
		} catch (SQLException e) {
			System.out.println("Error adding actor!");
			e.printStackTrace();
		}
		return success;
	}

	@Override
	public boolean update(Actor a) {
		boolean success = false;
		String sql = "update actor set " + 
					 " firstName = ?," + 
					 " lastName = ?," + 
					 " gender = ?," + 
					 " birthdate = ?" + 
					 "  where id = ?";
		try (Connection conn = getConnection();
			 PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setString(1, a.getActorFirstName());
			ps.setString(2, a.getActorFirstName());
			ps.setString(3, a.getActorGender());
			ps.setString(4, a.getActorBirthdate().toString());
			ps.setInt(5, a.getActorID());
			ps.executeUpdate();
			success = true;
		} catch (SQLException e) {
			System.out.println("Error updating actor!");
			e.printStackTrace();
		}
		return success;
	}

	@Override
	public boolean delete(Actor a) {
		boolean success = false;
		String sql = "delete from actor "+
				"where id = ?";
		try (Connection conn = getConnection();
				 PreparedStatement ps = conn.prepareStatement(sql)) {
				ps.setInt(1, a.getActorID());
				ps.executeUpdate();
				success = true;
			} catch (SQLException e) {
				System.out.println("Error deleting actor!");
				e.printStackTrace();
			}
			return success;
	
	}

	@Override
	public List<Actor> getAll() {
		List<Actor> actor = new ArrayList<>();

		String sql = "select * from actor;";
		try (Connection conn = getConnection();
				PreparedStatement ps = conn.prepareStatement(sql);
				ResultSet rs = ps.executeQuery(sql);) {
			// p681 - process result set
			while (rs.next()) {
				Actor a = getActorFromResultSet(rs);
				actor.add(a);

			}
			

		} catch (SQLException e) {
			System.out.println("Error getting all actors!");
			e.printStackTrace();
			actor = null;
		}
		return actor;
	}
	
	private Actor getActorFromResultSet(ResultSet rs) throws SQLException {
		int actorID = rs.getInt(1);
		String fn = rs.getString(2);
		String ln = rs.getString(3);
		String g = rs.getString(4);
		String bdStr = rs.getString(5);
		LocalDate bd = LocalDate.parse(bdStr);
		Actor a = new Actor( fn, ln, g, bd);
		return a;
	}
	@Override
	public List<Actor> findByLastName(String lName) {
		List<Actor> actors = new ArrayList<>(); //p679
		String sql = "SELECT * FROM actor where LastName = ?";
		try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setString(1, lName);
			ResultSet rs = ps.executeQuery();
			while (rs.next()){
				Actor ac = getActorFromResultSet(rs);
				actors.add(ac);
			}
		} catch (SQLException e) {
			System.out.println("Error getting an actors!");
			e.printStackTrace();
		}
		return actors;
	}
}
