package inheritance;

public class Main {

	public static void main(String[] args) {
		
		RacingCar rCar = new RacingCar();
		rCar.run();
		
		rCar.mode = RacingCar.RACING;
		rCar.run();
		
		rCar.mode = RacingCar.NORMAL;
		rCar.run();
		

	}

}
