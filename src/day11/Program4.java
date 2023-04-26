package day11;
import java.util.Scanner;
public class Program4 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		System.out.println("enter the starting point-");
		int stp=scn.nextInt();
		System.out.println("enter the ending point-");
		int ep=scn.nextInt();
		System.out.println("enter the table-");
		int table=scn.nextInt();
		while(stp<=ep)
		{
      System.out.println(stp+"x"+table+"="+stp*table);
	    
		  stp=stp+1;
		}
}
}