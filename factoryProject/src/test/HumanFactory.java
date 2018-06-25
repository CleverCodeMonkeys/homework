package test;

public class HumanFactory extends Factory {

	@Override
	public Human build(String cell) {

		Human human = null;
		
		if(cell.equals("XY")) {
			human = new Male();
		} else if(cell.equals("XX")) {
			human = new Female();
		}
		
		return human;
		
	}

}
