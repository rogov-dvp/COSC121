package farm;

import java.util.Arrays;

public class FarmTest {
	public static void main(String[] args) {
		Farm myFarm = new Farm();
			System.out.println("Before feeding: " + myFarm.getAvailableFood());
		myFarm.feedAnimals();
			System.out.println("After feeding: " + myFarm.getAvailableFood());
		myFarm.makeNoise();
		myFarm.getAnimals()[0].speak("Hello!!");
			System.out.println(Arrays.toString(myFarm.getAnimals()));
	}
}
