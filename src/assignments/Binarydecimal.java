package assignments;
import java.util.Scanner;

public class Binarydecimal {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the binary number");
		int binary=scan.nextInt();
		int i=0;
		double decimal=0,rem;
		while(binary>0) 
		{
			rem=binary%10;
			decimal=decimal+Math.pow(2,i);
			binary=binary/10;
			i=i+1;
		}
		
		System.out.println("decimal number is");
	}

}
