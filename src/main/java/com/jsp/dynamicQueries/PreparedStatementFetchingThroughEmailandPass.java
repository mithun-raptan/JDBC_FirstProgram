package com.jsp.dynamicQueries;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStatementFetchingThroughEmailandPass {
	

	public static void main(String[] args) {
		try {
			//load the Driver s/w
			Class.forName("org.postgresql.Driver");
			//create Connection object
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/jdbcMorningBatch","postgres","mithun");
			//create PreparedStatement object 
			PreparedStatement psmt=con.prepareStatement("select * from emp");
			
			//call specialized method for DML queries
			ResultSet rs= psmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+ " " + rs.getLong(6));
			}
			
			//close connection
			con.close();
		
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
