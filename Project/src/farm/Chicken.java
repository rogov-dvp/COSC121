package farm;

public class Chicken extends Animal {
	private static int counter;
	
	Chicken() {
		setMealAmount(5);
		super.setName("Chicken" + ++counter); 
	}
	
	public void sound() {
		if (isAlive()) {
			System.out.println("Cluck");
		}
	}
	public void swim() {
		System.out.println("The chicken enjoyed the swim :).");
	}
	
}
