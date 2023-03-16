package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Model.User;
import connectivity.DBconnection;


//Data Insert
public class UserDao {
	public static void insertUser(User d) {
		try {
			Connection connection = DBconnection.createConnection();
			String sql = "insert into user(name,contact,address,email,password) values(?,?,?,?,?)";
			PreparedStatement pst = connection.prepareStatement(sql);
			pst.setString(1, d.getName());
			pst.setLong(2, d.getContact());
			pst.setString(3, d.getAddress());
			pst.setString(4, d.getEmail());
			pst.setString(5, d.getPassword());
			pst.executeUpdate();
			System.out.println("Data inserted");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}  
	
	//Email Chaking
	public static Boolean checkEmail(String email) {
		boolean flag = false;
		try {
			Connection connection = DBconnection.createConnection();
			String sqlString = "select * from user where email=?";
			PreparedStatement pst = connection.prepareStatement(sqlString);
			pst.setString(1, email);
			ResultSet dv = pst.executeQuery();
			if(dv.next()) {
				flag = true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	
	public static User userlogin(User d) {
		User user = null;
		try {
			Connection connection = DBconnection.createConnection();
			String sqlString =  "select * from user where email=? and password=?";
			PreparedStatement pst = connection.prepareStatement(sqlString);
			pst.setString(1, d.getEmail());
			pst.setString(2, d.getPassword());
			ResultSet dv = pst.executeQuery();
			if(dv.next())
			{
				user = new User();
				user.setId(dv.getInt("id"));
				user.setName(dv.getString("name"));
				user.setContact(dv.getLong("contact"));
				user.setAddress(dv.getString("address"));
				user.setEmail(dv.getString("email"));
				user.setPassword(dv.getString("password"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}
	
	
	public static List<User> getallUsers() {
		List<User> list = new ArrayList<User>();
		try {
			Connection connection = DBconnection.createConnection();
			String sqlString = "select * from user";
			PreparedStatement pst= connection.prepareStatement(sqlString);
			ResultSet dv = pst.executeQuery();
			while(dv.next()) {
				User user = new User();
				user.setId(dv.getInt("id"));
				user.setName(dv.getString("name"));
				user.setContact(dv.getLong("contact"));
				user.setAddress(dv.getString("address"));
				user.setEmail(dv.getString("email"));
				user.setPassword(dv.getString("password"));
				list.add(user);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public static User getUserById(int id) {
		User user = null;
		try {
			
			Connection connection = DBconnection.createConnection();
			String sqlString = "select * from where id=?";
			PreparedStatement pst = connection.prepareStatement(sqlString);
			pst.setInt(1, id);
			ResultSet dv = pst.executeQuery();
			if(dv.next()) {
				user = new User();
				user.setId(dv.getInt("id"));
				user.setName(dv.getString("name"));
				user.setContact(dv.getLong("contact"));
				user.setAddress(dv.getString("address"));
				user.setEmail(dv.getString("email"));
				user.setPassword(dv.getString("password"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
		
	}
	
	//Data Upadate
	public static void updateUser(User u) {
		
		try {
			
			Connection connection = DBconnection.createConnection();
			String sqlString = "update user set name=?,contact=?,address=?,email=?,password=? where id=?";
			PreparedStatement pst= connection.prepareStatement(sqlString);
			pst.setString(1, u.getName());
			pst.setLong(2, u.getContact());
			pst.setString(3, u.getAddress());
			pst.setString(4, u.getEmail());
			pst.setString(5, u.getPassword());
			pst.setInt(6, u.getId());
			pst.executeQuery();
			System.out.println("Data Updated");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//Data Delete
	public static void deleteUser(int id) {
		try {	
			Connection connection = DBconnection.createConnection();
			String sqlString = "delete from user where id=?";
			PreparedStatement pst= connection.prepareStatement(sqlString);
			
			pst.setInt(1, id);
			pst.executeQuery();
			
			System.out.println("Data Deleted");
			
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
}