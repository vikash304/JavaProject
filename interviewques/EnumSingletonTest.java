package interview.interviewques;

public class EnumSingletonTest {
	public static void main(String[] args) {
		EnumSingleton enumSingleton=EnumSingleton.INSTANCE;
		enumSingleton.getDisplay();
		
		EnumSingleton enumSingleton1=EnumSingleton.INSTANCE;
		enumSingleton1.getDisplay();
		
	}

}
