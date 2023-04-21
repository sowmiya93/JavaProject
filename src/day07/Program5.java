package day07;


	public class Program5 extends Program4{

	public Program5(int a, int b) {
		super(a, b);
	}

	public static void main(String[] args) {
		Program5 pro5 = new Program5(10,20);
		pro5.sub();//-10
		pro5.a=30;
		pro5.b=20;
		pro5.sub();//10
		pro5.loadValue();
		pro5.sub();//20
	}
	
	public void loadValue()
	{
		super.a=50;
		super.b=30;
		
	}
	
}


