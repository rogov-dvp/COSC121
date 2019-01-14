package lec1_OOP_PolyMorphism;

public class Shape extends Object{
	
	// attributes
	private String colour;
	private Boolean filled;
	
	
	// constructors
	public Shape() {
		setColour("Green");
		setFilled(true);
	}	
	public Shape(String colour, boolean filled) {
		setColour(colour);
		setFilled(filled);
	}
	// methods
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		if(colour.equals("Blue") || colour.equals("Red") || colour.equals("Green") )
		this.colour = colour;
		else
			System.out.println("Invalid Colour");
	
	}
	public Boolean getFilled() {
		return filled;
	}
	public void setFilled(Boolean filled) {
		this.filled = filled;
	}
	
	public double getArea() {return -1;}
	
	@Override
	public String toString() {
		return " colour=" + colour + ", filled=" + filled;
	}
	
}
