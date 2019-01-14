package lab2;

public class Executive extends Employee{
	
	private double bonus;
	
	void awardBonus(double bonus) {
		this.bonus = bonus;
	}
	
	double pay() {
		return (bonus + 3000);
	}
	
	@Override
	public String toString() {
		return "Executive [bonus=" + bonus + "]";
	}
	
	
	
}
