package pojo_javabean_class;

import java.io.Serializable;

public class Javabeanclass_student implements Serializable {
	//serializable is used to send data from application to database by converting objects into bytestream
	private int id;
	private String name;
	private double marks;
	//we need not any no argument constructor by default java will add it unless you add any parameter constructor
	
	/*The class must have a public no-argument constructor.
	The class must be serializable.
	All properties of the class must be private, and must have public getter and setter methods.
	The class may have other methods, but these are not required.*/
	public Javabeanclass_student( int id,String name,double marks) {
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}
	

	

}
