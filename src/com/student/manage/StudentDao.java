package com.student.manage;
import java.sql.*;
import java.util.*;

public class StudentDao {
	
	private static int userID;



	public static boolean insertStudentToDB(Student st) {
		boolean flag = false;
		
		try {

			//JDBC code
			Connection con = connectionProvider.conProvider();
			
			// Dynamic Queries
			String q = "insert into students(sName,sEmail,sPhone,sCity) values(?,?,?,?)";
			
			// Prepared Student
			PreparedStatement pstmt = con.prepareStatement(q);
			
			// Set the value of parameter
			pstmt.setString(1,st.getStudentName());
			pstmt.setString(2,st.getStudentEmail());
			pstmt.setString(3,st.getStudentPhone());
			pstmt.setString(4,st.getStudentCity());
			
			// Execute
			pstmt.executeUpdate();
			
			flag=true;
			
		}catch(Exception err) {
			err.printStackTrace();
		}
		return flag;
	}


public static boolean deleteStudent(int userID){
	
	boolean flag = false;
	
	try {

		//JDBC code
		Connection con = connectionProvider.conProvider();
		
		// Dynamic Queries
		String q = "delete from students where sID=?";
		
		// Prepared Student
		PreparedStatement pstmt = con.prepareStatement(q);
		
		// Set the value of parameter
		pstmt.setInt(1,userID);

		
		// Execute
		pstmt.executeUpdate();
		
		flag=true;
		
	}catch(Exception err) {
		err.printStackTrace();
	}
	return flag;
	
	
}



public static boolean showAllStudent() {
	
	
	
boolean flag = false;
	
	try {

		//JDBC code
		Connection con = connectionProvider.conProvider();
		
		// Dynamic Queries
		String q = "select * from students";
		
		// Statement implementation Student
		Statement stmt = con.createStatement();
		ResultSet rSet = stmt.executeQuery(q);
		
		while(rSet.next()) {
			int sID = rSet.getInt(1);
			String sName = rSet.getString(2);
			String sEmail = rSet.getString(3);
			String sPhone = rSet.getString(4);
			String sCity = rSet.getString(5);
			
			
            System.out.println("Student ID : "+sID);
            System.out.println("Student Name : "+sName);
            System.out.println("Student Email : "+sEmail);
            System.out.println("Student Phone : "+sPhone);
            System.out.println("Student City : "+sCity);
            System.out.println("++++++++++++++++++++++++++++++++++++++++");
		}
		
		flag=true;
		
	}catch(Exception err) {
		err.printStackTrace();
	}
	return flag;
}



public static boolean updateStudentDetails(Student newSt) {
	
boolean flag = false;
	
	try {

		//JDBC code
		Connection con = connectionProvider.conProvider();
		
		// Dynamic Queries
		String q = "update students set sName = ? , sEmail = ? , sPhone = ? , sCity = ? where sId = ?";
		
		// Prepared statement implementation Student
		PreparedStatement pstmt = con.prepareStatement(q);
		
		
		pstmt.setString(1,newSt.getStudentName());
		pstmt.setString(2,newSt.getStudentEmail());
		pstmt.setString(3,newSt.getStudentPhone());
		pstmt.setString(4,newSt.getStudentCity());	
		pstmt.setInt(5,newSt.getStudentID());
		

		pstmt.executeUpdate();
		
		flag=true;
		
	}catch(Exception err) {
		err.printStackTrace();
	}
	return flag;
	
}

}



