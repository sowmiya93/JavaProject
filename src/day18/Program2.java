package day18;
import  java.util.HashMap;
import java.util.Map;

public class Program2 {

	public static void main(String[] args) {
		HashMap<Integer,String> sd= new HashMap<>();
		sd.put(101, "aaa");
		sd.put(102, "bbb");
		sd.put(103, "aaa");
		sd.put(106, null);
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
			System.out.println(keysData);//it will give the one by one key values only
		}
		
		
		for(String ValueData:sd.values())
		{
			System.out.println(ValueData);//it will give the one by one values only

		}
		
		
		for(Map.Entry<Integer, String> entryData:sd.entrySet())
		{
			System.out.println(entryData);//it will give the one by one all entryset only

		}
		for(Map.Entry<Integer, String> entryData:sd.entrySet())
		{
			System.out.println(entryData.getKey());//get the key only
		}
		for(Map.Entry<Integer, String> entryData:sd.entrySet())
		{
			System.out.println(entryData.getValue());//values get throuh this
		}
			
		sd.clear();
		System.out.println(sd);
		
		System.out.println(sd.isEmpty());
	}


	}


