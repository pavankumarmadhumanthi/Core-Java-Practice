package com.java.jdbc.CallableStatements;

public class Callable_statement {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Callable_statementdao csd=new Callable_statementdao();
		//csd.studentnames();
		Student_name_dao s=new Student_name_dao();
		s.getNameById(102);
	}

}
