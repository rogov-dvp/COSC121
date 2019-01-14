package farm;

public class Cow extends Animal{
	private static int counter;
	
	Cow() {
		setMealAmount(20);
		super.setName("Cow" + ++counter); 
	}
	
	
	public void sound() {
		if (isAlive()) {
			System.out.println("Moo");
		}
	}
	
	public void Milk() {
		System.out.println("The cow produced milk");
	}
}
