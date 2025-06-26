package desingpattern;

public class SingletonDesign {

	private static volatile SingletonDesign instance;
	
	private SingletonDesign()
	{
		
	}
	
	public static synchronized SingletonDesign getInstance()
	{
		if(instance==null)
		{
			synchronized(SingletonDesign.class)
			{
				if(instance==null)
				{
					instance=new SingletonDesign();
				}
			}
		}
		return instance;
	}
	
}
