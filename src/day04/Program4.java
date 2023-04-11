package day04;

public  class Program4 extends Program3 {

		public static void main(String[] args) {
			Program4 x= new Program4();
			x.addFunction(10, 20);
			x.subFunction(20, 10);
			x.mul(20, 3);

		}
		
		
		public void mul(int a,int b)
		{
			System.out.println(a*b);
		}

	}


