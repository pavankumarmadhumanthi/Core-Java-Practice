package com.java.interfacePart1;

public interface Laptop {
	public abstract void copy();
	public void paste();
	public void cut();
	public void keyboard();
	default void security() {
		System.out.println("this is laptop security");
	}
	static void audio() {
		System.out.println("audio");
	}
}
