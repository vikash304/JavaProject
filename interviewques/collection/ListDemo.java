package interview.interviewques.collection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		List<Integer> firstFiveEvenNo=new ArrayList<>();	
		firstFiveEvenNo.add(2);
		firstFiveEvenNo.add(4);
		firstFiveEvenNo.add(6);
		firstFiveEvenNo.add(8);
		firstFiveEvenNo.add(10);
		
		List<Integer> TenEvenNo=new ArrayList<>(firstFiveEvenNo);
		
		List<Integer> nextEvenNo=new ArrayList<>();
		
		nextEvenNo.add(12);
		nextEvenNo.add(14);
		nextEvenNo.add(16);
		nextEvenNo.add(18);
		nextEvenNo.add(20);
		
		TenEvenNo.addAll(nextEvenNo);
		
		System.out.println(TenEvenNo);
	}

}
