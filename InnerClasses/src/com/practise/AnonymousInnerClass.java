package com.practise;

public class AnonymousInnerClass {
	public static void main(String[] args) {
		//anonymous innerclass can be provided to the abstract class and interface with any number classes
		//but the lamda expression can be written to te only for the fuctional interface(sam)
		Tv tv=new Tv() {
			
			@Override
			void volume() {
				// TODO Auto-generated method stub
				System.out.println("tv starting volume is 35%");
				
			}
		};
		tv.volume();
		
	}

}
