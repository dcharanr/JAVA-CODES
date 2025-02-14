package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class prepareStmt {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String url="jdbc:mysql://localhost:3306/employee";
		String username="root";
		String password="root";
		Connection con=null;
		PreparedStatement pstmt=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url,username,password);
			String query="INSERT INTO `emp`(id, name, desig, salary) VALUES (?, ?, ?, ?)";
			pstmt=con.prepareStatement(query);
			System.out.println("Enter Id:");
			int id=scan.nextInt();
			System.out.println("Enter Name:");
			String name=scan.next();
			System.out.println("Enter Desig:");
			String desig=scan.next();
			System.out.println("Enter Salary:");
			int salary=scan.nextInt();
			
			pstmt.setInt(1,id);
			pstmt.setString(2,name);
			pstmt.setString(3,desig);
			pstmt.setInt(4,salary);
			pstmt.executeUpdate();
			System.out.println("Query executed Sucess");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try 
		{
			pstmt.close();
			con.close();
			scan.close();
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}

}
