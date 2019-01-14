package lab2;

public class Employee extends StaffMember{
	
	private String SIN;
	private double payRate;
	
	double pay() {
		return 50;
	}
	
	@Override
	public String toString() {
		return "Employee [SIN=" + SIN + ", payRate=" + payRate + "]";
	}	
}
