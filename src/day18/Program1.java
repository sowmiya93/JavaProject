package day18;
import java.util.HashMap;

public class Program1 {

	public static void main(String[] args) {
HashMap<Integer,String> stu=new HashMap<>();
stu.put(01, "sowmi");
stu.put(03, "aaaa");
stu.put(04, "venba");
stu.put(05, "nithi");
stu.put(06, "bbbb");
System.out.println(stu);

System.out.println(stu.keySet());
System.out.println(stu.values());
System.out.println(stu.entrySet());
System.out.println(stu.containsKey(01));
System.out.println(stu.containsKey(04));

System.out.println(stu.containsValue("sowmi"));
System.out.println(stu.containsValue("AAA"));

System.out.println(stu.size());
stu.remove(01);
stu.remove(03,"aaa");// it wil not remove bcz there is no value like this

System.out.println(stu);

stu.put(102, "BBB");//new key it will add or if exist key replace

System.out.println(stu);

stu.replace(04, "ddd");//new key it will not add or if exist key replace


stu.replace(06, "bbbb", "abc");//it will replace the value

System.out.println(stu);

	}

}
