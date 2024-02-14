package pojo_javabean_class;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Student_serilization {
	public static void main(String[] args) throws Exception {
		Javabeanclass_student js=new Javabeanclass_student(101,"pavan",586.5);
		File f=new File("C:\\Users\\pavan\\eclipse-workspace\\Java_Project\\serializable.txt");
		f.createNewFile();
		System.out.println(f.exists());
		FileOutputStream fr=new FileOutputStream(f);
		ObjectOutputStream ops=new ObjectOutputStream(fr);
		ops.writeObject(js);
	}

}
