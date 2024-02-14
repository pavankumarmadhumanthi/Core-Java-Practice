package com.java.ThreadExamples;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableThread implements Callable<String>{

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		return "Hello Everyone";
	}
	public static void main(String[] args) throws Exception, ExecutionException {
		
		CallableThread t1=new CallableThread();
		ExecutorService service = Executors.newFixedThreadPool(5);
		Future<String> submit = service.submit(t1);
		String string = submit.get();
		System.out.println(string);
		service.shutdown();
		
	}

}
