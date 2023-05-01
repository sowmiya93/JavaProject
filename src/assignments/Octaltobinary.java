package assignments;
import java.util.Scanner;

public class Octaltobinary 
{
	public static  void main(String[] args) 
	{	
		
		double decimal=0;
		int i=0;
		double rem;
		Scanner x=new Scanner(System.in);
		System.out.println("enter the octal number");
		int octal=x.nextInt();
		x.close();
	    while(octal>0) 
		{
		rem=octal%10;
		decimal=decimal+rem*Math.pow(8,i);
		octal=octal/10;
		i=i+1;
		}
	    
	   Dectobin(decimal);
	}	

	
public static void Dectobin(double decimal) 
	{
		
	String binary="";
	 int rem=0;
	 int deci=(int) (decimal);
	while(deci>0) 
	{
		rem=(deci%2);
		binary=rem+binary;
		deci=deci/2;
	}
   System.out.println("print the binary"+binary);

}
 
} 
   //first convert octal to decimal and convert decimal to binary   
      
      
	
	
	



