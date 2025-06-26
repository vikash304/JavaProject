package javademo.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListItrForEach {
	
	public static void main(String[] args) {
		
	//	List<String> list=Arrays.asList("vijendra","vipin","abhay","ram","vikas");
		List<Integer> list=new ArrayList<>();
		list.add(23);
		list.add(11);
		list.add(18);
		list.add(23);
		list.add(29);
		list.add(18);
		list.add(500);
		
		System.out.println(list);
		
		// foreach
//		for(int i : list)
//		{
//			System.out.println(i);
//			
//		}
		
//		Iterator<Integer>	items=	list.iterator();
//		
//		while(items.hasNext())
//		{
//		System.out.println(items.next());	
//		}
		
		list.stream().filter(x->x>20).forEach(System.out::println);

		//list.forEach(item->System.out.println(item));
		
		
		
		
				
	//	list.stream().filter(item->item.startsWith("v")).forEach(System.out::println);
		
		
		
		
		
	}

	
}
