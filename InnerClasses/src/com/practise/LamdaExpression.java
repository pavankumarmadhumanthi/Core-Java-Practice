package com.practise;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LamdaExpression {
	public static void main(String[] args) {
		
		Predicate<Integer> p = (num) -> num%2==0?true:false;
		System.out.println(p.test(10));
		
		Function<Integer,String> f=(num) -> "hello";
		System.out.println(f.apply(45));
		
		Consumer<Integer> c=(e)->System.out.println(e);
		c.accept(45);
		
		Supplier<Integer> s=()-> 457;
		 System.out.println(s.get());
	}

}
