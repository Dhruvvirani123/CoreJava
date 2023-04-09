package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.CartDao;
import Dao.ProductDao;
import Model.Product;
import Model.cart;

/**
 * Servlet implementation class cart
 */
@WebServlet("/cart")
public class CartController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CartController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		if (action.equalsIgnoreCase("addtocart")) {
			cart c = new cart();
			c.setCusid(Integer.parseInt(request.getParameter("cusid")));
			c.setPid(Integer.parseInt(request.getParameter("pid")));
			
			Product p = ProductDao.getProductByPid(Integer.parseInt(request.getParameter("pid")));
			c.setPname(p.getPname());
			c.setPprice(p.getPprice());
			c.setPqty(1);
			c.setPayment_status("pending");
			c.setTotal(p.getPprice());
			CartDao.insertcart(c);
			response.sendRedirect("customer-home.jsp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int cid = Integer.parseInt(request.getParameter("cid"));
		int pqty = Integer.parseInt(request.getParameter("pqty"));
		System.out.println(cid+" : "+pqty);
		cart c = CartDao.getCartBycid(cid);
		Product p = ProductDao.getProductByPid(c.getPid());
		int total = pqty * c.getPprice();
		cart c1 = new cart();
		c1.setCid(cid);
		c1.setPqty(pqty);
		c1.setTotal(total);
		CartDao.updatecart(c1);
		response.sendRedirect("customer-cart.jsp");
	}
}