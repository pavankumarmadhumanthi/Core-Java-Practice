package com.java.enacapsulation;

public class MyClass {
    private int x;
    private int y;

    // Constructor initializing x and y to default values
    public MyClass() {
        this(3, 5); // Calls the constructor below with arguments 0, 0
    }

    // Constructor that takes parameters and sets x and y
    public MyClass(int x, int y) {
        this.x = x;
        this.y = y;
        // Other initialization specific to this constructor
        System.out.println(x+y);
    }
    public static void main(String[] args) {
		MyClass my=new MyClass();
	}
    

}
