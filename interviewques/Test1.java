package interview.interviewques;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {
	
	public static void main(String[] args) {
		
		List<Employee1> list=new ArrayList<>();
		
		list.add(new Employee1(1,"vijendra",5000,35));
		list.add(new Employee1(2,"ajay",35000,35));
		list.add(new Employee1(3,"ram",15000,35));
		list.add(new Employee1(4,"anand",65000,35));
		
		List<Employee1> sortedList=		list.stream().sorted(Comparator.comparing(Employee1::getName)
						.thenComparingInt(Employee1::getSalary)).toList();
		
		for(Employee1 e: sortedList)
			
		{
			System.out.println(e);
		}
		
		//System.out.println(sortedList);
		}
	
	
	

}
