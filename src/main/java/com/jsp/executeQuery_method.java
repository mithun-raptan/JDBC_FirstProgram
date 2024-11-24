package com.jsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class executeQuery_method {
			public static void main(String[] args) {
				try {
					Class.forName("org.postgresql.Driver");
					Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/jdbc_mypractice", "postgres", "mithun");
					Statement stmt = con.createStatement();
					ResultSet rs=stmt.executeQuery("select * from bankdetails");
					while(rs.next()) {
						int accountNo = rs.getInt(1);
						System.out.println(accountNo);
					}
				} catch (ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
}
