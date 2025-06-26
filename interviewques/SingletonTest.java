package interview.interviewques;

public class SingletonTest {
	public static void main(String[] args) {
		
		 Singleton singleton=Singleton.getInstance();
		 Singleton singleton1=Singleton.getInstance();
		 System.out.println(singleton.hashCode());
		 System.out.println(singleton1.hashCode());
		 
		 System.out.println(singleton1.hashCode()==singleton.hashCode());
	}

}
