package javademo.java8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapIterator {
	
	public static void main(String[] args) {
		
		Map<Integer,String> map=new HashMap<>();
		
		map.put(1, "vijendra");
		map.put(2, "vikas");
		map.put(3, "ajay");
		map.put(4, "abhay");
		map.put(5, "vijendra");
		map.put(6, "raja");
		
		System.out.println(map);
		
		//map.forEach((key,value)->System.out.println(key+"-"+value));
		
//Iterator<Map.Entry<Integer, String>>itr=map.entrySet().iterator();
//
//while(itr.hasNext())
//{
//	 Entry<Integer, String>   entry= itr.next();
//	 
//	 System.out.println("key: "+entry.getKey()+"value: "+ entry.getValue());
//}

	//	map.entrySet().iterator().forEachRemaining(System.out::println);
		
//		Iterator<Map.Entry<Integer, String>>		itr=map.entrySet().iterator();
//		
//	while(itr.hasNext())
//	{
//	Entry<Integer, String> entry	=itr.next();
//	System.out.println(entry.getKey()+":"+entry.getValue());
//	}
		map.entrySet().iterator().forEachRemaining(System.out::println);
		
		
		
		
		
		
	}

}
