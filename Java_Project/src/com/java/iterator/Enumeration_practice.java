package com.java.iterator;

import java.util.Enumeration;
import java.util.Vector;

public class Enumeration_practice {

	public static void main(String[] args) {
		//enumeration is interface
		//introduced for iterating the legacy collection objects(version 1.0)-vector,hashtable
		//dictionary and properties 
		//dictionary is abstract class -which is cannot create object
		//but internally hash Table implements dictonary
		Vector<Integer> v=new Vector<>();//here its return enumeration object(because it implements)
		Enumeration<Integer> e= v.elements();//e holds the enumeration type
		v.add(34);
		v.add(675);
		v.add(453);
		v.add(878);
		//enumeration has two methods e.hasmoreElements() ans e.nextElement()
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
			
		}

	}

}
