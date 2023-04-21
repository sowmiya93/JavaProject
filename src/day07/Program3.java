package day07;

public class Program3 {
	
	public Program3()
	{
		System.out.println("Testing...!");
	}
	
	public Program3(String message)
	{
		System.out.println(message);
	}
	public Program3(int m1,int m2)
	{
		System.out.println(m1);
	}

	public static void main(String[] args) {
		Program3 pro = new Program3();
		new Program3(10,50);
		new Program3("hello");
		pro.display();
			
	}
	
	public void display()
	{
		System.out.println("Good Day..!");
	}
}

