package com.sv.inventario.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {
	
	public static Connection getConnection() {
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/INVENTARIO?createDatabaseIfNotExist=true&useTimezone=true&serverTimezone=UTC","root","");
		
		} catch (ClassNotFoundException | SQLException e) {
			return null;
		}	
	}
	
	public static void main(String [] args) {
		
		Connection con = JDBCConnection.getConnection();
		
		if (con != null) {
			System.out.println("Connection started sucessful!");
		}else {
			System.out.println("Fail to start connection :( ");
		}
	}
	

}
