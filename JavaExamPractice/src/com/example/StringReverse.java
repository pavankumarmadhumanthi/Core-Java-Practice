package com.example;

public class StringReverse {
	public static void main(String[] args) {
	
	String str="pavankumar";
	StringBuffer buffer=new StringBuffer();
	for(int i=str.length()-1;i>=0;i--) {
		buffer.append(str.charAt(i));
	}
	System.out.println(buffer);
	StringBuffer buffer1=new StringBuffer(str);
	StringBuffer reverse = buffer1.reverse();
	System.out.println(reverse);

}
}
