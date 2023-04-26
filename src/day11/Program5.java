package day11;
import java.util.Scanner;
public class Program5 {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		System.out.println("enter the start range");
		int a=x.nextInt();
		System.out.println("enter the end range");
		int end=x.nextInt();
		System.out.println("enter the multiples u want");
		int mul=x.nextInt();
		
		while(a<=end)
		{
			if(a%mul==0)
			{
				System.out.println(a);
			}	
			a=a+1;
		}

	}


	}


