package com.jsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Execute_Method {
			public static void main(String[] args) {
				try {
					Class.forName("org.postgresql.Driver");
					Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/jdbcMorningBatch","postgres", "mithun");
					Statement stmt=conn.createStatement();
					System.out.println(stmt);
					
					//step-4: execute query
							
					//boolean b = stmt.execute("insert into emp values(101,'mithun','mithun@gamil.com',1234,'male',6291485214,23)");
					boolean b = stmt.execute("insert into emp values(102,'sagar','sagar@gamil.com',1294,'male',6969696969,22)");
					System.out.println(b);
					System.out.println("data inserted uccesfully");
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
}
