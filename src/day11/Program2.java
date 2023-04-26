package day11;

import java.util.Scanner;

public class Program2 {

public static void main(String[] args) {
	
				Scanner scan = new Scanner(System.in);

				int a=1;
				System.out.println("Enter the Table Number:- ");
				int table=scan.nextInt();

				while(a<=10)
				{
					System.out.println(a+"x"+table+"="+a*table);
					a=a+1;
				}
				scan.close();
			}

		}
	