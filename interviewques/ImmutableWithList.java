package interview.interviewques;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public final class ImmutableWithList {
	
	private final String name;
	private final List<String> mobile;
	
	ImmutableWithList(String name, List<String> mobile)
	{
		this.name=name;
		this.mobile=mobile;
	}
	
	public String getName()
	{
		return name;
	}
	
	public List<String> getMobile()
	{
		//return mobile;
		return new ArrayList<>();
	}
	
	
	@Override
	public String toString() {
		return "ImmutableWithList [name=" + name + ", mobile=" + mobile + "]";
	}

	public static void main(String[] args) {
		
		ImmutableWithList immutableWithList=new 
				ImmutableWithList("vijendra", Arrays.stream(new String[] 
						{"1234","4567"}).collect(Collectors.toList()));
		System.out.println(immutableWithList);
		
		immutableWithList.getMobile().add("789644");
		System.out.println(immutableWithList);
		
		
	}

}
