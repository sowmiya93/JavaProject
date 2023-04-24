package day08;

public class Program5 {

	public static void main(String[] args) {
		// && || !  true/false
				boolean a=true;
				boolean b=false;
				boolean c= true;
				
				
				//&&  we both are true then o/p true if anyone false o/p is false
				System.out.println(a&&b);//false
				System.out.println(a&&c);//true
				
				//|| if anyone as true o/p true if both are false o/p false
				System.out.println(a||b);
				
				// ! toggle  true--->false false--->true
				System.out.println(!a);
				
				System.out.println(!b);
	}

}
