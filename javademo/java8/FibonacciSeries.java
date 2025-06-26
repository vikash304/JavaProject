package javademo.java8;

public class FibonacciSeries {
	public static void main(String[] args) {
		int a=0,b=1,c,n=8,i;
		System.out.print(a+""+b);
		
		for(i=2;i<=n;i++)
		{
			c=a+b;
			System.out.print(c);

			a=b;
			b=c;
		}
		
	}

}
