package com.Teacher.Assigment;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.admin.Events.Event;

import dbconnect.DBConnect;

public class AssigmentDBUtil {
	
	private static boolean isSuccess ;
	private static boolean isApprove ;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null ;
	
	
	public static boolean addAssigment(String Teacherid, String assigmentName, String assigmentDescription, String assigmentUploadDate, String assigmentDueDate, String assigmentFile) {
		isSuccess = false ;
		
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "insert into assigment (assId ,assigmentName,assigmentDescription,assigmentUploadDate,assigmnmentDueDate,file,teacherId) values (0 ,'"+assigmentName+"' , '"+assigmentDescription+"' , '"+assigmentUploadDate+"' , '"+assigmentDueDate+"' ,'"+assigmentFile+"' , '"+Teacherid+"')";
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
	
	public static List<Assigment> getAssigmentByTeacher(String id){
			
			ArrayList<Assigment> assignmentList = new ArrayList<Assigment>();

			try {
				con = DBConnect.getConnection();
				stmt = con.createStatement();
				String sql = "select * from assigment where teacherId = '"+id+"'";
				rs = stmt.executeQuery(sql);
				
				while(rs.next()) {
					int assId = rs.getInt(1);
					 String assigmentName = rs.getString(2);
					 String assigmentDescription = rs.getString(3);
					 String assigmentUploadDate = rs.getString(4);
					 String assigmnmentDueDate= rs.getString(5);
					 String file = rs.getString(6);
					 String teacherId = rs.getString(7);
					 
					 Assigment assigment = new Assigment(assId,assigmentName,assigmentDescription,assigmentUploadDate,assigmnmentDueDate,file,teacherId);
					
					
					 assignmentList.add(assigment);
				}
				
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			return assignmentList;
		}
	
	public static boolean DeleteAssigment(String id){

			try {	
				con = DBConnect.getConnection();
				stmt = con.createStatement();
				String sql = "delete from assigment where assId = '"+id+"'";
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
	
	public static boolean updateAssigment(int assId, int teacherId, String assigmentName, String assigmentDescription, String assigmentUploadDate, String assigmnmentDueDate){
		
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "update assigment set assigmentName = '"+assigmentName+"' , assigmentDescription = '"+assigmentDescription+"' , assigmentUploadDate = '"+assigmentUploadDate+"' , assigmnmentDueDate = '"+assigmnmentDueDate+"'  where assId = '"+assId+"' AND teacherId = '"+teacherId+"'";
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
