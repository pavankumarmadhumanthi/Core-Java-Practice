package com.java.collections;
import java.util.*;
public class List_arrylist_vector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//vector is synchronized and it is thread safe in multithread environment
		//vector capacity increases 100 percent;
		//we cant  obj for primitive types we use object for generics
		Vector<String> v1=new Vector<>();//creates obj type of array with default vlues as null and size 10
		System.out.println(v1);
		v1.add("pavan");
		v1.add("kumar");
		v1.add(0,"arjun");//index based adding
		v1.add("pavan");
		v1.add("amala");		
		
		//size- no of elements present in list
		//capacity-array capacity
		//Generics are used to restrict the user data to the particular datatype
		Vector<String> v2=new Vector<>();
		v2.add("ramesh");
		v2.add("suresh");
		
		//adding one vector to another using for loop
		for(int i=0;i<v2.size();i++) {
			v1.add(v2.get(i));
		}
		//adding all v2 to v1 at idex 0
		v1.addAll(0,v2);
		
		//deleting element from list
		v1.remove(0);
		v1.remove("pavan");
		//for removing all v2
		v1.removeAll(v2);
		
		// to remove entire list
		//v1.clear();
		
		//verificatin or contains
		//v1.contains("pavan");
		
		System.out.println(v1);//when we try to print collection obj it will give value thats the beati of collectins
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		
		
	}

}
