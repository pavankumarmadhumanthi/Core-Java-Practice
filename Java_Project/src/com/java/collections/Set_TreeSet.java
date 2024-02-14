package com.java.collections;

import java.util.TreeMap;
import java.util.TreeSet;

public class Set_TreeSet{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Student> tm = new TreeSet<>();
		tm.add(new Student(1, "pavan"));
		tm.add(new Student(2,"kumar"));
		tm.add(new Student(5,"bhanu"));
		System.out.println(tm);
	}
}

class Student implements Comparable<Student>{
	int sid;
	String sname;
 Integer x;
	@Override
public String toString() {
	return "Student [sid=" + sid + ", sname=" + sname + "]";
}



	Student(int sid, String sname) {
		this.sid = sid;
		this.sname = sname;

	}

	

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return Integer.compare(this.sid, o.sid);
	}

}
