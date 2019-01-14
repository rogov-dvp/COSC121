package lec1_OOP_PolyMorphism;

public class Circle extends Shape {
	// attributes
	private double radius;

	//constructors
	
	public Circle() {
		setRadius(1.0);
	}
	
	public Circle(double radius) {
		super();    // the 0 parameter const from Shape is called. It is not necessary to have 
		setRadius(radius);
	}
	public Circle(String colour, boolean filled, double radius) {
		super(colour, filled);          // Does this:
										//super.setColour(colour);
										//super.setFilled(filled);
		this.setRadius(radius);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	
	// methods
	
	public String toString() {
		return "radius: " + radius + super.toString() + " ";
	}
	
	
	
}
