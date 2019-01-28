package abstracts;

public abstract class Food {
	// Attributes
	private double cheese;
	private double tomatoes;
	// Constructors
	protected Food() {	this(0.75,2.00);  }
	protected Food(double cheese, double tomatoes) {
		setCheese(cheese);
		setTomatoes(tomatoes);
	}
	// Methods
	public void setCheese(double cheese) {
		this.cheese = cheese;
	}
	public double getCheese() {
		return cheese;
	}
	public void setTomatoes (double tomatoes) {
		this.tomatoes = tomatoes;
	}
	public double getTomatoes() {
		return tomatoes;
	}

	// The Abstract Method:
	public abstract double cost();
	
}
