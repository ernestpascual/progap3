package benilde.jdbc;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

//  Name: Ernest Eugene Pascual Date: 10/28/2017
/**
 * Servlet implementation class ServletDBUtil
 */
@WebServlet("/ServletDBUtil")
public class ServletDBUtil extends HttpServlet {
	// create global variable for databse connection
	String JDBC_URL ="jdbc:sqlite:d:/sqlite/database.db";
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletDBUtil() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub\
		
		new org.sqlite.JDBC();
		try {
			Connection con = DriverManager.getConnection(JDBC_URL);
			String sql = "create table if not exists person(name text, address text, phone text);";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.executeUpdate();
			String vname = request.getParameter("name");
			String vadd = request.getParameter("add");
			String vphone = request.getParameter("phone");
			sql = "insert into person values (?,?,?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, vname);
			ps.setString(2, vadd);
			ps.setString(3, vphone);
			ps.executeUpdate();
			response.getWriter().println("Database has been closed..<br>");
			response.getWriter().println("Adding records..<br>");
			response.getWriter().println("Displaying records..<br>----------------------------<br><br>");
			
			sql = "select * from person";
			ps = con.prepareStatement(sql);
			// boolean term until there is next record. first location is 1
			ResultSet rst = ps.executeQuery();
			int i = 0; // initialize first because it's local
			while (rst.next()) {
				i++;
				String record = rst.getString(1);
				String radd = rst.getString(2);
				String rphone = rst.getString(3);
				
				response.getWriter().println("record " 
						+ i + ":<br>"+ "Name: " + record + "<br>"
						+  "Address: " +  radd + "<br>"
						+ "Phone: " + rphone + "<br>----------------------------<br><br>");
			}
			// close database
			con.close();
			// if successful
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
