package factory.clothes;

public class test {

	public static void main(String[] args) {
		
		ClothesFactory cFactory = new ClothesFactory();
		
		Clothes clothes = cFactory.createClothes("Skirt");
		System.out.println(clothes.getName());

		
		Clothes clothes2 = cFactory.createClothes("Pants");
		System.out.println(clothes2.getName());
		
		Clothes clothes3 = cFactory.createClothes("Tshirt");
		System.out.println(clothes3.getName());
	}

}
