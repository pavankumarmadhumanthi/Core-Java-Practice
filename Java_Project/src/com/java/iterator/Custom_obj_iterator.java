package com.java.iterator;

import java.util.HashSet;
import java.util.Iterator;

public class Custom_obj_iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Person> persons = new HashSet<>();
		persons.add(new Person(101, "employee1", 34242));

		persons.add(new Person(101, "employee1", 34242));
		persons.add(new Person(102, "employee2", 3534));
		persons.add(new Person(103, "employee3", 35242));
		persons.add(new Person(104, "employee4", 34242));

		Iterator<Person> iterator = persons.iterator();
		
		while (iterator.hasNext()) {
			Person person = iterator.next();
			if (person.salary < 35000) {
				person.setSalary(35000);
 
			}
		}
		for (Person i : persons) {
			System.out.println(i);
		}

	}

}

class Person {
	int age;
	String name;
	int salary;

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Person(int age, String name, int salary) {
		this.age = age;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", salary=" + salary + "]";
	}
}
