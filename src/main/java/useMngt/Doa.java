package useMngt;

import java.util.*;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Doa {
	//static Connection cn = null;

	static Connection cn;
	
	public static Connection connect(){
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		 cn = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/usermgt","root","");
		}catch(SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}

		return cn;
	}
	
	public int insert(user u) {
		int rs =0;
		String query = "INSERT INTO users(name,email,mobile,city,gender,dob)"
				+ "VALUES(?,?,?,?,?,?)";
		
		try {
			connect();
		PreparedStatement ps = cn.prepareStatement(query);
		
		ps.setString(1, u.getName());
		ps.setString(2, u.getEmail());
		ps.setString(3, u.getMobile());
		ps.setString(6, u.getDob());
		ps.setString(4, u.getCity());
		ps.setString(5, u.getGender());
		
		rs = ps.executeUpdate();ps.close();
	
		}catch(Exception e) {	
			e.printStackTrace();
		}

		return rs; 
	}
	
	public static List<user> getAll(){
		List<user> lu = new ArrayList<user>();
		
		String sql = "SELECT * FROM users;";
		
		try {
			connect();
		PreparedStatement ps = cn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
			user u = new user();
			
			u.setId(rs.getInt(1));
			u.setName(rs.getString(2));
			u.setEmail(rs.getString(3));
			u.setMobile(rs.getString(4));
			u.setDob(rs.getString(5));
			u.setCity(rs.getString(6));
			u.setGender(rs.getString(7));
			
			lu.add(u);
		}
		
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return lu;
		
	}
	
	public static int edit(user us) {
		int r = 0;
		String sql ="UPDATE users SET name=?,email=?, mobile=?,dob=?,"
				+ "city=?, gender=? where id=?;";
		
		try {
			connect();
			PreparedStatement ps = cn.prepareStatement(sql);
			
			ps.setString(1, us.getName());
			ps.setString(2, us.getEmail());
			ps.setString(3, us.getMobile());
			ps.setString(4, us.getDob());
			ps.setString(5, us.getCity());
			ps.setString(6, us.getGender());
			ps.setInt(7, us.getId());
			r=ps.executeUpdate();
		}catch(SQLException  e) {
			e.printStackTrace();
		}
		return r;
	}
	public static user  readUser(int id) {
		String sql ="SELECT * FROM users WHERE id=?;";
		user u = new user();
		
		try {
			connect();
			PreparedStatement ps = cn.prepareStatement(sql);
			ps.setInt(1,id);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				u.setId(rs.getInt(1));
				u.setName(rs.getString(2));
				u.setEmail(rs.getString(3));
				u.setMobile(rs.getString(4));
				u.setCity(rs.getString(5));
				u.setGender(rs.getString(6));
				u.setDob(rs.getString(7));
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}return u;
		
	}
	public static void delete(int id) {
		String sql = "DELETE FROM users WHERE id = ?;";
		
		try {
			connect();
			PreparedStatement ps = cn.prepareStatement(sql);
			ps.setInt(1,id);
			ps.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
