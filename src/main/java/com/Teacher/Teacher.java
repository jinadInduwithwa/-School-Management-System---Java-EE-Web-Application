package com.Teacher;

public class Teacher {
	
	private int idteacher;
	private String teacherName;
	private String email;
	private String phone;
	private String address;
	private String Salary;
	private String grade;
	private String Gender;
	private String password;
	private String photo;
	private String username;
	
	
	
	
	public Teacher(int idteacher, String teacherName, String email, String phone, String address, String salary, String grade, String gender, String password, String photo, String username) {
		super();
		this.idteacher = idteacher;
		this.teacherName = teacherName;
		this.email = email;
		this.phone = phone;
		this.address = address;
		Salary = salary;
		this.grade = grade;
		Gender = gender;
		this.password = password;
		this.photo = photo;
		this.username = username;
	}
	
	
	
	public int getIdteacher() {
		return idteacher;
	}
	public void setIdteacher(int idteacher) {
		this.idteacher = idteacher;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getSalary() {
		return Salary;
	}
	public void setSalary(String salary) {
		Salary = salary;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	
	
}
