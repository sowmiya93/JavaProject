package day16;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
public class Program1 {

	public static void main(String[] args) {
     LinkedList <Integer> x = new LinkedList<>();//it is is a collection for saving the data
     x.add(200);
     x.add(300);
     System.out.println(x);
     for(int y:x) {
    	 System.out.println(y);//value wise get the list
     }
     
    for(int i=0;i<x.size();i++) {
    	System.out.println(x.get(i));
    }
    Scanner scan = new Scanner(System.in);
    System.out.println("enter the  numbers  in collection");
	int n=scan.nextInt();
	scan.close();
	System.out.println("enter the collection values values");
	for (int i=0;i<n;i++)
	{
		x.add(scan.nextInt());
		
	}

    Integer a[] = {12,13,15,16};
	x.addAll(Arrays.asList(a));// we can add the values in another array
	System.out.println(x);
	x.add(1, 220);//index wise we can add the values it will shuffle
	System.out.println(x);
	x.addAll(2, Arrays.asList(a));//in 2nd index onwards we can add the a array
	System.out.println(x);
	x.remove();//it remove the o index value
	System.out.println(x);
	x.remove(3);//3 index value remove 
	System.out.println(x);
	x.removeAll(Arrays.asList(a));//it will remove the all array list
	System.out.println(x);
	LinkedList<Integer> y = new LinkedList<Integer>();
	y.addAll(x);//we can add to another collection
	System.out.println(y);
	

	}

}
