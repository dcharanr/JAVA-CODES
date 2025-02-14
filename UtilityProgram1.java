package com.tap.UtilityProgram1;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UtilityProgram1 
{
	public static void dispaly(ResultSet resultSet) throws SQLException 
	{
		System.out.println("---------------------------------------------------------------------------------------------------------------------------");
		 System.out.println("E_ID"+"   |"+"E_FNAME     |"+"E_LNAME     |"+"E_EMAIL             |"+"E_PHONE_NO   |"+"HIRE_DATE    |"+"SALARY           |"+
					"COMMISSION_PCT  |"+"D_ID|");
		 System.out.println("---------------------------------------------------------------------------------------------------------------------------");
		 while(resultSet.next()) {
			 int id = resultSet.getInt("E_ID");
			 String E_FNAME = resultSet.getString("E_FNAME");
			 String E_LNAME = resultSet.getString("E_LNAME");
			 String E_EMAIL = resultSet.getString("E_EMAIL");
			 int E_PHONE_NO = resultSet.getInt("E_PHONE_NO");
			 String HIRE_DATE = resultSet.getString("HIRE_DATE");
			 float SALARY = resultSet.getFloat("SALARY");
			 float COMMISSION_PCT = resultSet.getFloat("COMMISSION_PCT");
			 int D_ID = resultSet.getInt("D_ID");
			 
			 System.out.printf("| %-4d | %-10s | %-10s | %-18s | %-10d | %-12s | %-15f | %-14f | %d | \n", id, E_FNAME, E_LNAME, 
					 E_EMAIL, E_PHONE_NO, HIRE_DATE, SALARY, COMMISSION_PCT, D_ID);
		 }
		 System.out.println("---------------------------------------------------------------------------------------------------------------------------");
		
		
	}

}
