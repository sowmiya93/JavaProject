package assignments;
import java.util.Scanner;

public class Binarydecimal {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the binary number");
		int binary=scan.nextInt();
		int i=0;
		double decimal=0,rem;
		while(binary>0) 
		{
			rem=binary%10;
			decimal=decimal+rem*Math.pow(2,i);
			binary=binary/10;
			i=i+1;
		
		}
		System.out.println("decimal number is"+decimal);
	}
	}

/*Binary to Decimal Conversion Steps
First, write the given binary number and count the powers of 2 from right to left (powers starting from 0)
Now, write each binary digit (right to left) with the corresponding powers of 2 from (right to left), such that first binary digit (MSB) will be multiplied with the greatest power of 2.
Add all the products in the above step
The final answer will be the required decimal number
*/