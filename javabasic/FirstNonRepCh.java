package javabasic;

public class FirstNonRepCh {
	
	
	public static char firstNonRep(String str) {
		int[] charCount=new int[256];
		for(int i=0;i<str.length();i++)
		{
			//charCount[str.charAt(i)]++;
		char	ch=str.charAt(i);
		charCount[ch]++;
		}
		for(int i=0;i<str.length();i++)
		{
		if(charCount[str.charAt(i)]==1)
				{
			return str.charAt(i);
				}
		}
		return 0;
	}
	public static void main(String[] args) {
		String input="swiss";
		
		
char	result	=firstNonRep(input);

System.out.println(result);
		
	}

}
