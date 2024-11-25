package com.Teacher.Assigment;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.admin.Notice.Notice;

import dbconnect.DBConnect;

public class AssigmentDAOImplementation implements AssigmentDAO{
	
private Connection con;
	
	
	private static boolean isSuccess ;
	private static Statement stmt = null;
	private static ResultSet rs = null ;
	
	public AssigmentDAOImplementation(Connection conn) {
		super();
		this.con = conn ;
	}

	@Override
	public List<Assigment> getThreeAssigment() {
		ArrayList<Assigment> list = new ArrayList<Assigment>();
		Assigment a = null;

		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from assigment order by assigmnmentDueDate";
			rs = stmt.executeQuery(sql);
			int i = 1 ;
			
			while(rs.next() && i<= 3) {
				a = new Assigment();
				
				a.setAssId(rs.getInt(1));
				a.setAssigmentName(rs.getString(2));
				a.setAssigmentDescription(rs.getString(3));
				a.setAssigmentUploadDate(rs.getString(4));
				a.setAssigmnmentDueDate(rs.getString(5));
				a.setFile(rs.getString(6));
				i++;
				
				list.add(a);
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<Assigment> getAllAssigment() {
		ArrayList<Assigment> list = new ArrayList<Assigment>();
		Assigment a = null;

		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from assigment order by assigmnmentDueDate";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				a = new Assigment();
				
				a.setAssId(rs.getInt(1));
				a.setAssigmentName(rs.getString(2));
				a.setAssigmentDescription(rs.getString(3));
				a.setAssigmentUploadDate(rs.getString(4));
				a.setAssigmnmentDueDate(rs.getString(5));
				a.setFile(rs.getString(6));
				
				list.add(a);
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}


}
