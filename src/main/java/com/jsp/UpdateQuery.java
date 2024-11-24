package com.jsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateQuery {
			public static void main(String[] args) {
				try {
					Class.forName("org.postgresql.Driver");
					Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/jdbcMorningBatch","postgres", "mithun");
					Statement stmt=conn.createStatement();
					System.out.println(stmt);
					
					//update query
							
					boolean b = stmt.execute("update emp set age = 23 where id = 102");
					System.out.println(b);
					System.out.println("data updated uccesfully");
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
}
