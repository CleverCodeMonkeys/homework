package inheritance2;

public class Tire {
	public int maxRotation;
	public int accumlatedRotation;
	public String location;
	
	public Tire(int maxRotation, String location) {
		
		this.maxRotation = maxRotation;
		this.location = location;
	}

	public boolean roll() {
		++accumlatedRotation;
		if(accumlatedRotation<maxRotation) {
			System.out.println(location +"Tire수명: " + (maxRotation-accumlatedRotation)+"회");
			return true;	
		} else {
			System.out.println("***" + location + "Tire 펑크 ***");
			return false;
		}
	}
	
}
