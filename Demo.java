package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo {
	
	public static void main(String[] args) {
		
		String URL="jdbc:mysql://localhost:3306/employee";
		String USERNAME="root";
		String PASSWORD="root";
		Connection con=null;
		Statement stmt=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver is loaded Successfully");
			
			con=DriverManager.getConnection(URL,USERNAME,PASSWORD);
			System.out.println("Connection is established");
			
			stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, 0);
			
			String query1="insert into emp(`id`,`name`, `desig`,`salary`) values('6','Sharat','Editor','20000')";
			String query2="insert into emp(`id`,`name`, `desig`,`salary`) values('7','Ravi','Trainer','25000')";
			String query3="insert into emp(`id`,`name`, `desig`,`salary`) values('8','Mallikarjun','Trainer','30000')";
			System.out.println("Query Executed success");
			stmt.addBatch(query1);
			stmt.addBatch(query2);
			stmt.addBatch(query3);
			int [] results=stmt.executeBatch();
			
			
		
		} catch (ClassNotFoundException e) {
			System.out.println("Driver not loaded Successfully");
		} catch(SQLException f) {
//			System.out.println("Connection not established");
			f.printStackTrace();
		} try {
			stmt.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
