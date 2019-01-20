package lec4;

import java.util.Arrays;

public class CircleTest2 {
	public static void main(String[] args) {
		Circle[] circles = new Circle[4];
		for (int i = 0; i < circles.length; i++) {
			circles[i] = new Circle();
		}
	
		Arrays.sort(circles);
		
		Rabbit[] rabbits = new Rabbit[4];
		for (int i = 0; i < rabbits.length; i++) {
			rabbits[i] = new  Rabbit();
		}
	
		Arrays.sort(rabbits);
		
	}
	
}
