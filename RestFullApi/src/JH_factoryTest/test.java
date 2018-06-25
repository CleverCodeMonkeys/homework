package factoryTest;

public class test {

	public static void main(String[] args) 
	{
		CarFactory car = new VehicleCarFactory();
		Vehicle vehicle;
		vehicle = car.giveVehicle("Benz");
		Vehicle vehicle2;
		vehicle2 = car.giveVehicle("BMW");
		Vehicle vehicle3;
		vehicle3 = car.giveVehicle("Volkswagen");
		
		vehicle.lease();
		vehicle2.lease();
		vehicle3.lease();

	}

}
