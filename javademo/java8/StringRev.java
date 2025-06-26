package javademo.java8;

public class StringRev {
	public static void main(String[] args) {
		String str="vijendra";
	char[]arr=	str.toCharArray();
		for(int i = str.length()-1;i>=0;i--)
		{
			System.out.print(arr[i]);
		}
	}

}
