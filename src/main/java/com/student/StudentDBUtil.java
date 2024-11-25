package com.student;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



import dbconnect.DBConnect;



public class StudentDBUtil {
	
	private static boolean isSuccess ;
	private static boolean isApprove ;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null ;
	
	
	
	
	public static boolean isRegisterd(String username ,String  passsword) {
		String regStatus = "approve";
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from student where userName='"+username+"' and regStatus='"+regStatus+"'";
			rs = stmt.executeQuery(sql);
			
			if (rs.next()) {
				isApprove = true ;
			}else {
				isApprove = false ;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return isApprove;
	}
	
	
	public static boolean validateStudent(String username ,String  passsword) {
		
		String regStatus = "approve";
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from student where userName='"+username+"' and password='"+passsword+"' and regStatus='"+regStatus+"'";
			rs = stmt.executeQuery(sql);
			
			if (rs.next()) {
				isSuccess = true ;
			}else {
				isSuccess = false;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
	
public static boolean validateSID(String sid ,String  passsword) {
		
		int sidInt = Integer.parseInt(sid);
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from student where sid='"+sidInt+"' and password='"+passsword+"'";
			rs = stmt.executeQuery(sql);
			
			if (rs.next()) {
				isSuccess = true ;
			}else {
				isSuccess = false;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
	
	public static List<Student> getStudent(String userName){
		
		ArrayList<Student> student = new ArrayList<>();
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from student where userName = '"+userName+"'";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				 int sid = rs.getInt(1);
				 String firstName = rs.getString(2);
				 String lastName = rs.getString(3);
				 String dob = rs.getString(4);
				 String address= rs.getString(5);
				 String phone = rs.getString(6);
				 String grade = rs.getString(7);
				 String UserName = rs.getString(8);
				 String password = rs.getString(9);
				 String email = rs.getString(10);
				 String regStatus = rs.getString(11);
				 String photo = rs.getString(12);
				
				Student std = new Student(sid,firstName,lastName,dob,address,phone,grade,UserName,password,email,regStatus,photo);
				student.add(std);
				
			}
		}catch(Exception e) {
			
		}
		
		return student;
	}
	
	
	public static boolean insertStudent(String fname, String lname, String username,int grade ,String address,String telephone , String dob ,String email,String password,String rePassword) {
		isSuccess = false ;
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "insert into student (sid,firstName,lastName,dob,address,phone,grade,userName,password,email) values (0 ,'"+fname+"' , '"+lname+"' , '"+dob+"' , '"+address+"' ,'"+telephone+"' , '"+grade+"' , '"+username+"' , '"+password+"' , '"+email+"')";
			int rs = stmt.executeUpdate(sql);
			
			if(rs  >  0) {
				isSuccess = true ;
			}else {
				isSuccess = false ;
			}
			
			
		}catch(Exception e) {  
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
	
	public static boolean updateStudent(String id,String  fName, String Lname, String grade, String phone, String email,String  address , String fileName){
		
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "update student set firstName = '"+fName+"' , lastName = '"+Lname+"' , grade = '"+grade+"' , address = '"+address+"' , phone = '"+phone+"', email = '"+email+"' , photo = '"+fileName+"' where sid = '"+id+"'";
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			}else {
				isSuccess = false;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
	
public static boolean updatePassword(String username,String  password){
		
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "update student set password = '"+password+"'  where userName = '"+username+"'";
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			}else {
				isSuccess = false;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	public static List<Student> getStudentDetails(String id){
		ArrayList<Student> student = new ArrayList<>();
		
		
		int conId = Integer.parseInt(id);
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from student where sid='"+conId+"'";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int sid = rs.getInt(1);
				 String firstName = rs.getString(2);
				 String lastName = rs.getString(3);
				 String dob = rs.getString(4);
				 String address= rs.getString(5);
				 String phone = rs.getString(6);
				 String grade = rs.getString(7);
				 String UserName = rs.getString(8);
				 String password = rs.getString(9);
				 String email = rs.getString(10);
				 String regStatus = rs.getString(11);
				 String photo = rs.getString(12);
				
				Student std = new Student(sid,firstName,lastName,dob,address,phone,grade,UserName,password,email,regStatus,photo);
				student.add(std);
				
				
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return student;
	}
	
	
public static boolean DeleteAccount(String username){
		
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "delete from student where userName = '"+username+"'";
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			}else {
				isSuccess = false;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	

}
