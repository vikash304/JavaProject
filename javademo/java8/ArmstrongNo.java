package javademo.java8;

public class ArmstrongNo {
	public static void main(String[] args) {
		int n=153;
		int rem,sum=0,temp = n;
		
		while(temp!=0)
		{
			rem=temp%10;
			
			sum=sum+rem*rem*rem;
			temp=temp/10;
		}
		if(sum==n)
		{
			System.out.println("Armstrong number");
		}
		else
		{
			System.out.println(" not Armstrong number");

		}
	}

}
