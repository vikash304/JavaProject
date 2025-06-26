package javademo.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ToUpperCaseUsingMap {
	public static void main(String[] args) {
		List<String> names=Arrays.asList("vijendra","vikas","abhay","ramu");
//List<String>	upperCase=	names.stream()
//.map(String::toUpperCase).collect(Collectors.toList());
//System.out.println(upperCase);
		//names.stream().map(String::toUpperCase).forEach(System.out::println);
		//names.stream().filter(name->name.startsWith("v")).forEach(System.out::println);
	long result=	names.stream().filter(x->x.startsWith("v")).count();
	System.out.println(result);
	}

}
