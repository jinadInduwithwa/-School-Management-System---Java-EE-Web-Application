package com.admin;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.student.Student;


import dbconnect.DBConnect;


public class AdminDBUtil {
	
	private static boolean isSuccess ;
	private static boolean isApprove ;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null ;
	
	
public static List<Student> getAdmissionStudent(){
		
		ArrayList<Student> list = new ArrayList<Student>();
		
		String regStatus = "approve";
	
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from student where regStatus != '"+regStatus+"'";
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
				 String regstatus = rs.getString(11);
				 String photo = rs.getString(12);
				
				Student std = new Student(sid,firstName,lastName,dob,address,phone,grade,UserName,password,email,regstatus,photo);
				
				
				list.add(std);
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}


public static List<Student> getALLstudents(){
	
	ArrayList<Student> list = new ArrayList<Student>();
	
	String regStatus = "approve";

	
	try {
		con = DBConnect.getConnection();
		stmt = con.createStatement();
		String sql = "select * from student where regStatus = '"+regStatus+"' order by sid asc";
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
			 String regstatus = rs.getString(11);
			 String photo = rs.getString(12);
			
			Student std = new Student(sid,firstName,lastName,dob,address,phone,grade,UserName,password,email,regstatus,photo);
			
			
			list.add(std);
		}
		
		
	}catch(Exception e) {
		e.printStackTrace();
	}
	return list;
}


	public static boolean approveStudent(String sid) {
	
		int sidInt = Integer.parseInt(sid);
		String regStatus = "approve";
		
		try {
		
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "update student set regStatus = '"+regStatus+"' Where sid = '"+sidInt+"'";
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
	
	public static boolean RejectStudent(String sid) {
		
		int sidInt = Integer.parseInt(sid);
		
		
		try {
		
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "delete from student where sid = '"+sidInt+"'";
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
	
	public static boolean addStudent(String fname, String lname, String username,int grade ,String address,String telephone , String dob ,String email,String password,String photo) {
		isSuccess = false ;
		String regStatus = "approve";
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "insert into student (sid,firstName,lastName,dob,address,phone,grade,userName,password,email,regStatus,photo) values (0 ,'"+fname+"' , '"+lname+"' , '"+dob+"' , '"+address+"' ,'"+telephone+"' , '"+grade+"' , '"+username+"' , '"+password+"' , '"+email+"' ,'"+regStatus+"' , '"+photo+"')";
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
	
	public static boolean addTeacher(String teacherName,String email,String phone,String address,Double Salary, int grade,String Gender,String password,String  fileName ,String username) {
		isSuccess = false ;
		String regStatus = "approve";
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "insert into teacher(idteacher,teacherName,email,phone,address,Salary,grade,Gender,password,photo,username) values (0 ,'"+teacherName+"' , '"+email+"' , '"+phone+"' , '"+address+"' ,'"+Salary+"' , '"+grade+"' , '"+Gender+"' , '"+password+"'  ,'"+fileName+"', '"+username+"')";
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
	
	public static List<Teacher> getALLTeacher(){
		
		ArrayList<Teacher> list = new ArrayList<Teacher>();
		
		

		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from teacher";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int id = rs.getInt(1);
				 String teacherName = rs.getString(2);
				 String email = rs.getString(3);
				 String phone = rs.getString(4);
				 String address= rs.getString(5);
				 double Salary = rs.getDouble(6);
				 int grade = rs.getInt(7);
				 String Gender = rs.getString(8);
				 String password = rs.getString(9);
				 String teacher_photo = rs.getString(10);
				 
				
				 Teacher std = new Teacher(id,  teacherName,  email,  phone,  address,  Salary,  grade, Gender,  password,  teacher_photo);
				
				
				list.add(std);
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}
public static boolean deleteTeacher(String sid) {
		
		int sidInt = Integer.parseInt(sid);
		
		
		try {
		
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "delete from teacher where idteacher = '"+sidInt+"'";
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

public static boolean updateTeacher(int id,String teacherName,String email,String phone,String address,double Salary,int  grade){
	
	
	try {
		
		con = DBConnect.getConnection();
		stmt = con.createStatement();
		String sql = "update teacher set teacherName = '"+teacherName+"' , email = '"+email+"' , phone = '"+phone+"' , address = '"+address+"' , Salary = '"+Salary+"', grade = '"+grade+"'  where idteacher = '"+id+"'";
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

public static boolean updateStudent(int id,String fname,String lname,int grade,String address,String telephone,String  dob,String email){
	
	
	try {
		
		con = DBConnect.getConnection();
		stmt = con.createStatement();
		String sql = "update student set firstName = '"+fname+"' , lastName = '"+lname+"' , dob = '"+dob+"' , address = '"+address+"' , phone = '"+telephone+"', grade = '"+grade+"' ,email = '"+email+"' where sid = '"+id+"'";
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
