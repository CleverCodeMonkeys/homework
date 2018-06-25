package inheritance2;

public class Car {
	Tire[] tires = {
			new Tire(6, "앞왼쪽"),
			new Tire(3, "앞오른쪽"),
			new Tire(2, "뒤왼쪽"),
			new Tire(4, "뒤오른쪽")
	};
	
	
	
	/*Tire frontLeftTire = new Tire(6, "앞왼쪽");
	Tire frontRightTire = new Tire(3, "앞오른쪽");
	Tire backLeftTire = new Tire(2, "뒤왼쪽");
	Tire backRightTire = new Tire(4, "뒤오른쪽");
	*/
	
	
	int run() {
		System.out.println("자동차가 달립니다");
		/*if(frontLeftTire.roll() == false) 
		{	stop(); return 1;   }
		if(frontRightTire.roll() == false) 
		{	stop(); return 2;   }
		if(backLeftTire.roll() == false) 
		{	stop(); return 3;   }
		if(backRightTire.roll() == false) 
		{	stop(); return 4;   }
		return 0;*/
		for(int i=0; i<tires.length; i++) {
			if(tires[i].roll()==false) {
				stop();
				return(i+1);
			}
		}
		return 0;
	}

	private void stop() {
		System.out.println("자동차가 멈춤니다");
		
	}
}
