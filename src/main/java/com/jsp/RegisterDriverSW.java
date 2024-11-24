package com.jsp;

import java.sql.DriverManager;
import java.sql.SQLException;

import org.postgresql.Driver;

public class RegisterDriverSW {
	
	public static void main(String[] args) {
	//register the Driver S/W
		//s1: create Driver class object
				Driver d = new Driver();
		//s2: pass the ref. variable to registerDriver(d) method
				try {
					DriverManager.registerDriver(d);
					System.out.println("Driver loaded successfully");
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
				
	
	//load the Driver S/W
//				try {
//					Class.forName("org.postgresql.Driver");
//					System.out.println("driver loaded successfully ");
//				} catch (ClassNotFoundException e) {
//					e.printStackTrace();
//				}
				
				
	}

}
