package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//Step1: Create the Employee class
class Employee implements Comparable<Employee> {
	private Integer id;
	private String name;
	private Double salary;
	private static String companyName = "AshokIT";
	private static int idGenerator = 1000;

	// Constructor
	public Employee(String name, Double salary) {
		this.id = idGenerator++;
		this.name = name;
		this.salary = salary;
	}
	// provide setters and getters method

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

	public Double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	// provide toString method
	@Override
	public String toString() {
		return "" + this.id + "\t" + this.name + "\t" + this.salary;
	}

	@Override
	public int compareTo(Employee o) {
		if (this.id > o.getId())
			return 1;
		else if (this.id < o.getId())
			return -1;
		else
			return 0;
	}
}

public class ClientApplication {
	public static void main(String[] args) {
		// Created the 5 Employee Objects
		Employee emp1 = new Employee("RAJU", 30000.00);
		Employee emp2 = new Employee("SUNIL", 40000.00);
		Employee emp3 = new Employee("KIRAN", 50000.00);
		Employee emp4 = new Employee("TONY", 70000.00);
		Employee emp5 = new Employee("MAHESH", 80000.00);
		// Store this 5 Employee Objects into the List
		ArrayList<Employee> list = new ArrayList<Employee>();
		ArrayList<Integer> l=new ArrayList<Integer>();
		l.add(2);
		l.add(1);
		System.out.println(l);
		Collections.sort(l);
		System.out.println(l);

		if (list.isEmpty()) {
			// store 5 empoyee objects into the list
			list.add(emp1);
			list.add(emp2);
			list.add(emp3);
			list.add(emp4);
			list.add(emp5);
			System.out.println("EID\tENAME\tESALARY");
			System.out.println("----------------------");
			displayAllEmployeeList(list);
		}
		Collections.sort(list);// DNSO
		System.out.println("After Sorting..");
		displayAllEmployeeList(list);
		sortBasedOnEmployeeName(list);
		list.sort((o1,o2)->o2.getName().compareTo(o2.getName()));
		System.out.println(list);

	}

	public static void displayAllEmployeeList(ArrayList<Employee> list) {
		// Display all the Employee Details
		for (Employee employee : list) {
			System.out.println(employee);
		}

	}

	public static void sortBasedOnEmployeeName(ArrayList<Employee> employees) {
		Comparator c = new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getName().compareTo(o2.getName());
			}
		};
		employees.sort(c);

		System.out.println(employees);
	}

	public static void sortBasedOnEmpolyeeSalary(ArrayList<Employee> employees) {
		Comparator<Employee> c = (o1, o2) ->o1.getSalary().compareTo(o2.getSalary());
		employees.sort(c);
		employees.stream().forEach(System.out::println);

	}
}
