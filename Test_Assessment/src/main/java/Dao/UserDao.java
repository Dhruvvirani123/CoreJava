package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Connection.DBConnection;
import Model.User;

public class UserDao {
	public static void insertPatient(User p) {
		try {
			Connection conn = DBConnection.createConnection();
			String sql = "insert into Test (FirstName, Lastname, Gender, Address, Mobile, Email, Password) values (?,?,?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);

			pst.setString(1, p.getFisrtName());
			pst.setString(2, p.getLastName());
			pst.setString(3, p.getGender());
			pst.setString(4, p.getAddress());
			pst.setLong(5, p.getMobile());
			pst.setString(6, p.getEmail());
			pst.setString(7, p.getPassword());

			pst.executeUpdate();
			System.out.println("Data Inserted Succesfully.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static User loginPatient(User p) {
		User p1 = null;
		try {
			Connection conn = DBConnection.createConnection();
			String sql = "select * from Test where Email = ? and Password = ?";
			PreparedStatement pst = conn.prepareStatement(sql);

			pst.setString(1, p.getEmail());
			pst.setString(2, p.getPassword());

			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				p1 = new User();
				p1.setID(rs.getInt("ID"));
				p1.setFisrtName(rs.getNString("FirstName"));
				p1.setLastName(rs.getString("LastName"));
				p1.setGender(rs.getString("Gender"));
				p1.setAddress(rs.getString("Address"));
				p1.setMobile(rs.getLong("Mobile"));
				p1.setEmail(rs.getString("Email"));
				p1.setPassword(rs.getString("Password"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return p1;
	}

	public static void updateProfile(User p) {
		try {
			Connection conn = DBConnection.createConnection();
			String sql = "update Test set FirstName=?, LastName=?, Gender=?, Address=?, Mobile=?, Email = ? where ID= ?";
			PreparedStatement pst = conn.prepareStatement(sql);

			pst.setString(1, p.getFisrtName());
			pst.setString(2, p.getLastName());
			pst.setString(3, p.getGender());
			pst.setString(4, p.getAddress());
			pst.setLong(5, p.getMobile());
			pst.setString(6, p.getEmail());
			pst.setInt(7, p.getID());

			pst.executeUpdate();
			System.out.println("Data Updated Succesfully.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static boolean checkOldPassword(int ID, String OP) {
		boolean flag = false;
		try {
			Connection conn = DBConnection.createConnection();
			String sql = "select * from Test where ID=? and Password =?";
			PreparedStatement pst = conn.prepareStatement(sql);

			pst.setInt(1, ID);
			pst.setString(2, OP);

			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				flag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

	public static void changePassword(int ID, String NP) {
		try {
			Connection conn = DBConnection.createConnection();
			String sql = "update Test set Password = ? where ID = ?";
			PreparedStatement pst = conn.prepareStatement(sql);

			pst.setString(1, NP);
			pst.setInt(2, ID);
			pst.executeUpdate();
			System.out.println("Password Changed.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static boolean checkEmail(String Email) {
		boolean flag = false;
		try {
			Connection conn = DBConnection.createConnection();
			String sql = "select * from Test where Email=?";
			PreparedStatement pst = conn.prepareStatement(sql);

			pst.setString(1, Email);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				flag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

	public static void changeNewPassword(String Email, String NP) {
		try {
			Connection conn = DBConnection.createConnection();
			String sql = "update Test set Password =? where Email = ?";
			PreparedStatement pst = conn.prepareStatement(sql);

			pst.setString(1, NP);
			pst.setString(2, Email);

			pst.executeUpdate();
			System.out.println("Password Changed Succesfully.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
