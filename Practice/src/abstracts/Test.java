package abstracts;

public class Test {
	public static void main(String[] args) {
		//Food food = new Food();            // <--- INCORRECT because it is an abstract classs
		Food burger = new Burger();
		Food pasta = new Pasta();
		
		System.out.println("burger cost: " + burger.cost());
		System.out.println("pasta cost: " + pasta.cost());
		
	}
}
