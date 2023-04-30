package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.CustomerDao;
import Model.customermodel;

/**
 * Servlet implementation class CusstomerController
 */
@WebServlet("/CusstomerController")
public class CustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {{
			String action = request.getParameter("action");
			if (action.equalsIgnoreCase("register")) {
				customermodel c  = new customermodel();
				c.setUsername(request.getParameter("Username"));
				c.setPassword(request.getParameter("Password"));
				c.setConfirmPassword(request.getParameter("ConfirmPassword"));
				c.setEmailAdderss(request.getParameter("EmailAdderss"));
				CustomerDao.insertCustomer(c);
			}
		}
	}
}