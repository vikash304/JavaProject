package javademo.java8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetIterator {
	
	public static void main(String[] args) {
		
		Set<Integer> set= new HashSet<>();
		
		set.add(45);
		set.add(50);
		set.add(35);
		set.add(541);
		set.add(11);
		set.add(15);
		
		System.out.println(set);
		
//		for(int i:set)
//		{
//			System.out.println(i);
//		}
		
//	Iterator<Integer> item=	set.iterator();
//	
//	while(item.hasNext())
//	{
//	System.out.println(item.next());	
//	}
		set.stream().filter(x->x>35).forEach(System.out::println);
		
		
		
	}

}
