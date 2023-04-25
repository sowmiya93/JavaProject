package day10;
import java.util.Scanner;
public class Program1 {
 
 
	public static void main(String[] args) {
		
		int price;
		System.out.println("enter the brand you want");
		Scanner scan=new Scanner(System.in);
		String brand=scan.next();
		if(brand.equals("apple")|| brand.equals("Apple"))
		{
			System.out.println("range please");
          price =scan.nextInt();
          if(price>=50000 && price<=200000)
          {
			System.out.println("enter the clour u want");
			String colur=scan.next();
			if(colur.equals("black")||colur.equals("silver")||colur.equals("blue"))
			{
		System.out.println("this apple mobile is available");
			}
			
			else
			{
				System.out.println("this apple mobile is  not available");

			}
			}
		}
		if(brand.equals("Oppo")|| brand.equals("oppo"))
		{
			System.out.println("range please");
          price =scan.nextInt();
          if(price>=15000 && price<=100000)
          {
			System.out.println("enter the clour u want");
			String colur=scan.next();
			if(colur.equals("black")||colur.equals("silver")||colur.equals("blue"))
			{
		System.out.println("this oppo mobile is available");
			}
			
			else
			{
				System.out.println("this oppo mobile is  not available");

			}
			}
		}	
	
	
		if(brand.equals("oneplus")|| brand.equals("One+"))
		{
			System.out.println("range please");
          price =scan.nextInt();
          if(price>=15000 && price<=150000)
          {
			System.out.println("enter the clour u want");
			String colur=scan.next();
			if(colur.equals("black")||colur.equals("silver")||colur.equals("blue"))
			{
		System.out.println("this oneplus mobile is available");
			}
			
			else
			{
				System.out.println("this oneplus mobile is  not available");

			}
			}
		}
	}
	
          
	}
