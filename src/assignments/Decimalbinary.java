package assignments;
import java.util.Scanner;

public class Decimalbinary {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the decimal number");
		int a=scan.nextInt();
		String binary="";
		int rem;
		while(a>0) {
			rem=a%2;
			binary=rem+binary;
			a=a/2;
		}
		System.out.println(binary);
	}

}
/*Divide the given decimal number by “2” where it gives the result along with the remainder.

Step 2: If the given decimal number is even, then the result will be whole and it gives the remainder “0”

Step 3: If the given decimal number is odd, then the result is not divided properly and it gives the remainder “1”.

Step 4: By placing all the remainders in order in such a way, 
the Least Significant Bit (LSB) at the top and Most Significant Bit (MSB) at the bottom, the required binary number will be obtained.*/
