package day14;

public class Program2 {
	public static void main(String[] args) {
		// ++,--
		// x=1, x--, x=x-1
		//--x ----- x--
		
		int a=10;
		System.out.println(a);
		System.out.println("#######");
		int b= --a;// a=9, b=9
		System.out.println(a);
		System.out.println(b);
		System.out.println("#######");
		int c= a--;// a=8, c=9
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		
	}

}

