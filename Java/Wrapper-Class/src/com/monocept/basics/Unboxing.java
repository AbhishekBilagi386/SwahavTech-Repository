package com.monocept.basics;

public class Unboxing {

	public static void main(String[] args) {
		Integer a=new Integer(8);    
		int i=a.intValue();   //converting Integer to int. 
		int j=a;       //Unboxing.    
		    
		System.out.println(a+" "+i+" "+j);
	}

}
