package factoryTest;

public class VehicleCarFactory extends CarFactory
{

	@Override
	public Vehicle giveVehicle(String name) 
	{
		switch(name)
		{
		case "Benz" : return new Benz();
		case "BMW" : return new BMW();
		case "Volkswagen" : return new Volkswagen();
		}
		return null;
	}

}
