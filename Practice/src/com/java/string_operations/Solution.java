package com.java.string_operations;




import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

static  int B;
static int H;
 static boolean flag = false;
 static {
        B=new Scanner(System.in).nextInt();
        H=new Scanner(System.in).nextInt();
        if (B <= 0 || H <=0) {
             System.out.println( new Exception ("Breadth and height must be positive"));
        }else {
            flag=true;
        }
    }

 
 

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class
