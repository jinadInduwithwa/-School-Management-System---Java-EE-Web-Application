package com.admin.Notice;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.admin.Events.Event;

import dbconnect.DBConnect;

public class NoticeDAOImplements implements NoticeDAO{
	
	private Connection con;
	
	
	private static boolean isSuccess ;
	private static Statement stmt = null;
	private static ResultSet rs = null ;
	
	public NoticeDAOImplements(Connection conn) {
		super();
		this.con = conn ;
	}

	@Override
	public List<Notice> getThreeNotices() {
		ArrayList<Notice> list = new ArrayList<Notice>();
		Notice p = null;
		
	
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from notices order by noticeId desc";
			rs = stmt.executeQuery(sql);
			int i = 1 ;
			
			while(rs.next() && i<= 3) {
				p = new Notice();
				
				
				p.setNoticeId(rs.getInt(1));
				p.setNoticeTitle(rs.getString(2));
				p.setNoticeDiscription(rs.getString(3));
				p.setNoticeGrade(rs.getString(4));
				p.setNoticePublishDate(rs.getString(5));
				i++;
				
				list.add(p);
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<Notice> getAllNotices() {
		ArrayList<Notice> list = new ArrayList<Notice>();
		Notice p = null;
		
	
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from notices order by noticeId desc";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				p = new Notice();
				
				
				p.setNoticeId(rs.getInt(1));
				p.setNoticeTitle(rs.getString(2));
				p.setNoticeDiscription(rs.getString(3));
				p.setNoticeGrade(rs.getString(4));
				p.setNoticePublishDate(rs.getString(5));
				
				list.add(p);
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	
	
	
	

}
