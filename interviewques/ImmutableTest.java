package interview.interviewques;

 public final class ImmutableTest 
 {
	private final int id;
	private final String name;
	private final AddressM address;
	
	ImmutableTest(int id,String name ,AddressM address)
{
	this.id=id;
	this.name=name;
	this.address=new AddressM(address.getCity(),address.getStreet());
}
	public String getName()
	{
		return name;
	}
	 public int getId()
	 {
		 return id;
	 }
	 
	 public AddressM getAddressM()
	 {
		 return new AddressM(address.getCity(),address.getStreet());
	 }
	
	

}
