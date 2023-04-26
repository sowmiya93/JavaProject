package day11;

import java.util.Scanner;

public class Program3 {

			public static void main(String[] args) 
			{
				Scanner scan = new Scanner(System.in);
				System.out.println("Start range number :- ");
				int a=scan.nextInt();
				System.out.println("End range number :- ");
				int end=scan.nextInt();
				System.out.println("Enter the Table Number:- ");
				int table=scan.nextInt();
				while(a<=end)
				{
					System.out.println(a+"x"+table+"="+a*table);
					a=a+1;
				}
				scan.close();
			}
}
		
		

	

	



	


