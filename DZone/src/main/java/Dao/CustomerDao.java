package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import Connecation.DBConnecation;
import Model.customermodel;

public class CustomerDao {

	public static void insertCustomer(customermodel c) {
		try {
			Connection conn = DBConnecation.creConnection();
			String sql = "insert into customer_register(Username,Password,RepeatPassword,Email) values(?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, c.getUsername());
			pst.setString(2, c.getPassword());
			pst.setString(3, c.getConfirmPassword());
			pst.setString(4, c.getEmailAdderss());
			pst.executeUpdate();
			System.out.println("Data Inserted");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}