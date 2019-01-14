package farm;

public class Llama extends Animal {
	private static int counter;
	Llama() {
		setMealAmount(9);
		setName("Llama" + ++counter);
		}
	
	public void sound() {
		if (isAlive()) {
			System.out.println("Hmmm!");
		}
	}
	public void Jump() {
		System.out.println("I used my powerful legs to jump!!");
	}

}
