package com.jsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


//it is a specialized method for DML operation.

public class executeUpdate_method_Insert {
				public static void main(String[] args) {
					try {
						Class.forName("org.postgresql.Driver");
						Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/jdbc_mypractice", "postgres", "mithun");
						Statement stmt = con.createStatement();
						int n = stmt.executeUpdate("insert into bankdetails values (105,'dolon','d@g.com',842,'arj','mit',5000),(106,'devdas','d@g.com',743,'rup','mit',6000)");
						System.out.println(n);
					} catch (ClassNotFoundException | SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
}
