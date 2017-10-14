package midterms.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;





/**
 * Servlet implementation class PascualErnestEugeneLogin
 */
@WebServlet("/PascualErnestEugeneLogin")
public class PascualErnestEugeneLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PascualErnestEugeneLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String user = request.getParameter("user");
		String pass = request.getParameter("pass");

		int loginAttempt = 0;
		PrintWriter out = response.getWriter();
		if (user.equals("ernest") && pass.equals("pascual")) {
			out.println("Correct username and password!"
						+ "<br>LAUCSAP" 
						+ "<br> 09985379566"
						+ "<br> Taft Avenue, Malate Manila");
		}else {
			loginAttempt++;
			out.println("Incorrect username or password. Please try again");
					out.println("<br> Number of attempts: " + loginAttempt);
				    out.println("<a href=index.html>Back </a>");
			}
		}
		
	}


