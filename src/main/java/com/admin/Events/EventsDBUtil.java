package com.admin.Events;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.student.Student;

import dbconnect.DBConnect;     //importing the DBConnect class from the dbconnect package

public class EventsDBUtil {
	private static boolean isSuccess ;  //boolean variable to check the success of the database operation
	private static boolean isApprove ;   //boolean variable to check the success of the database operation
	private static Connection con = null;   //variable to store the connection to the database
	private static Statement stmt = null;      //variable to store the statement
	private static ResultSet rs = null ;      //variable to store the resultset
	
	
	public static boolean addEvent(String Name,String date,String Location,String description,String organizer,String contact,String fileName) { //method to add the event to the database
		isSuccess = false ;   //initializing the boolean variable to false
		
		
		try {
			
			con = DBConnect.getConnection();   //getting the connection to the database
			stmt = con.createStatement();           //creating a statement
			String sql = "insert into event (idEvent ,EventName,EventDate,EventLocation,EventDescription,EventOrganizer,EventContact,EventImage) values (0 ,'"+Name+"' , '"+date+"' , '"+Location+"' , '"+description+"' ,'"+organizer+"' , '"+contact+"' , '"+fileName+"')";    //sql query to insert the event details to the database
			int rs = stmt.executeUpdate(sql);     //executing the query and storing the result in the variable rs
			
			
			if(rs  >  0) {              //checking if the result is greater than 0
				isSuccess = true ;          //if the result is greater than 0 then the boolean variable is set to true
			}else {                          //if the result is less than 0
				isSuccess = false ;           //the boolean variable is set to false
			}
			
			
		}catch(Exception e) {  
			e.printStackTrace();    //catching any exceptions that occur
		}
		
		return isSuccess;       //returning the boolean variable
	}
	
	public static List<Event> getALLEvents(){     //method to get all the events from the database
		
		ArrayList<Event> list = new ArrayList<Event>();   //creating an arraylist to store the events
		
		
		

		
		try {
			con = DBConnect.getConnection();        //getting the connection to the database
			stmt = con.createStatement();                  //creating a statement
			String sql = "select * from event order by idEvent desc";     //sql query to get all the events from the databa
			rs = stmt.executeQuery(sql);                       //executing the query and storing the result in the resultse
			
			while(rs.next()) {                        //loop to iterate through the resultset
				int idEvent = rs.getInt(1);                 //getting the event id from the database
				 String EventName = rs.getString(2);         //getting the event name from the database
				 String EventDate = rs.getString(3);
				 String EventLocation = rs.getString(4);
				 String EventDescription= rs.getString(5);
				 String EventOrganizer = rs.getString(6);
				 String EventContact = rs.getString(7);
				 String EventImage = rs.getString(8);
				 int EventParticipants = rs.getInt(9);
				 
				
				 Event event = new Event(idEvent,EventName,EventDate,EventLocation,EventDescription,EventOrganizer,EventContact,EventImage,EventParticipants);
				
				
				list.add(event);        //adding the event to the arraylist
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();    //catching any exceptions that occur
		}
		return list;
	}
	
public static boolean DeleteEvent(String id){      //method to delete the event from the database
		
		
		try {
			
			con = DBConnect.getConnection();        //getting the connection to the database
			stmt = con.createStatement();
			String sql = "delete from event where idEvent = '"+id+"'";
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

public static boolean updateEvent(int id,String Name,String date,String Location,String description,String organizer,String contact){ //method to update the event details in the database
	
	
	try {
		
		con = DBConnect.getConnection();
		stmt = con.createStatement();
		String sql = "update event set EventName = '"+Name+"' , EventDate = '"+date+"' , EventLocation = '"+Location+"' , EventDescription = '"+description+"' , EventOrganizer = '"+organizer+"', EventContact = '"+contact+"'  where idEvent = '"+id+"'";
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

public static boolean addPartcipate(int eventID,int stdID,String stdName,int Grade) {
	isSuccess = false ;
	String participate = "true";
	
	try {
		
		con = DBConnect.getConnection();
		stmt = con.createStatement();
		String sql = "insert into eventstudents (id ,eventID,studentId,studentName,StudentGrade,participate) values (0 ,'"+eventID+"' , '"+stdID+"' , '"+stdName+"' , '"+Grade+"' ,'"+participate+"')";
		int rs = stmt.executeUpdate(sql);
		
		if(rs  >  0) {
			isSuccess = true ;
		}else {
			isSuccess = false ;
			
		}
		
		
	}catch(Exception e) {  
		e.printStackTrace();
	}
	
	try {
		con = DBConnect.getConnection();
		Statement stmt2 = con.createStatement();
		String sql2 = "update eventstudents set participate = '"+participate+"'  where eventID = '"+eventID+"' AND studentId = '" + stdID + "'";
		int rs2 = stmt2.executeUpdate(sql2);
		if(rs2  >  0) {
			isSuccess = true ;
		}else {
			isSuccess = false ;
		}
	}catch(Exception e){
		e.printStackTrace();
	}
	
	return isSuccess;
}

public static boolean notPartcipate(int eventID,int stdID) {  
	isSuccess = false ;
	String participate = "false";
	
	try {
		
		con = DBConnect.getConnection();
		stmt = con.createStatement();
		String sql = "update eventstudents set participate = '"+participate+"'  where eventID = '"+eventID+"' AND studentId = '" + stdID + "'";
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
}
