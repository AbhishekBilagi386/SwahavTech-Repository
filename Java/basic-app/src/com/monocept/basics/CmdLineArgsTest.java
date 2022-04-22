package com.monocept.basics;

public class CmdLineArgsTest {

	public static void main(String args[]) {
		double average;
		int sum = 0;
		int max = Integer.parseInt(args[0]);
	    int min = max;
	    for(String n:args)
	    {
	    	int x = Integer.parseInt(n);
	    	sum = sum+x;
	    if(max<x) {
	    	max=x;
	    }
	    else if(min>x) {
	    	min=x;
	    }
	    }
	    average = sum/args.length;
	    System.out.println("Average of " + args.length + " command line arguments is " + average);
	    System.out.println("Sum of all the numbers is "+sum);
	    System.out.println("Max Value: "+max);
	    System.out.println("Min value: "+min);
	    }
		
	}

