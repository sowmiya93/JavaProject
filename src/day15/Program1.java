package day15;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
int x[] = new int[5];
		
		//0-4 (5-values in x)
    Scanner scan=new Scanner(System.in);
   System.out.println("enter the array values number");
     x[0]=scan.nextInt();
     x[1]=scan.nextInt();
     x[2]=scan.nextInt();
     x[3]=scan.nextInt();
     x[4]=scan.nextInt();
    scan.close();
		System.out.println("for-loop");
		for(int i=0;i<=4;i++)
		{
			System.out.println(x[i]);
		}
		System.out.println("While");
		int a=0;
		while(a<5)
		{
			System.out.println(x[a]);
			a++;
		}
		
		System.out.println("for-each loop");
		
		for(int y:x)
		{
			System.out.println(y);
		}
		
	}

}
