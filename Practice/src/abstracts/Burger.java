package abstracts;

public class Burger extends Food{
	// Attributes
	private double bread;
	private double meat;
	private double lettuce;
	
	// Constructor
	public Burger() {
		this(1.25, 9.95, 2.35);
	}
	public Burger(double bread, double meat, double lettuce) {
		setBread(bread);
		setMeat(meat);
		setLettuce(lettuce);
	}
	public Burger(double bread, double meat, double lettuce, double cheese, double tomatoes) {
		super(cheese,tomatoes);
		setBread(bread);
		setMeat(meat);
		setLettuce(lettuce);
	}
	// Method
	public double getBread() {
		return bread;
	}
	public void setBread(double bread) {
		this.bread = bread;
	}
	public double getMeat() {
		return meat;
	}
	public void setMeat(double meat) {
		this.meat = meat;
	}
	public double getLettuce() {
		return lettuce;
	}
	public void setLettuce(double lettuce) {
		this.lettuce = lettuce;
	}
	// The Overriden Abstract Method:
	public double cost() {
		double cost = getBread() + getMeat() + getLettuce() + getTomatoes() + getCheese();
		return cost;
	}
	
	
}
