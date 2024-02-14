package com.string;

import java.util.TreeSet;

public class StudentDemo {
	public static void main(String[] args) {
		TreeSet<Student> ts=new TreeSet<>();
		ts.add(new Student(101,"pavan"));
		ts.add(new Student(105,"Kumar"));
		ts.add(new Student(103,"naveen"));
		ts.add(new Student(102,"raju"));
		
		System.out.println(ts);
		
	}

}
class Student implements Comparable<Student>{
	int id;
	String name;
	
	public Student(int id,String name) {
		this.id=id;
		this.name=name;
		
	}

	@Override
	public int compareTo(Student s) {
		// TODO Auto-generated method stub
		
		return Integer.compare( s.id,this.id);
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	
}
