package com.student.manage;
import java.sql.*;

public class connectionProvider {
	
	static Connection con;
	
	
	public static Connection conProvider() {
		if(con==null) {
			try {
				
				Class.forName("com.mysql.jdbc.Driver");
				String url = "jdbc:mysql://localhost:3306/student_management_db?characterEncoding=latin1";
				String user = "root";
				String pwd = "root7970";
				
				con = DriverManager.getConnection(url,user,pwd);
				
			}catch(Exception err) {
				err.printStackTrace();
			}
		}
		return con;
	}	
	
}
