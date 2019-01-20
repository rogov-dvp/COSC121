package lab3;

public class Main {
	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car();
		if(c1.compareTo(c2) > 0) {
			System.out.println(c1.compareTo(c2));
			System.out.println("more than 0 years old");
		}
	}
}
