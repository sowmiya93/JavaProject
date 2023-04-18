package day06;

public class Program2 extends Program1 {

	public static void main(String[] args) {
		

			
				Program2 pro2= new Program2();
				pro2.cal(10, 5);
				
				Program1 pro1= new Program1();
				pro1.cal(10, 2);

			}
			
			
			@Override
			public void cal(int a,int b)
			{
				System.out.println("Program2 - Calculator");
				System.out.println((a*a)+(b*b));
				System.out.println((a*a)-(b*b));
				System.out.println((a*a)*(b*b));
				System.out.println((a*a)/(b*b));
				
			}

		
		

	}

