package assignment2;

public class Hexagon extends Shape implements Cloneable, Comparable<Shape>{
	
	// Attributes
	private double length;
	
	// Constructors
	Hexagon() {
		this(4);
	}
	Hexagon(double length) {
		setLength(length);
	}
	Hexagon(double length, String color, boolean filled) {
		super(color, filled);
		setLength(length);
	}
	
	//methods
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	
	// compareTo ---------------------------
	
	public int compareTo(Shape shp) {
		int num = 0;
		if (getArea() == shp.getArea())
			num = 1;
		else 
			num = -1;
		return num;
	}	
	
		
	// -------------------------------------
	
	public double getArea() {
		double area = (3*Math.sqrt(3)) *(Math.pow(length, 2))/2;
		return area;
	}
	public double getPerimeter() {
		double perimeter = 6 * length;
		return perimeter;
	}
	@Override
	public String toString() {
		return 	super.toString() + "\n" +
				"Side: " + length + ". Area: " + getArea() + ". Perimeter: " + getPerimeter();
	}
	

}
