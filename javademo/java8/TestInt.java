package javademo.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestInt {
	public static void main(String[] args) {
		//int count;
		
		
		List<String> ls=  Arrays.asList( "Java" , "GCP" , "Abc" , "Java" , "GCP" , "Java" );
	Map<String,Long> count=	ls.stream().collect(Collectors.groupingBy(s->s,Collectors.counting()));
	// s->s like-->  Function.Identity()
	System.out.println(count);
		
		
	}

}
