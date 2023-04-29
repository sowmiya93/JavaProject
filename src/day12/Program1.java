package day12;
import java.util.Scanner;
public class Program1 {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		int n=x.nextInt();
		System.out.println("Fibinoci series to "+n+"values");
		int n1=0,n2=1,i=1,count;
		while(i<=n)
		{
			count=n1+n2;
			System.out.println(count);
			n1=n2;
			n2=count;
			i++;
		}
		
		
		
		
	}

}
