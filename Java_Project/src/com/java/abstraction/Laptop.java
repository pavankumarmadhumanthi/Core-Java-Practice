package com.java.abstraction;

public interface Laptop {
	public void cut();
	public void paste();
	public void keyboard();
	default void security() {
		System.out.println("this is laptop security");
	};
}
