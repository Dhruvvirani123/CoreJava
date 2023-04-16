package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import com.mysql.cj.jdbc.JdbcConnection;
import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.Result;

import Model.cart;
import connection.DBConnection;

public class CartDao {
	public static void insertcart(cart c) {
		try {
			Connection conn = DBConnection.createConnection();
			String sql = "insert into cart(cusid,pid,pname,pprice,pqty,payment_status,total) values(?,?,?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, c.getCusid());
			pst.setInt(2, c.getPid());
			pst.setString(3, c.getPname());
			pst.setInt(4, c.getPprice());
			pst.setInt(5, c.getPqty());
			pst.setString(6, c.getPayment_status());
			pst.setInt(7, c.getTotal());
			pst.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}		
		public static List<cart> getCartByCusId(int id){
			List<cart> list = new ArrayList<cart>();
			try {
				Connection conn = DBConnection.createConnection();
				String sql = "select * from cart where cusid=?";
				PreparedStatement pst = conn.prepareStatement(sql);
				pst.setInt(1, id);
				ResultSet rs = pst.executeQuery();
				
				while(rs.next()) {
					cart c = new cart();
					c.setCid(rs.getInt("cid"));
					c.setCusid(rs.getInt("cusid"));
					c.setPid(rs.getInt("pid"));
					c.setPname(rs.getString("pname"));
					c.setPprice(rs.getInt("pprice"));
					c.setPqty(rs.getInt("pqty"));
					c.setPayment_status(rs.getString("payment_status"));
					c.setTotal(rs.getInt("total"));
					list.add(c);
				}
			} catch (Exception e) {
				e.printStackTrace(); 
			}
			return list;
		}
		
		public static cart getCartBycid(int cid) {
			cart c = null;
			try {
				Connection conn = DBConnection.createConnection();
				String sql = "select * from cart where cid=?";
				PreparedStatement pst = conn.prepareStatement(sql);
				pst.setInt(1, cid);
				ResultSet rs = pst.executeQuery();
				if (rs.next()) {
					c = new cart();
					c.setCid(rs.getInt("cid"));
					c.setCusid(rs.getInt("cusid"));
					c.setPid(rs.getInt("pid"));
				    c.setPname(rs.getString("pname"));
				    c.setPprice(rs.getInt("pprice"));
				    c.setPqty(rs.getInt("pqty"));
				    c.setPayment_status(rs.getString("payment_status"));
				    c.setTotal(rs.getInt("total"));
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return c;
		}
		
		public static void updatecart(cart c) {
			try {
				Connection conn = DBConnection.createConnection();
				String sql = "update cart set pqty=? where cid=?";
				PreparedStatement pst = conn.prepareStatement(sql);
				pst.setInt(1, c.getPqty());
				pst.setInt(2, c.getTotal());
				pst.setInt(3, c.getCid());
				pst.executeLargeBatch();
				System.out.println("cart Updated");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
}