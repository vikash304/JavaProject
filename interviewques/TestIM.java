package interview.interviewques;

public class TestIM {
	public static void main(String[] args) {
		
		AddressM addressM=new AddressM("Noida","PatliGale");
		ImmutableTest immutableTest=new ImmutableTest(101, "Vijendra", addressM);
		
		System.out.println("Before Modify"+immutableTest.getAddressM());
		System.out.println("Before Modify"+immutableTest.getId()+":"+immutableTest.getName());
		
		addressM.setCity("Delhi");
		addressM.setStreet("ChoriGali");
		System.out.println("After Modify"+immutableTest.getAddressM());
		
	}

}
