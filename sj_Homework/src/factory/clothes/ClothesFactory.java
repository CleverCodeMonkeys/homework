package factory.clothes;

public class ClothesFactory extends Factory{

	@Override
	public Clothes createClothes(String name) {
		
		switch(name)
		{
			case "Skirt" : return new Skirt();
			case "Tshirt" : return new Tshirt();
			case "Pants" : return new Pants();
		}
		return null;
	}
	
	
	
	
}
