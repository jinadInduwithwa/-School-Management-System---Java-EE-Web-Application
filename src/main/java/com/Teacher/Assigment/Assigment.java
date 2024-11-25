package com.Teacher.Assigment;

public class Assigment {
	
	private int assId;
	private String assigmentName;
	private String assigmentDescription;
	private String assigmentUploadDate;
	private String assigmnmentDueDate;
	private String file;
	private String teacherId;
	
	
	
	public Assigment() {
		super();
	}



	public Assigment(int assId, String assigmentName, String assigmentDescription, String assigmentUploadDate,
			String assigmnmentDueDate, String file, String teacherId) {
		super();
		this.assId = assId;
		this.assigmentName = assigmentName;
		this.assigmentDescription = assigmentDescription;
		this.assigmentUploadDate = assigmentUploadDate;
		this.assigmnmentDueDate = assigmnmentDueDate;
		this.file = file;
		this.teacherId = teacherId;
	}
	
	
	
	public int getAssId() {
		return assId;
	}
	public void setAssId(int assId) {
		this.assId = assId;
	}
	public String getAssigmentName() {
		return assigmentName;
	}
	public void setAssigmentName(String assigmentName) {
		this.assigmentName = assigmentName;
	}
	public String getAssigmentDescription() {
		return assigmentDescription;
	}
	public void setAssigmentDescription(String assigmentDescription) {
		this.assigmentDescription = assigmentDescription;
	}
	public String getAssigmentUploadDate() {
		return assigmentUploadDate;
	}
	public void setAssigmentUploadDate(String assigmentUploadDate) {
		this.assigmentUploadDate = assigmentUploadDate;
	}
	public String getAssigmnmentDueDate() {
		return assigmnmentDueDate;
	}
	public void setAssigmnmentDueDate(String assigmnmentDueDate) {
		this.assigmnmentDueDate = assigmnmentDueDate;
	}
	public String getFile() {
		return file;
	}
	public void setFile(String file) {
		this.file = file;
	}
	public String getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}
	
	
}
