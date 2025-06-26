package desingpattern;

public class FactoryTest {
	
	public static void main(String[] args) {
		
		FactoryVechile factoryVechile=FactoryClass.getVechile("car");
		factoryVechile.start();

		FactoryVechile factoryVechile1=FactoryClass.getVechile("bike");
		factoryVechile1.start();
		
		
	}

}
