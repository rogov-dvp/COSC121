package lab3;

public class Copter extends Plane implements Flyable{

	private static int year;
	
	public void howToFly() {
		System.out.println("Fly off the ground vertically using rotor blades!");   //Overrides Flyable
	}

	public void year() {
		
	}
	
	public void setYear(int year) {
		Copter.year = year;
	}
	public int getYear() {
		return year;
	}
	
}
