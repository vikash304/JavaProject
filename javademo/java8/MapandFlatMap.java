package javademo.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapandFlatMap {
	public static void main(String[] args) {
		List<List<Integer>> list=Arrays.asList(Arrays.asList(1,2,3),
			Arrays.asList(4,5,6),Arrays.asList(7,8,9));
	
		
	
	
		
	var res = list.stream().map(x -> x.stream().map(y -> y*y))
			.collect(Collectors.toList());
	
//	 list.stream()
//		    .map(innerList -> innerList.stream()
//		        .map(num -> num * num) // Square each element
//		        .collect(Collectors.toList()))
//		    .collect(Collectors.toList());

	System.out.println(res);
		
	}	

}
