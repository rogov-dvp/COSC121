package fruit;

public class Main {
	public static void main(String[] args) {
		Fruit[] fruits = new Fruit[5];
		fruits[0] = new Fruit();
		fruits[1] = new Apple();
		fruits[2] = new Orange();
		fruits[3] = new GoldenDelicious();		//saySomething()
		fruits[4] = new McIntosh();				//saySomething(String s)
		for (Fruit f1 : fruits) {
			f1.saySomething();
		}
		Fruit[] apples = new Apple[4];
		apples[0] = new Apple();
		apples[1] = new GoldenDelicious();
		apples[2] = new McIntosh();
		apples[3] = new McIntosh();
		
		for (Fruit f2 : apples) {
			((Apple)f2).saySomething("hehexd");
		}
	}
}
