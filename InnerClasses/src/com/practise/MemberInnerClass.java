package com.practise;

public class MemberInnerClass {
	// member innerclass means a class within a class as member
	private int a = 49;

	class b {
		int b = 78;

		public void show() {
			System.out.println("this is the innerclass value" + b);
		}
	}

	public static void main(String[] args) {
		MemberInnerClass ic = new MemberInnerClass();
		System.out.println(ic.a);
		b bb = ic.new b();
		bb.show();
	}
}
