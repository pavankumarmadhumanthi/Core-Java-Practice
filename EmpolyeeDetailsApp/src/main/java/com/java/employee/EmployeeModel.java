package com.java.employee;

public class EmployeeModel {
	private int EmployeeId;
	private String EmployeeName;
	private String email;
	private String city;
	
	

	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getEmployeeId() {
		return EmployeeId;
	}
	public String getEmployeeName() {
		return EmployeeName;
	}
	public String getEmail() {
		return email;
	}
	public String getCity() {
		return city;
	}
	public EmployeeModel(int employeeId2, String employeeName2, String email2, String city2) {
		this.EmployeeId=employeeId2;
		this.EmployeeName= employeeName2;
		this.email=email2;
		this.city=city2;
	}
	public EmployeeModel() {
		// TODO Auto-generated constructor stub
	}
	
}