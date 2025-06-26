package interview.interviewques.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionPractics {
	public static void main(String[] args) {
		
		List<String> fruits = new ArrayList<>(Arrays.asList(
 "Apple","Banana",  "Mango",    "Orange",   "Pineapple",   "Grapes",  "Papaya", "Watermelon",  "Kiwi","Strawberry"));

		System.out.println(fruits);
		
		//fruits.forEach(fruit->System.out.println(fruit));
		
//		for(String s:fruits)
//		{
//			System.out.println(s);
//		}
	
		//System.out.println(fruits.size());
		//System.out.println(fruits.contains("Orange"));
		
	//fruits.remove("Orange");
	//System.out.println(fruits);
//	fruits.clear();
//	System.out.println(fruits);
		
		for(int i=0;i<fruits.size();i++)
		{
			System.out.println(fruits.get(i));
		}
		
		
	}
	
}

