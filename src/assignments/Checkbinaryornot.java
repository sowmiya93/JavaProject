package assignments;

import java.util.Scanner;

public class Checkbinaryornot {

	public static void main(String[] args) {
		int r=0,c=0,b;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the binary number");
		int binary=scan.nextInt();
		b=binary;
		  while(binary>0) 
          { 
             if((binary %10==0)|| (binary%10==1)) 
                c++; 
                r++; 
                binary=binary/10; 
          } 
             if(c==r) 
             {
      System.out.println(b+" is a Binary Number."); }
      else 
      { System.out.println(b+" is not a Binary Number"); 
  }
	}

}
