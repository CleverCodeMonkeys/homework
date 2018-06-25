package inheritance2;

public class HankookTire extends Tire{

	public HankookTire(int maxRotation, String location) {
		super(maxRotation, location);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean roll() {
		++accumlatedRotation;
		if(accumlatedRotation<maxRotation) {
			System.out.println(location +"한국 타이어 수명: " + (maxRotation-accumlatedRotation)+"회");
			return true;	
		} else {
			System.out.println("***" + location + "한국 타이어 ***");
			return false;
		}
	}
}
