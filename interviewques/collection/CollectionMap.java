package interview.interviewques.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CollectionMap {
	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<>();
		map.put(1, "vijendra");
		map.put(2, "raman");
		map.put(3, "abhay");
		map.put(4, "raman");
		map.put(5, "Kallu");
		map.put(6, "billu");
		
		System.out.println(map);
		
	//	map.forEach((key,value)->System.out.println(key+":"+value));
		
//	Iterator<Map.Entry<Integer, String>> itr=map.entrySet().iterator();
//	
//	while(itr.hasNext())
//	{
//	Entry<Integer, String>	entry=itr.next();
//	System.out.println(entry.getKey()+":"+entry.getValue());
//	}

//	System.out.println(map.isEmpty());
		
//		if(map.containsKey(15))
//		{
//			System.out.println("key exist");
//		}
//		else
//		{
//			System.out.println(" key Not exist");
//		}
		
//		if(map.containsValue("raju"))
//		{
//			System.out.println("exist");
//		}
//	else
//			{
//				System.out.println("not exist");
//			}
	
//		String v1	=	map.get(3);
//		System.out.println(v1);
		
//		if(map.containsKey(14))
//		{
//		String	v1=map.get(14);
//		
//		System.out.println("value found");
//		}
//		else
//		{
//			System.out.println("value is not found");
//		}

		
//       Set<Integer>		keys=map.keySet();
//       System.out.println(keys);
		
	Collection<String> values	=map.values();
		System.out.println(values);
		
		
		
		
		
		
		
		
		
	
	}
		
	
		
	}


