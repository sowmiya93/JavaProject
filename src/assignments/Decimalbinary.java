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
