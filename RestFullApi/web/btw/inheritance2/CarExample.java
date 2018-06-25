package inheritance2;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i=0; i<=5; i++) {
			int problemLocation = car.run();
			
			if(problemLocation != 0) {
				System.out.println(car.tires[problemLocation-1].location+
						"한국타이어로 교체");
				car.tires[problemLocation-1] = new HankookTire(15,car.tires[problemLocation-1].location);
				
				
			}
			
			
			/*switch(problemLocation) {
				case 1 : 
					System.out.println("앞왼쪽 타이어 한국타이어로 교체");
					car.frontLeftTire = new HankookTire(15, "앞왼쪽");
					break;
				case 2 :
					System.out.println("앞오른쪽 타이어 금호타이어로 교체");
					car.frontRightTire = new KumhoTire(13, "앞오른쪽");
					break;
				case 3 :
					System.out.println("뒤왼쪽 타이어 한국타이어로 교체");
					car.backLeftTire = new HankookTire(12, "뒤왼쪽");
					break;
				case 4 : 
					System.out.println("뒤오른쪽 타이어 금호타이어로 교체");
					car.backRightTire = new KumhoTire(14,"뒤오른쪽");
					break;*/
			
			System.out.println("----------------------");
		}
	}

}
