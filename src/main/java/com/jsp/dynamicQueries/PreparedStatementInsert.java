package com.jsp.dynamicQueries;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementInsert {
	
	public static void main(String[] args) {
		try {
			//load the Driver s/w
			Class.forName("org.postgresql.Driver");
			//create Connection object
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/jdbcMorningBatch","postgres","mithun");
			//create PreparedStatement object 
			PreparedStatement psmt=con.prepareStatement("insert into emp values (?,?,?,?,?,?,?),(?,?,?,?,?,?,?)");
			//set the dynamic data using setX(int placeholder, data)
			psmt.setInt(1, 103);
			psmt.setString(2, "abhijit");
			psmt.setString(3, "abhijit@gmail.com");
			psmt.setInt(4, 1254);
			psmt.setString(5, "male");
			psmt.setLong(6, 8439234567l);
			psmt.setInt(7, 23);
			
			psmt.setInt(8, 104);
			psmt.setString(9, "pradip");
			psmt.setString(10, "pradip@gmail.com");
			psmt.setInt(11, 9867);
			psmt.setString(12, "male");
			psmt.setLong(13, 437634567l);
			psmt.setInt(14, 23);


			

			
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
