package day12;
import java.util.Scanner;
public class Program3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number to chech whether it is amstrong or not");
		int x=scan.nextInt();
		String y=String.valueOf(x);//to find the lenth of given num we have to convert num  to string
		 int index=0;
		 double result=0;
		 while(index<y.length()) 
		 {
				int tempValue = Integer.parseInt(y.charAt(index)+"");
				result=Math.pow(tempValue, y.length())+result;
				index=index+1;
				
				
		}
		 if(x==result)
			{
				System.out.println("ArmStrong number");
			}
			else
			{
				System.out.println("Not a ArmStrong number");
			}
			
         }
	}


