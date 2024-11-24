package com.jsp.dynamicQueries;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementUpdate {
	
	public static void main(String[] args) {
		try {
			//load the Driver s/w
			Class.forName("org.postgresql.Driver");
			//create Connection object
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/jdbcMorningBatch","postgres","mithun");
			//create PreparedStatement object 
			PreparedStatement psmt=con.prepareStatement("update emp set name = ? where id = ? ");
			//set the dynamic data using setX(int placeholder, data)
			
			psmt.setString(1, "Paulabhijit");
			
			psmt.setInt(2, 103);
			
			//call specialized method for DML queries
			int n = psmt.executeUpdate();
			System.out.println(n);
			
			//close connection
			con.close();
		
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
