package com.jsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteQuery {
			public static void main(String[] args) {
				try {
					Class.forName("org.postgresql.Driver");
					Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/jdbcMorningBatch","postgres", "mithun");
					Statement stmt=conn.createStatement();
					System.out.println(stmt);
					
					//delete query
							
					boolean b = stmt.execute("delete from emp where id = 103");
					System.out.println(b);
					System.out.println("data deleted uccesfully");
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
}
