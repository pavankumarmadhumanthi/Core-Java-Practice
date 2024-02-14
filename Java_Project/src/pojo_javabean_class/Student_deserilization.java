package pojo_javabean_class;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class Student_deserilization {

	public static void main(String[] args) throws IOException, Exception {
		// TODO Auto-generated method stub
		Javabeanclass_student obj=null; 
		File f=new File("C:\\Users\\pavan\\eclipse-workspace\\Java_Project\\serializable.txt");
		System.out.println(f.exists());
		FileInputStream fr=new FileInputStream(f);
		ObjectInputStream ois=new ObjectInputStream(fr);
		obj=(Javabeanclass_student)ois.readObject();
		System.out.println(obj.getId()+" "+obj.getName()+" "+obj.getMarks());
	
				
		
		

	}

}
