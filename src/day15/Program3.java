package day15;

import java.util.Arrays;

public class Program3 {

	public static void main(String[] args) {
	int x[] = {10,20,42,30};
	for (int y:x) {
		System.out.println(y);
	}
	for (int i=0;i<x.length;i++)
	{
		System.out.println(x[i]);
	}
	System.out.println(Arrays.toString(x));
	System.out.println(x);
	Arrays.sort(x);// we can sort using this way
	System.out.println(Arrays.toString(x));//we can print the arrays.toStrings func to print in single line
	
	int u[]=Arrays.copyOf(x, x.length);  // copyOf we can use the copy of array to another
	System.out.println(Arrays.toString(u));
	u[0]=200;
	System.out.println("After change value");
	System.out.println(Arrays.toString(u));
	System.out.println(u);
	System.out.println(x);
	System.out.println(Arrays.toString(x));
	
	/*
	 we cannot copy this like u[]=x; like wise 
	 * */	
		
		
		
	}

}
