package interview.interviewques;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RegularExp {
	
	public static void main(String[] args) {
		
		List<String> input =Arrays.asList ("apple", "mango", "strawberry", "blueberry", "mango", "10947");
		
	List<String>result=	input.stream().filter(x->x.matches("[a-zA-Z]+")).distinct()
			.collect(Collectors.toList());
	System.out.println(result);
	}

}
