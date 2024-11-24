package com.jsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionObject {
	
	public static void main(String[] args) {
		//load the driver 
		try {
			//1: load the driver
			Class.forName("org.postgresql.Driver");
			//2: create Connection object
			Connection	conn  = DriverManager.getConnection("jdbc:postgresql://localhost:5432/jdbcMorningBatch", "postgres", "mithun");
			System.out.println(conn);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
