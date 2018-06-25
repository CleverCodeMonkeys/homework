package test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		HumanFactory hFactory = new HumanFactory();
		
		System.out.println("인간 공장을 가동합니다...");
		
		while(true) {
			
			System.out.println("1. XY염색체를 갖는 개체 생성");
			System.out.println("2. XX염색체를 갖는 개체 생성");
			System.out.println("0. 공장 가동 종료");
			System.out.print("숫자를 선택해 주세요 : ");
			
			int select = sc.nextInt();
			
			System.out.println("\n=================================\n");
			
			switch(select) {
			
			case 0 : System.out.println("인간 공장을 가동을 종료합니다..."); return;
			
			case 1 :
				Human h1 = hFactory.build("XY");
				if(h1 != null)
					System.out.println(h1.getGender()+" 1개체를 생성하였습니다.");
				break;
				
			case 2 :
				Human h2 = hFactory.build("XX");
				if(h2 != null)
					System.out.println(h2.getGender()+" 1개체를 생성하였습니다.");
				break;
			
			default : System.out.println("숫자를 잘못 선택하셨습니다. 다시 선택해 주세요 : "); break;
			
			}
			
			System.out.println("\n=================================\n");
			
		}
		

		

		
	}

}
