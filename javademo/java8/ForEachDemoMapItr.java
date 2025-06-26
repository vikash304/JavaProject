package javademo.java8;

import java.util.HashMap;
import java.util.Map;

public class ForEachDemoMapItr {
	public static void main(String[] args) {
		
		Map<String,Integer> map=new HashMap<>();
		map.put("vijendra", 1);
		map.put("vipin", 2);
		map.put("abhay", 3);
		map.put("ravi", 4);
		map.put("sandeep", 5);
		
		//map.forEach((key,value)->System.out.println(key+":"+value));
		
		
		map.entrySet().stream().sorted(Map.Entry.comparingByKey())
		.forEach(System.out::println);
		System.out.println("------------------------------------------------------");
		
		map.entrySet().stream().sorted(Map.Entry.comparingByValue())
		.forEach(System.out::println);
		
	}
	

}
