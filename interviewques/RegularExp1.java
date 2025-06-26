package interview.interviewques;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RegularExp1 {
	public static void main(String[] args) {
		
		String input="dhanoj 837 hey hai $100";
		
String result=		Arrays.stream(input.split(" "))
					.filter(x->x.matches("[a-zA-Z]+"))
					.collect(Collectors.joining(" "));
System.out.println(result);
		
	}

}
