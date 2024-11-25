package com.admin.Notice;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.admin.Events.Event;

import dbconnect.DBConnect;

public class NoticeDBUtil {
	
	private static boolean isSuccess ;
	private static boolean isApprove ;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null ;
	
	
	public static boolean addNotice(String title, String  discription, String  grade, String date) {
		isSuccess = false ;
		
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "insert into notices (noticeId ,noticeTitle,noticeDiscription,noticeGrade,noticePublishDate) values (0 ,'"+title+"' , '"+discription+"' , '"+grade+"' , '"+date+"')";
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
	
	
	
	
	
	
	
	public static List<Notice> getAllNotice(){
			
			ArrayList<Notice> list = new ArrayList<Notice>();
	
			try {
				con = DBConnect.getConnection();
				stmt = con.createStatement();
				String sql = "select * from notices order by noticeId desc";
				rs = stmt.executeQuery(sql);
				
				while(rs.next()) {
					int noticeId = rs.getInt(1);
					 String noticeTitle = rs.getString(2);
					 String noticeDiscription = rs.getString(3);
					 String noticeGrade = rs.getString(4);
					 String noticePublishDate= rs.getString(5);
					 
					 
					
					 Notice notice = new Notice(noticeId,noticeTitle,noticeDiscription,noticeGrade,noticePublishDate);
					
					
					list.add(notice);
				}
				
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			return list;
		}
	
	
	
	
	public static boolean deleteNotice(String id) {
			
			int noticeId = Integer.parseInt(id);
			
			try {
				con = DBConnect.getConnection();
				stmt = con.createStatement();
				String sql = "delete from notices where noticeId = '"+noticeId+"'";
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
	
	
	public static boolean updateNotice(int Id, String Title, String Discription, String Grade, String PublishDate){
		
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "update notices set noticeTitle = '"+Title+"' , noticeDiscription = '"+Discription+"' , noticeGrade = '"+Grade+"' , noticePublishDate = '"+PublishDate+"'  where noticeId = '"+Id+"'";
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
