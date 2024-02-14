package com.java.objection_creations;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class User {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException, SecurityException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException {
		Singleton s1=Singleton.getInstance();
		Singleton s2=Singleton.getInstance();
		Singleton s3=Singleton.getInstance();
		System.out.println(s1.hashCode()+" "+s2.hashCode()+" "+s3.hashCode());
		//object creation using class.forName
		Class cls = Class.forName("com.java.objection_creations.Obj_creation_class_forname");
		Object obj=cls.newInstance();
		Obj_creation_class_forname sc=(Obj_creation_class_forname)obj;
		Field f=cls.getDeclaredField("age");
		f.setAccessible(true);
		f.set(sc, 18);
		sc.printAge();
		Method m=cls.getDeclaredMethod("printMethod");
		m.setAccessible(true);
		m.invoke(sc,null);
		
		
		
		
		
	}

}
