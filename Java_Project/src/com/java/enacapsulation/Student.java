package com.java.enacapsulation;

public class Student {
	int rollNumber;
	String name;
	private boolean isAttended;

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//public Student(int rollNumber) {
		//this.rollNumber = rollNumber;
	//}

	public void setStudentAttendence(boolean flag) {
		if (!isAttended) {
			isAttended = flag;
			System.out.println("teacher assigned the attendence");
		}
	}

	public boolean getStudentAttendence() {
		System.out.println("Teacher accessed student attendence");
		return isAttended;
	}

}
