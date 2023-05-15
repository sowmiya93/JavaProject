package day17;
import java.util.HashSet;

public class Program2 {

	public static void main(String[] args) {
		HashSet<Integer> x= new HashSet<>();
		x.add(1);
		x.add(2);
		x.add(3);//in this we having hashset of x values
		x.add(4);
		x.add(5);
		
		HashSet<Integer> y= new HashSet<>();
		y.add(4);
		y.add(5);
		y.add(6);
		y.add(7);//in this we having hashset of y values

		y.add(8);
		System.out.println(x);
		System.out.println(y);
		HashSet<Integer> xUniony= new HashSet<>(x);
		xUniony.addAll(y);//in this we get the all union values
		System.out.println(xUniony);
		
		
		HashSet<Integer> xintersectiony= new HashSet<>(x);
		xintersectiony.retainAll(y);// in this it will check both common values that will be retain
		System.out.println(xintersectiony);
		
		HashSet<Integer> xdiffy= new HashSet<>(x);
		xdiffy.removeAll(y);//it will remove the x from y and return remaining x value
		System.out.println(xdiffy);
		
		
		HashSet<Integer> ydiffx= new HashSet<>(y);
		ydiffx.removeAll(x);//it will remove the y from x and return remaining y value

		System.out.println(ydiffx);
	}
	}


