package com.jsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class executeUpdate_Method_Update {

	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/jdbc_mypractice", "postgres", "mithun");
			Statement stmt = con.createStatement();
			int n = stmt.executeUpdate("update bankdetails set nominee = 'apaul' where account_number=103");
			System.out.println(n);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
				
}
