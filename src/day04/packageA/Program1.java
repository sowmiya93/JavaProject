package day04.packageA;

public class Program1 {
public static void main(String[] args) {
	Program1 x=new Program1();
	x.subFunction(10,20);
	subFunction_static(10,40);
}

	
		public static void addFunction_static(int a,int b)
		{
			System.out.println(a+b);
		}
		private static void subFunction_static(int a,int b)
		{
			System.out.println(a-b);//private is only access with in class itself
		}
		protected static void mulFunction_static(int a,int b)
		{
			System.out.println(a*b);
		}
		static void divFunction_static(int a,int b)
		{
			System.out.println(a/b);//%
		}
		public void addFunction(int a,int b)
		{
			System.out.println(a+b);
		}
		private void subFunction(int a,int b)
		{
			System.out.println(a-b);
		}
		protected void mulFunction(int a,int b)
		{
			System.out.println(a*b);
		}
		void divFunction(int a,int b)
		{
			System.out.println(a/b);
		}
	

	}


