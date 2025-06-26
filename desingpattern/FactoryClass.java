package desingpattern;

public class FactoryClass {
	
	public static FactoryVechile getVechile( String type)
	{
		if(type.equalsIgnoreCase("Car"))
		{
			return new FactoryCar();
		}
		else if(type.equalsIgnoreCase("Bike"))
		{
			return new FactoryBike();
		}
		
		return null;
	}

}
