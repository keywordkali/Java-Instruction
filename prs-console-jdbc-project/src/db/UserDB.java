package db;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import business.User;

public class UserDB implements DAO<User> {

	private Connection getConnection() throws SQLException {
		String dbURL = "jdbc:mysql://localhost:3306/bmdb?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&useSSL=false";
		String username = "bmdb_user";
		String password = "sesame";

		Connection conn = DriverManager.getConnection(dbURL, username, password);
		return conn;
	}

	@Override
	public User get(int ID) {
		User u = null;
		String sql = "select * from user where id = ?";

		try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setInt(1, ID);
			ResultSet rs = ps.executeQuery();
			// we only expect one row
			if (rs.next()) {
				u = getUserFromResultSet(rs);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return u;
	}

	@Override
	public boolean add(User u) {
		boolean success = false;
		String sql = "insert into actor values " + "(?,?,?,?,?)";

		try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
		
			ps.setString(2, u.getUserName());
			ps.setString(1, u.getPassword());
			ps.setString(1, u.getFirstName());
			ps.setString(1, u.getLastName().toString());
			ps.setString(1, u.getPhoneNumber());
			ps.setString(1, u.getEmail());
			ps.setBoolean(1,u.isReviewer());
			ps.setBoolean(1,u.isAdmin());
			
			ps.executeUpdate();
			success = true;
			
		} catch (SQLException e) {
			System.out.println("Error adding user!");
			e.printStackTrace();
		}
		return success;
	}

	@Override
	public boolean update(User u) {
		boolean success = false;
		String sql = "update user set " + 
					 " userName = ?," + 
					 " Password = ?," + 
					 " firstName = ?," + 
					 " lastName = ?" + 
					 " phoneNumber = ?" + 
					 " Email = ?" + 
					 " isReviewer = ?" + 
					 " isAdmin = ?" + 
					 "  where id = ?";
		
		try (Connection conn = getConnection();
			 PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setString(1, u.getUserName());
			ps.setString(2, u.getPassword());
			ps.setString(3, u.getFirstName());
			ps.setString(3, u.getLastName());
			ps.setString(3, u.getPhoneNumber());
			ps.setString(3, u.getEmail());
			ps.setBoolean(3, u.isReviewer());
			ps.setBoolean(3, u.isAdmin());
			ps.setInt(5, u.getId());
			ps.executeUpdate();
			success = true;
		} catch (SQLException e) {
			System.out.println("Error updating actor!");
			e.printStackTrace();
		}
		return success;
	}

	@Override
	public boolean delete(User u) {
		boolean success = false;
		String sql = "delete from user "+
				"where id = ?";
		try (Connection conn = getConnection();
				 PreparedStatement ps = conn.prepareStatement(sql)) {
				ps.setInt(1, u.getId());
				ps.executeUpdate();
				success = true;
			} catch (SQLException e) {
				System.out.println("Error deleting user!");
				e.printStackTrace();
			}
			return success;
	
	}

	@Override
	public List<User> getAll() {
		List<User> user = new ArrayList<>();

		String sql = "select * from user;";
		try (Connection conn = getConnection();
				PreparedStatement ps = conn.prepareStatement(sql);
				ResultSet rs = ps.executeQuery(sql);) {
			// p681 - process result set
			while (rs.next()) {
				User u = getUserFromResultSet(rs);
				user.add(u);

			}
			

		} catch (SQLException e) {
			System.out.println("Error getting all users!");
			e.printStackTrace();
			user = null;
		}
		return user;
	}
	
	private User getUserFromResultSet(ResultSet rs) throws SQLException {
		int userID = rs.getInt(1);
		String un = rs.getString(2);
		String ps = rs.getString(3);
		String fn = rs.getString(4);
		String ln = rs.getString(5);
		String pn = rs.getString(6);
		String em = rs.getString(7);
		Boolean ir = rs.getBoolean(8);
		Boolean ia = rs.getBoolean(9);
		//String bdStr = rs.getString(5);
		//LocalDate bd = LocalDate.parse(bdStr);
		 User u = new User(userID,un,ps,fn,ln,pn,em,ir,ia);
		return u;
	}
	@Override
	public List<User> findByLastName(String lName) {
		List<User> user = new ArrayList<>();
		String sql = "SELECT * FROM user where LastName = ?";
		try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setString(1, lName);
			ResultSet rs = ps.executeQuery();
			while (rs.next()){
				User u = getUserFromResultSet(rs);
				user.add(u);
			}
		} catch (SQLException e) {
			System.out.println("Error getting an actors!");
			e.printStackTrace();
		}
		return user;
	}
}
