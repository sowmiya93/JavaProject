package day06;

public class TataNexon extends Tatacars{

	public static void main(String[] args) {
		TataNexon nexon = new  TataNexon();
		nexon.displayHeight();
		nexon.displayPrice();
		nexon.displaySpeed();

	}
	
	@Override
	public void displayHeight()
	{
		System.out.println("Tata Nexon Height is 5.5f");
	}
	
	@Override
	public void displayWidth()
	{
		System.out.println("Tata Nexon width is 7f");
	}
	
	@Override
	public void displaySpeed()
	{
		System.out.println("Tata Nexon Speed is 120KM/Hr");
	}
	
	@Override
	public void displayPrice()
	{
		System.out.println("Tata Nexon Price is 10.5L");
	}



	}


