package inheritance;

public class RacingCar extends Car{
	
	public static final int NORMAL = 1;
	public static final int RACING = 2; 
	
	public static int mode = NORMAL;
	
	@Override
	public void run() {
		if(mode == RACING) System.out.println("경주용 모드입니다.");
		else super.run();
	}
}
