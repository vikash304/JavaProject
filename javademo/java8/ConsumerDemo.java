package javademo.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
	public static void main(String[] args) {
		

		
//		Consumer<Integer> con=t->System.out.println(t);
//		con.accept(20);
		
		List<Integer> list=Arrays.asList(1,2,3,4,5,6);
		list.stream().forEach(t->System.out.println(t));

		
	}
	
	
}
