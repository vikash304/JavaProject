package javademo.java8;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRep {
	

	
	public static void main(String[] args) {
		
		
		String input="vijendra";
		
	Map<Character,Long> charCount=	input.chars().mapToObj(c->(char) c).collect(Collectors
				.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()));
		Character result = charCount.entrySet().stream().filter(entry->entry.getValue()==1)
				.map(Map.Entry::getKey).findFirst().orElse(null);
		
		 if(result !=null) {
		System.out.println(result);
		 }
	}
	
}
