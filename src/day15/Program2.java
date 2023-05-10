package day15;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the  numbers  in array");
		int n=scan.nextInt();
		int x[]=new int[n];
		System.out.println("enter the array values");
		for (int i=0;i<n;i++)
		{
			x[i]=scan.nextInt();
			
		}
		for(int y:x)
		{
		System.out.println(y);
		}

	}
	
	

}
