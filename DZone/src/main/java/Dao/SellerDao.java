package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import Connecation.DBConnecation;
import Model.sellermodel;

public class SellerDao {
	public static void insertseller(sellermodel s) {
		try {
			Connection conn = DBConnecation.creConnection();
			String sql = "insert into seller(name,address,email,password,contact) values(?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, s.getName());
			pst.setString(2, s.getAddress());
			pst.setString(3, s.getEmail());
			pst.setString(4, s.getPassword());
			pst.setLong(5, s.getContact());
			pst.executeQuery();
			System.out.println("Data Inserted");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
