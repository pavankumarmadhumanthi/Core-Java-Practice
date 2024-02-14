package com.java.innerclasses;

import com.java.innerclasses.Testclass1.Testclass2;

public abstract class Outerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Testclass2 t2=new Testclass1().new Testclass2();
		t2.instance();

	}
	abstract void attendence();

}
