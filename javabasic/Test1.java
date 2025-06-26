package javabasic;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import javademo.java8.Employee;

public class Test1 {
	public static void main(String[] args) {
		
		


		List<Employee> list=Arrays.asList(
				
				new Employee("Vijendra",34),
				new Employee("vipin",22),
				new Employee("Ajay",30)
				
				);
		
		 List<Employee> sortList=  list.stream().sorted(Comparator.comparing(Employee::getName)
				   .thenComparing(Employee::getAge)).collect(Collectors.toList());
		 
		 System.out.println(sortList);
				
		
		
		
		
	}

}
