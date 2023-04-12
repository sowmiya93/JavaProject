package day04.packageA;

	public class Program2 extends Program1{

		public static void main(String[] args) {
			addFunction_static(10, 20);//public can access anywhere in project
			mulFunction_static(20,10);// protected only if that class is inherit only
			divFunction_static(20,10);//default only with in the package
			Program2 x= new Program2();
			x.addFunction(10, 20);
			x.mulFunction(20, 10);
			x.divFunction(30, 10);
		}

	}

