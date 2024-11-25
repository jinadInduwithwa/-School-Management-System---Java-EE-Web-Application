package com.admin.Events;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.admin.Teacher;

import dbconnect.DBConnect;     //importing the DBConnect class from the dbconnect package





public class EventDAOimplement implements EventDAO  {          //implementing the EventDAO interface
	
	private Connection con;             //creating a connection object
	
	
	private static boolean isSuccess ;             //creating a boolean variable isSuccess
	private static Statement stmt = null;         //creating a statement object
	private static ResultSet rs = null ;                //creating a resultset object
	
	public EventDAOimplement(Connection conn) {                //creating a constructor
		super();
		this.con = conn ;
	}
	
	public List<Event> getAllEvents(){                        //creating a method to get all the events
		ArrayList<Event> list = new ArrayList<Event>();               //creating an arraylist of type Event
		Event p = null;
		
	
		
		try {
			con = DBConnect.getConnection();               //getting the connection
			stmt = con.createStatement();                           //creating a statement
			String sql = "select * from event order by idEvent desc";           //sql query to get all the events
			rs = stmt.executeQuery(sql);                                //executing the query
			int i = 1 ;                                            //creating a variable i and initializing it to 1
			
			while(rs.next() && i<= 3) {                  //while loop to get the data from the database
				p = new Event();                       //creating an object of type Event
				
				
				
				p.setIdEvent(rs.getInt(1));                       //setting the values to the Event object
				p.setEventName(rs.getString(2));
				p.setEventDate(rs.getString(3));
				p.setEventLocation(rs.getString(4));
				p.setEventDescription(rs.getString(5));
				p.setEventOrganizer(rs.getString(6));
				p.setEventContact(rs.getString(7));
				p.setEventImage(rs.getString(8));
				p.setEventParticipants(rs.getInt(9));
				i++;
				
				list.add(p);                    //adding the object to the list
			}
			
			
		}catch(Exception e) {      
			e.printStackTrace();                   //catch block to handle the exception
		}
		return list;
	}
	
	
	public List<Event> Eventspage(){                      //creating a method to get all the events
		ArrayList<Event> list = new ArrayList<Event>();         //creating an arraylist of type Event
		Event p = null;                                          //creating an object of type Event
		
	
		
		try {
			con = DBConnect.getConnection();                    //getting the connection
			stmt = con.createStatement();                            //creating a statement
			String sql = "select * from event order by idEvent desc";        //sql query to get all the events
			rs = stmt.executeQuery(sql);                              //executing the query
			int i = 1 ;                                    //creating a variable i and initializing it to 1
			
			while(rs.next()) {                          //while loop to get the data from the database
				p = new Event();                         //creating an object of type Event
				
				
				
				p.setIdEvent(rs.getInt(1));                          //setting the values to the Event object
				p.setEventName(rs.getString(2));
				p.setEventDate(rs.getString(3));
				p.setEventLocation(rs.getString(4));
				p.setEventDescription(rs.getString(5));
				p.setEventOrganizer(rs.getString(6));
				p.setEventContact(rs.getString(7));
				p.setEventImage(rs.getString(8));
				p.setEventParticipants(rs.getInt(9));
				i++;
				
				list.add(p);                              //adding the object to the list
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();                  //catch block to handle the exception
		}
		return list;
	}
	
	public List<Teacher> getAllTeachers(){                    //creating a method to get all the teachers
		ArrayList<Teacher> list = new ArrayList<Teacher>();          //creating an arraylist of type Teacher
		Teacher p = null;                                          //creating an object of type Teacher
		
	
		
		try {
			con = DBConnect.getConnection();                    //getting the connection
			stmt = con.createStatement();                   //creating a statement
			String sql = "select * from teacher";               //sql query to get all the teachers
			rs = stmt.executeQuery(sql);                         //executing the query
			int i = 1 ;                                       //creating a variable i and initializing it to 1
			
			while(rs.next() && i<= 3) {                //while loop to get the data from the database
				p = new Teacher();                        //creating an object of type Teacher
				
				
				
				p.setId(rs.getInt(1));                          //setting the values to the Teacher object
				p.setTeacherName(rs.getString(2));              
				p.setPhoto(rs.getString(10));
				i++;
				
				list.add(p);                   //adding the object to the list
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();                   //catch block to handle the exception
		}
		return list;
	}
	
	public List<EventStudent> getAllParticipate(int eventID){                   //creating a method to get all the students who are participating in the event
		ArrayList<EventStudent> list = new ArrayList<EventStudent>();         //creating an arraylist of type EventStudent
		EventStudent p = null;
		
		String participate = "true";          //creating a string variable participate and initializing it to true
		
	
		
		try {
			con = DBConnect.getConnection();              //getting the connection
			stmt = con.createStatement();
			String sql = "select * from eventstudents where eventID= '"+eventID+"' AND participate = '"+participate+"'";   	//sql query to get all the students who are participating in the event
			rs = stmt.executeQuery(sql);      	 //executing the query
			int i = 1 ;                  //creating a variable i and initializing it to 1
			
			while(rs.next()) {                  //while loop to get the data from the database
				p = new EventStudent();                    //creating an object of type EventStudent
				
				
				
				p.setId(rs.getInt(1));                        //setting the values to the EventStudent object
				p.setEventID(rs.getInt(2));
				p.setStudentId(rs.getInt(3));
				p.setStudentName(rs.getString(4));
				p.setStudentGrade(rs.getInt(5));
				p.setParticipate(rs.getString(6));
				
				i++;
				
				list.add(p);                 //adding the object to the list
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();               //catch block to handle the exception
		}
		return list;                    //returning the list
	}
	
	
}
