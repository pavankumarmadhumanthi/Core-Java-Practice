package com.java.innerclasses;

public class Testclass1 {
	private int x=40;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("this is Testclass1");
		Testclass2 t2=new Testclass1().new Testclass2();
		//t2.print2();
		t2.instance();
		

	}

	public class Testclass2  extends Outerclass{
		private int x=30;
		public void print2() {
			System.out.println("this is Testclass2");
		}
		public void instance() {
			int x=20;
			Testclass2 t2=new Testclass2();
			System.out.println(x);
			System.out.println(this.x);
			System.out.println(Testclass1.this.x);
			class Pavan{
				
			}
			
		}
		@Override
		void attendence() {
			// TODO Auto-generated method stub
			
		}
	}
	private class Testclass3 {
	}

	protected class Testclass4 {

	}

}