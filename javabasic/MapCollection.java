package javabasic;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapCollection {
	

	public static void main(String[] args) {
		
		Map<Integer, String> map=new HashMap<>();
		
		map.put(1, "vijendra");
		map.put(2, "vikas");
		map.put(3, "appi");
		map.put(4, "ram");
		map.put(5, "vijendra");
		map.put(11, "ramu");
		map.put(22, "Kallu");
		map.put(22, "Mallu");
		map.put(null, "Billu");
		//map.put(null, "Chillu");
			
//		for(int i:	map.keySet())
//		{
//			
//			System.out.println(map.get(i));
//			
//		}
		
//Set<Entry<Integer, String>>	entries=map.entrySet();
//
//					for(Entry<Integer, String> entry : entries)
//					{
//						System.out.println(entry.getKey()+":"+entry.getValue());
//						
//						entry.setValue(entry.getValue().toUpperCase());
//						
//						
//						
//					}
//					System.out.println(map);
				

		
//			map.remove(null);
//			System.out.println(map);
		
   boolean res	=map.remove(1, "vijendra");
		System.out.println(res);
		System.out.println(map);
		
		
		
		
		
	}

}
