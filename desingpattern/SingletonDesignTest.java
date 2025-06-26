package desingpattern;

public class SingletonDesignTest {
	public static void main(String[] args) {
		
		SingletonDesign ob= SingletonDesign.getInstance();
		ob.hashCode();
		
		System.out.println(ob.hashCode());
		
		SingletonDesign ob1= SingletonDesign.getInstance();
		System.out.println(	ob1.hashCode());
		
		System.out.println(ob1.hashCode()==ob1.hashCode());
	
		
		
		
	}

}
