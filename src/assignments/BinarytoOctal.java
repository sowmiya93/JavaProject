package assignments;

import java.util.Scanner;

public class BinarytoOctal 
{
public static void main(String[] args)
{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the binary number");
		int binary=scan.nextInt();
		scan.close();
		int i=0;
		double decimal=0,rem;
		while(binary>0) 
		{
			rem=binary%10;
			decimal=decimal+rem*Math.pow(2,i);
			binary=binary/10;
			i=i+1;
		
		}
	Dectooctal(decimal);
}

public static void Dectooctal( double decimal)
{
     int deci=(int) (decimal);//if u give the double value and needs to be converted like this;
		int i=1;
		int octal=0;
	    while(deci>0) 
		{
		int rem1=deci%8;
		octal+= i*rem1;
		deci=deci/8;
		i=i*10;
		}
	    System.out.println("octal is:"+octal);
	    
}
}//first convert binary to decimal and convert decimal to octal
/*Convert Decimal to Octal with Steps
Follow the steps given below to learn the decimal to octal conversion:

Write the given decimal number
If the given decimal number is less than 8 the octal number is the same.
If the decimal number is greater than 7 then divide the number by 8.
Note the remainder, we get after division
Repeat step 3 and 4 with the quotient till it is less than 8
Now, write the remainders in reverse order (bottom to top)
The resultant is the equivalent octal number to the given decimal number.
*/
