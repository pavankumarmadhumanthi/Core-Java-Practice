package com.java.Patterns;
import java.util.Arrays;

public class Default_values{
    String[] a=new String[5];
 
    int[] b=new int[5];
    boolean[] c=new boolean[4];
    void method(){
    	System.out.println(Arrays.toString(a));
    	System.out.println(Arrays.toString(b));
    	System.out.println(Arrays.toString(c));
    }
    public static void main(String[] args){
        Default_values t=new Default_values();
        t.method();
    }
}