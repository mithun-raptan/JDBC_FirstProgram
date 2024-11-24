package com.jsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertQuery {
					public static void main(String[] args) {
						try {
							Class.forName("org.postgresql.Driver");
							Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/jdbcMorningBatch","postgres", "mithun");
							Statement stmt=conn.createStatement();
							System.out.println(stmt);
							
							//Insert query
									
							boolean b = stmt.execute("insert into emp values(103,'abhijit','abhijit@gamil.com',1294,'male',1234567890,23)");
							System.out.println(b);
							System.out.println("data inserted uccesfully");
							
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
}
