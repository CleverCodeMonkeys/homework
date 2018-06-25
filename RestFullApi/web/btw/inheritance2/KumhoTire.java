package inheritance2;

public class KumhoTire extends Tire {

	public KumhoTire(int maxRotation, String location) {
		super(maxRotation, location);
		
	}
	
	@Override
	public boolean roll() {
		++accumlatedRotation;
		if(accumlatedRotation<maxRotation) {
			System.out.println(location +"금호 타이어 수명: " + (maxRotation-accumlatedRotation)+"회");
			return true;	
		} else {
			System.out.println("***" + location + "금호 타이어 ***");
			return false;
		}
	}

}
