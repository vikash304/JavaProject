package javademo.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamOp {
	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(11,34,56,56,8,9,34,78,23,66);
		System.out.println(numbers);
		
	//	numbers.stream().forEach((t)->System.out.println(t));
	//int	res=numbers.stream().findFirst().get();
	//	numbers.stream().sorted().forEach((t)->System.out.println(t));
		//numbers.stream().distinct().sorted().forEach((t)->System.out.println(t));
//int	res=	numbers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		//int	res=	numbers.stream().sorted(Comparator.reverseOrder()).findFirst().get();
	//	int	res=	numbers.stream().sorted().findFirst().get();
	//System.out.println(res);
		
	}

}
