package com.example;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public class TestingEmployee1 {
	public static void main(String[] args) {
		ArrayList<Employee1> ems = new ArrayList<Employee1>();
		 //Let's create some Employee objects
			LocalDate ld1=LocalDate.of(2011, Month.APRIL, 10);
			LocalDate ld2=LocalDate.of(2011,Month.AUGUST,20);
			LocalDate ld3=LocalDate.of(2011, Month.JANUARY, 05);
			LocalDate ld4=LocalDate.of(2011, Month.FEBRUARY, 10);
			LocalDate ld5=LocalDate.of(2012, Month.JANUARY, 10);
			Employee1 e1=new Employee1(1001, "RAJU",30000.00,"IT", "DEV",ld1);
			Employee1 e2=new Employee1(1003, "KIRAN",50000.00,"IT", "TESTING",ld2);
			Employee1 e3=new Employee1(1002, "SUNIL",70000.00,"FIN", "ACC",ld3);
			Employee1 e4=new Employee1(1005, "ADIL",80000.00,"IT", "DEV",ld5);
			Employee1 e5=new Employee1(1004, "MAHESH",90000.00,"OP", "HEAD",ld4);
			//Add into the list
			ems.add(e1);
			ems.add(e2);
			ems.add(e3);
			ems.add(e4);
			ems.add(e5);
			System.out.println("All employees ");
			System.out.println(ems);
			System.out.println("Employees working under It Dept");
			ems.stream().filter(e->e.getDepartment().equals("IT")?true:false).forEach(e->System.out.println(e));
			System.out.println("employees joined in 2012");
			ems.stream().filter(e->e.getDoj().getYear()==2012).forEach(System.out::println);
			System.out.println("Sum of all salaries paid for the employee");
			double sum = ems.stream().mapToDouble(e->e.getSalary()).sum();
			System.out.println(sum);
			System.out.println("Average");
			ems.stream().mapToDouble(e->e.getSalary()).average().ifPresent(System.out::println);
			ems.stream().mapToDouble(e->e.getSalary()).min().ifPresent(System.out::println);
	
	
	}

}
