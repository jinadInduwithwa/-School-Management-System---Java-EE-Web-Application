package com.Teacher;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.student.Student;

import dbconnect.DBConnect;

public class TeacherDBUtil {
	private static boolean isSuccess ;
	private static boolean isApprove ;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null ;
	
	
	public static boolean validateTeacher(String username ,String  passsword) {

			try {
				
				con = DBConnect.getConnection();
				stmt = con.createStatement();
				String sql = "select * from teacher where username='"+username+"' and password='"+passsword+"'";
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
	
	
	public static List<Teacher> getTeacher(String userName){
			
			ArrayList<Teacher> teacher = new ArrayList<>();
			
			try {
				
				con = DBConnect.getConnection();
				stmt = con.createStatement();
				String sql = "select * from teacher where username = '"+userName+"'";
				rs = stmt.executeQuery(sql);
				
				while(rs.next()) {
					 int idteacher = rs.getInt(1);
					 String teacherName = rs.getString(2);
					 String email = rs.getString(3);
					 String phone = rs.getString(4);
					 String address= rs.getString(5);
					 String Salary = rs.getString(6);
					 String grade = rs.getString(7);
					 String Gender = rs.getString(8);
					 String password = rs.getString(9);
					 String photo = rs.getString(10);
					 String username = rs.getString(11);;
					
					 Teacher t =new Teacher( idteacher,  teacherName,  email,  phone,  address,  Salary,  grade,  Gender,  password,  photo,  username);
					 teacher.add(t);
					
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			return teacher;
		}
	
	
	
	
	
	
	
	
	public static boolean updateTeacher(String idteacher,String teacherName,String email,String phone ,String address,String Gender){
			
			
			try {
				con = DBConnect.getConnection();
				stmt = con.createStatement();
				String sql = "update teacher set teacherName = '"+teacherName+"' , email = '"+email+"' , phone = '"+phone+"' , address = '"+address+"' , Gender = '"+Gender+"' where idteacher = '"+idteacher+"'";
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
	
	
	
	
	public static List<Teacher> getTeacherDetails(String id){
		ArrayList<Teacher> teacher = new ArrayList<>();
		
		
		int conId = Integer.parseInt(id);
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from teacher where idteacher='"+conId+"'";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int idteacher = rs.getInt(1);
				 String teacherName = rs.getString(2);
				 String email = rs.getString(3);
				 String phone = rs.getString(4);
				 String address= rs.getString(5);
				 String Salary = rs.getString(6);
				 String grade = rs.getString(7);
				 String Gender = rs.getString(8);
				 String password = rs.getString(9);
				 String photo = rs.getString(10);
				 String username = rs.getString(11);
				
				 Teacher t = new Teacher( idteacher,  teacherName,  email,  phone,  address,  Salary,  grade,  Gender,  password,  photo,  username);
				 teacher.add(t);
				
				
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return teacher;
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
	

}
