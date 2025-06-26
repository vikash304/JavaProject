package interview.interviewques;

public class DemoInterfaceTest {
	public static void main(String[] args) {
		
		DemoInterface demoInterface=(a,b)->a+b;
		{
		int res=	 demoInterface.sum(35, 90);
			System.out.println(res);
			
		}
		
		
	}
	
	
	

}
