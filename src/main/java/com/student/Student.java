package com.student;

public class Student {
	
	private int sid ;
	private String firstName;
	private String lastName;
	private String dob;
	private String address;
	private String phone;
	private String grade;
	private String userName;
	private String password;
	private String email;
	private String regStatus;
	private String photo;
	
	
	
	public Student(int sid, String firstName, String lastName, String dob, String address, String phone, String grade,
			String userName, String password, String email, String regStatus, String photo) {
		super();
		this.sid = sid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.address = address;
		this.phone = phone;
		this.grade = grade;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.regStatus = regStatus;
		this.photo = photo;
	}
	
	
	public Student() {
		// TODO Auto-generated constructor stub
	}


	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRegStatus() {
		return regStatus;
	}
	public void setRegStatus(String regStatus) {
		this.regStatus = regStatus;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	

}
