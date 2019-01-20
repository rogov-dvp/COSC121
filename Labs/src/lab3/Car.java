package lab3;

public class Car extends Vehicle implements Comparable<Car>{
	
	private static int year;
	
	public int compareTo(Car car) {
		if(year> 0) {
			return +1;
		} else
			return -1;
	}
	
	Car()         { this(2); }
	Car(int year) {	Car.year = year; }

	public int year() {
		return 0;
	}
}
