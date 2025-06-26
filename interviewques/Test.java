package interview.interviewques;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test {

	
	public static void main(String[] args) {
		
		List<Employee> list=new ArrayList<>();
		
		list.add(new Employee(1,"vijendra",34,50000));
		list.add(new Employee(2,"vikash",27,90000));
		list.add(new Employee(3,"Abhay",40,500));
		list.add(new Employee(4,"Rohit",34,70000));
		
		
	List<Employee> sortedList= list.stream().sorted(Comparator.comparing(Employee::getName)
				.thenComparingInt(Employee::getAge)).toList();
		
		for(Employee e:sortedList)
		{
			System.out.println(e);
		}
		
//	System.out.println(sortedList);
		
		
		
		
	}
	
	
}
