package lab3;

public class Boing777 extends Plane implements Flyable{
	
	private static int year;
	
	public void howToFly() {
		System.out.println("Boing777 uses it's wings to fly! ");      //Overrides Flyable
	}
	
	public void setYear(int year) {
		Boing777.year = year;
	}
	public int getYear() {
		return year;
	}
}
