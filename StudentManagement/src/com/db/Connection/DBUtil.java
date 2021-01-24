package com.db.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	
			final static String forNameURL = "com.mysql.jdbc.Driver";
			final static String dBURL = "jdbc:mysql://localhost:3306/jdbc";
	final static String username = "root";
	final static String password = "yarkareddy@239";
	public static Connection DBConnection() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(dBURL, username, password);
		return con;
	}
	
}
