package com.admin;

public class Teacher {
	private int id;
	private String teacherName ;
	private String email ;
	private String phone ;
	private String address ;
	private double Salary ;
	private int grade;
	private String Gender ;
	private String password ;
	private String photo ;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
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
	
	public Teacher(int id, String teacherName, String email, String phone, String address, double salary, int grade,
			String gender, String password, String photo) {
		super();
		this.id = id;
		this.teacherName = teacherName;
		this.email = email;
		this.phone = phone;
		this.address = address;
		Salary = salary;
		this.grade = grade;
		Gender = gender;
		this.password = password;
		this.photo = photo;
	}
	
	
	public Teacher() {
		
	}
	
}
