package com.admin.Events;

public class EventStudent {
	
	private int id;
	private int eventID;
	private int studentId;
	private String studentName;
	private int StudentGrade; 
	private String participate;
	
	
	public EventStudent(int id, int eventID, int studentId, String studentName, int studentGrade, String participate) {
		super();
		this.id = id;
		this.eventID = eventID;
		this.studentId = studentId;
		this.studentName = studentName;
		StudentGrade = studentGrade;
		this.participate = participate;
	}
	
	public EventStudent() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEventID() {
		return eventID;
	}

	public void setEventID(int eventID) {
		this.eventID = eventID;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentGrade() {
		return StudentGrade;
	}

	public void setStudentGrade(int studentGrade) {
		StudentGrade = studentGrade;
	}

	public String getParticipate() {
		return participate;
	}

	public void setParticipate(String participate) {
		this.participate = participate;
	}
	
	

}
