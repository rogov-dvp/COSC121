package abstracts;

public class Pasta extends Food{
	// Attributes
	private double pasta;
	
	// Constructors
	public Pasta() {
		this(3.50);
	}
	public Pasta(double pasta) {
		setPasta(pasta);
	}
	public Pasta(double pasta, double cheese, double tomatoes) {
		super(cheese, tomatoes);                   // super(_____) must be used first in the constructor
		setPasta(pasta);
	}
	// Methods
	public double getPasta() {
		return pasta;
	}
	public void setPasta(double pasta) {
		this.pasta = pasta;
	}
	public double cost() {
		double cost = getPasta() + getCheese() + getTomatoes();
		return cost;
		
	}
}
