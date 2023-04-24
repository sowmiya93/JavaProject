package day09;
import java.util.Scanner;
public class Program1 {

	public static void main(String[] args) {
		System.out.println("Program comparing three Numbers");

		 Scanner scanner=new Scanner(System.in);

		 System.out.println("Enter the a");

		 int a=scanner.nextInt();

		 System.out.println("Enter the b ");

		 int b=scanner.nextInt();

		 System.out.println("Enter the c ");

		 int c=scanner.nextInt();

		 scanner.close();

		if((a>b)&&(a>c))
		{
			System.out.println("a is greater");
		}
		else if((b>a)&&(b>c))
		{
			System.out.println("b is greater");
		}
		else {
			System.out.println("c is greater");
		}
		
	}

}

