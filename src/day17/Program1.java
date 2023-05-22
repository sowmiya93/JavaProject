package day17;
import java.util.Arrays;
import java.util.HashSet;

public class Program1 {

	public static void main(String[] args) {

		HashSet<String> x= new HashSet<>();// in hashset it don't accept the dupicate values so that we dont have the indexing concept.
		x.add("aa");
		x.add("bb");
		x.add("cc");
		x.add("aa");
		x.add("bb");//adding duplicate is not working and also can't add with index like x.add(0,523)like wise and it don't have  get function
		x.add("cc");
		System.out.println(x);
		
		x.addAll(Arrays.asList("ab","bc","cd"));
		System.out.println(x);
		
		for(String y:x)// in normal  for loop is not work out here,for each is to get the values in set.
		{
			System.out.println(y);
		}

		System.out.println(x.size());
	
		System.out.println(x.contains("aa"));
		System.out.println(x.contains("aaa"));
		
		System.out.println(x.containsAll(Arrays.asList("aa","bb","cc","aaa")));
		
		System.out.println(x.isEmpty());
		
		}

}
