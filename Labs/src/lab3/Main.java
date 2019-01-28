package lab3;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car();
		if(c1.compareTo(c2) > 0) {
			System.out.println(c1.compareTo(c2));
			System.out.println("more than 0 years old");
		}
		
		Car[] car = new Car[10];
		for (int i = 0; i < car.length; i++) {
			car[i] = new Car();
		}
		
		Arrays.sort(car);
		for (int i = 0; i < car.length; i++) {
			System.out.println(car[i]);
		}
		
		
		
	}
}
