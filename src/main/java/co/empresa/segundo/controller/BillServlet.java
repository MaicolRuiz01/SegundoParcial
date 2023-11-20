package co.empresa.segundo.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.empresa.segundo.dao.BillDao;
import co.empresa.segundo.model.Bill;


/**
 * Servlet implementation class BillServlet
 */
@WebServlet("/")
public class BillServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private BillDao billdao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BillServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		this.billdao = new BillDao();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action = request.getServletPath();
		try {
			switch (action) {
			case "/new":
				showNewForm(request, response);
				break;
			case "/insert":
				insertBill(request, response);
				break;
			case "/delete":
				eliminarBill(request, response);
				break;
			default:
				listarBill(request, response);
				break;
			}

		} catch (SQLException e) {
			// TODO: handle exception
			
		}
	}

	private void listarBill(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	private void eliminarBill(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id = Integer.parseInt(request.getParameter("id"));

		billdao.delete(id);

		response.sendRedirect("list");
		
	}

	private void insertBill(HttpServletRequest request, HttpServletResponse response)throws ServletException, ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		Date date = request.getParameter("date");
		int userid = request.getParameter("userid");
		int valor = request.getParameter("valor");
		int type = request.getParameter("type");
		
		Bill bill= new Bill( date, userid, valor,type);
		billdao.insert(bill);


		response.sendRedirect("list");
		
	}

	private void showNewForm(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher dispatcher = request.getRequestDispatcher("bill.jsp");
		dispatcher.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
