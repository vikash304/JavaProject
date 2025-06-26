package javademo.java8;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterOccurrences {
	public static void main(String[] args) {
		String input="swiss";
		
//	Map<String,Long> res=	Arrays.
//			stream(input.split(""))
//			.collect(Collectors.groupingBy(Function.identity(),
//				Collectors.counting()));
//	
//	res.forEach((character,count)->
//	{
//		if(count>1)
//		{
//			System.out.println(character+":"+count);
//		}
//	});

	String res=	Arrays.stream(input.split(""))
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet().stream().filter(x->x.getValue()==1).findFirst().get().getKey();
	System.out.println(res);
				
		
		
	
	}

}
