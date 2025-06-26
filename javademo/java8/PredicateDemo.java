package javademo.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PredicateDemo {
	
	public static void main(String[] args) {
//		
//		Predicate<Integer>pre    =  t->t%2==0;
//		System.out.println(pre.test(6));
		
		List<Integer> numbers=Arrays.asList(2,3,4,5,6,7,8);
		
   List<Integer> result	=	numbers.stream().filter(x->x%2==0).collect(Collectors.toList());
	
	System.out.println(result);
	}

}
