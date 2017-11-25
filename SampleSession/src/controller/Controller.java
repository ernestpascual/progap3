package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.User;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String user = request.getParameter("user");
		String page = request.getParameter("page");
		boolean valid = validate(user);
		HttpSession session = request.getSession();
		
		// tracker what to display, pass the validation at the first if condition
		if (valid && page != null && page.equals("main")) {
			// Type variable = constructror
			User vuser = new User();
			vuser.setUsername(user);
			// attribute name, variable assigned
			session.setAttribute("username", vuser);		
			RequestDispatcher rd = request.getRequestDispatcher("main.jsp");
			rd.forward(request, response);
		} else if (page != null && page.equals("page2")) {
			RequestDispatcher r2 = request.getRequestDispatcher("page2.jsp");
			r2.forward(request, response);
		}else if (page != null && page.equals("logout")) {
			if (session != null) session.invalidate();
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
		}
		else response.getWriter().append("Invalid User!");
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	public boolean validate (String user) {
		if (user !=null && user.equals("guest")) {
			return true;
		}
		return false;
	}

}
