package day18;

import java.util.Hashtable;
import java.util.Map;

public class Program3{

	public static void main(String[] args) {
		Hashtable<Integer,String> sd= new Hashtable<>();
		sd.put(101, "aaa");
		sd.put(102, "bbb");
		sd.put(103, "aaa");
		//sd.put(106, null);
		System.out.println(sd);
		
		System.out.println(sd.keySet());
		System.out.println(sd.values());
		System.out.println(sd.entrySet());
		
		System.out.println(sd.containsKey(101));
		System.out.println(sd.containsKey(104));
		
		System.out.println(sd.containsValue("aaa"));
		System.out.println(sd.containsValue("AAA"));
		
		System.out.println(sd.size());
		sd.remove(101);
		sd.remove(101,"aaa");
		
		System.out.println(sd);
		
		sd.put(102, "BBB");//new key it will add or if exist key replace value
		
		System.out.println(sd);
		
		sd.replace(104, "ddd");//new key it will not add or if exist key replace
		
		
		sd.replace(102, "BBB", "abc");
		
		System.out.println(sd);
		
		for(Integer keysData:sd.keySet())
		{
			System.out.println(keysData);
		}
		
		
		for(String ValueData:sd.values())
		{
			System.out.println(ValueData);
		}
		
		
		for(Map.Entry<Integer, String> entryData:sd.entrySet())
		{
			System.out.println(entryData);
		}
		for(Map.Entry<Integer, String> entryData:sd.entrySet())
		{
			System.out.println(entryData.getKey());
		}
		for(Map.Entry<Integer, String> entryData:sd.entrySet())
		{
			System.out.println(entryData.getValue());
		}
			
		sd.clear();
		System.out.println(sd);
		
		System.out.println(sd.isEmpty());
	}

}


