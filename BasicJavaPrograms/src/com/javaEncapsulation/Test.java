package com.javaEncapsulation;

public class Test {
	public static void main(String[] args) {
		Employee emp=new Employee(101,"ramu",15000);
		Employee emp1=new Employee();
		emp1.setEmpId(102);
		emp1.setEmpName("raghu");
		emp1.setEmpSalary(13200);
		System.out.println(emp);
		System.out.println(emp1);
		
		
	}

}
