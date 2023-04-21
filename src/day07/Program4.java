package day07;

public class Program4 {
	
		
		int a;
		int b;
		
		public Program4(int a, int b)
		{
			this.a=a;
			this.b=b;
			this.calculator();
		}

		public static void main(String[] args) {
			Program4 pro = new Program4(10,20);
		}
		
		public void add()
		{
			System.out.println(this.a+this.b);
		}
		public void sub()
		{
			System.out.println(a-b);
		}
		public void mul()
		{
			System.out.println(a*b);
		}
		public void div()
		{
			System.out.println(a/b);
		}
		
		
		public void calculator() {
			this.add();
			this.sub();
			this.mul();
			this.div();
		}
		
		
	}

