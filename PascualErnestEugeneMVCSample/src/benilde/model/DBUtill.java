package benilde.model;
import java.sql.*;


public class DBUtill {
	String JDBC_URL ="jdbc:sqlite:d:/sqlite/database.db";
	// interface con, ps
	Connection con; PreparedStatement ps;
	public void createTable(String tableName, String fname, String pass) {
		String sql = "create table if not exists " + tableName + " ("+ fname +", "+ pass +");";
		try {
			ps = con.prepareStatement(sql);
			ps.executeUpdate();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	public void insertRecord(String tableName, String value, String pass) {
		String sql = "insert into " + tableName + " values (?,?);";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, value);
			ps.setString(2, pass);
			ps.executeUpdate();
		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public void init() {
		new org.sqlite.JDBC();
		try {
			con = DriverManager.getConnection(JDBC_URL);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public boolean validate(String user, String pass) {
		String sql= "select * from loginB where user = ? and pass = ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, user);
			ps.setString(2, pass);
			ResultSet rst = ps.executeQuery();
			if(rst.next()) return true; else return false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return true;
		
	}
	public static void main(String[] args) {
		DBUtill util = new DBUtill();
		// ctrl + shift + / -- auto comment
		util.init();
		util.insertRecord("loginB", "bubbles", "pass");
		util.insertRecord("loginB", "buttercup", "word");
		System.out.println("valid?" + util.validate("bubbles", "pass"));
		System.out.println("valid?" + util.validate("blos", "no"));
		try {
			util.con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
