package interview.interviewques;

public enum EnumSingleton {
	INSTANCE;
	
	public void getDisplay()
	{
		System.out.println("doing some task--"+this.hashCode());
	}

}
