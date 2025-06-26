package javademo.java8;

public class Palindrome {
	public static void main(String[] args) {
		int n=142;
		
	int	rev=0,temp=n,rem;
	
	while(n>0)
	{
		rem=n%10;
		rev=rev*10+rem;
		n=n/10;
	}
	if(rev==temp) {
		System.out.println("number is palindrome");
	}
	else
	{
		System.out.println("number is  not palindrome");
	}
	}

}
