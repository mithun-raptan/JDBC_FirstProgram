package com.jsp.dynamicQueries;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class StaticQueryThroughPreparedStatement {
	
	
	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/jdbcMorningBatch","postgres","mithun");
			PreparedStatement psmt= con.prepareStatement("insert into emp values (120,'sheela','s@g.com',3456,'female',8812131393,23)");
			boolean b = psmt.execute(); // int n  = psmt.executeUpdate();
			System.out.println(b); // DML Queries ==> false
			con.close();
			
		}catch(Exception e) {}
	}

}
