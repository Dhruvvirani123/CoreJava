package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import Connecation.DBConnection;
import Model.wishlist;

public class WishListDao {

	public static void insertWIshList(wishlist w) {
		try {
			Connection conn = DBConnection.createConnection();
			String sql = "insert into wishlist(pid,cueid) val;ues(?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, w.getPid());
			pst.setInt(2, w.getCusid());
			pst.executeUpdate();
			System.out.println("Wishlist Added");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
