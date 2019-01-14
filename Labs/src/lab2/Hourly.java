package lab2;

public class Hourly extends Employee{
	
	private int hoursWorked;
	
	void addHours(int moreHours) {
		hoursWorked += moreHours;
	}
	
	double pay() {
		return (hoursWorked * 12.65);
	}
	
	@Override
	public String toString() {
		return "Hourly [hoursWorked=" + hoursWorked + "]";
	}
	
}
