package day12;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		System.out.println("number want to factorial");
		int n=x.nextInt();
		int i=1,a=1;
		while(i<=n) {
			a=a*i;
			i++;
		}
		

		System.out.println(a);		
	}

}
