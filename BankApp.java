package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String url="jdbc:mysql://localhost:3306/tap_bank";
		String username="root";
		String password="root";
		Connection con=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url,username,password);
			
			//Login Module
			System.out.println("<------Welcome to TapBank---->");
			System.out.println("Enter Account Number:");
			int acc_num=scan.nextInt();
			System.out.println("Enter Pin:");
			int pin=scan.nextInt();
			PreparedStatement pstmt1=con.prepareStatement("select * from account where acc_num=? and pin=?");
			pstmt1.setInt(1, acc_num);
			pstmt1.setInt(2, pin);
			ResultSet res1=pstmt1.executeQuery();
			res1.next();
			String name=res1.getString(2);
			int bal=res1.getInt(4);
			System.out.println("Welcome "+name);
			System.out.println("Available balance is:"+bal);
			
			//Transfer Module
			System.out.println("<--------Transfer Details:-------->");
			System.out.println("Enter the beneficiary account number");
			int bacc_num=scan.nextInt();
			System.out.println("Enter the transfer amount");
			int t_amount=scan.nextInt();
			con.setAutoCommit(false);
			Savepoint s=con.setSavepoint();
			PreparedStatement pstmt2=con.prepareStatement("update account set balance=balance - ? where acc_num= ?");
			pstmt2.setInt(1, t_amount);
			pstmt2.setInt(2, acc_num);
			pstmt2.executeUpdate();
			
			//
			System.out.println("<--------Incoming credit request---------->");
			System.out.println(name+"account no"+acc_num+"wants you transfer"+t_amount);
			System.out.println("Press Y to receive");
			System.out.println("Press N to reject");
			String choice=scan.next();
			if(choice.equals("Y")) {
				PreparedStatement pstmt3=con.prepareStatement("update account set balance=balance + ? where acc_num= ?");
				pstmt3.setInt(1, t_amount);
				pstmt3.setInt(2, bacc_num);
				pstmt3.executeUpdate();
				PreparedStatement pstmt4=con.prepareStatement("select * from account where acc_num= ?");
				pstmt4.setInt(1, bacc_num);
				ResultSet res2 = pstmt4.executeQuery();
				res2.next();
				System.out.println("Updated balance is: "+res2.getInt(4));
				
			}else {
				con.rollback(s);
				PreparedStatement pstmt5=con.prepareStatement("select * from account where acc_num= ?");
				pstmt5.setInt(1, bacc_num);
				ResultSet res2 = pstmt5.executeQuery();
				res2.next();
				System.out.println("Exsisting balance is: "+res2.getInt(4));
			}
			con.commit();
			scan.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
