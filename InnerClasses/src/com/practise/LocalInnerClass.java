package com.practise;

public class LocalInnerClass {
	private int a = 20;

	public void method1() {
		class InnerClass {
			int b = 45;

			public void show() {
				System.out.println(b + a);
			}
		}
		InnerClass ic = new InnerClass();
		ic.show();
	}

	public static void main(String[] args) {
		LocalInnerClass lc = new LocalInnerClass();
		lc.method1();

	}

}
