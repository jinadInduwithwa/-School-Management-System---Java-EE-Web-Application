package com.admin.Events;

import java.util.List;

import com.admin.Teacher;

public interface EventDAO {
	public List<Event> getAllEvents();     //get all events
	
	public List<Event> Eventspage();       //get all events for eventspage
	
	public List<Teacher> getAllTeachers();            //get all teachers
	
	public List<EventStudent> getAllParticipate(int eventID);       //get all students who participate in the event
	 
	
}
