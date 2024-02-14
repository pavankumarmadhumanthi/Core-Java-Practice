package com.java.abstraction;

public interface Tab {
	void gaming();
	default void security() {
		System.out.println("thid is tab security");
	};

}
