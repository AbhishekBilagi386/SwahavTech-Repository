package com.monocept.basics;

public class AutoBoxing {

	public static void main(String[] args) { 
			//Converting int into Integer  
			int a=100;  
			Integer i=Integer.valueOf(a);    //converting int into Integer.  
			Integer j=a;       //Autoboxing. 
			  
			System.out.println(a+" "+i+" "+j);  
			 
	}

}
