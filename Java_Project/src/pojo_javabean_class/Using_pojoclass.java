package pojo_javabean_class;

public class Using_pojoclass {
	public static void main(String[] args) {
		Pojo_employee po=new Pojo_employee();
		po.setId(101);
		po.setName("pavan");
		po.setSalary(12442);
		System.out.println( po.getId());
		
		Pojo_employee po1=new Pojo_employee();
		po1.setId(102);
		po1.setName("pavan kumar");
		po1.setSalary(12443);
		System.out.println( po.getId());
		
		Pojo_employee[] employees=new Pojo_employee[]{po,po1};
		
		//here pojo classes are used to employees type data various type of data excepts
	}
}
