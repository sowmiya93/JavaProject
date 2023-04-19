package day06;

public class TataPunch extends Tatacars{
	public static void main(String[] args) {
		Tatacars tatapunch = new TataPunch();
		tatapunch.displayHeight();//child class override method
		tatapunch.displayModelNumber();//parent class method its static

	}
	
	public static void displayModelNumber()
	{
		System.out.println("TatPunch Modelnumber is 123456");
	}
	
	
	@Override
	public void displayHeight()
	{
		System.out.println("Tata Punch Height is 4.5f");
	}
	
	@Override
	public void displayWidth()
	{
		System.out.println("Tata Punch width is 6.5f");
	}
	
	@Override
	public void displaySpeed()
	{
		System.out.println("Tata Punch Speed is 110KM/Hr");
	}
	
	@Override
	public void displayPrice()
	{
		System.out.println("Tata Punch Price is 9.5L");
	}

}


