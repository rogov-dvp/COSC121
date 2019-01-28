package assignment2;

public class Rectangle extends Shape implements Cloneable, Comparable<Shape>{
	private double width;
	private double height;
	
	Rectangle() {	this(5,10);	}
	Rectangle(double width, double height) {
		setWidth(width);
		setHeight(height);
	}
	Rectangle(String color, boolean filled, double width, double height) {
		super(color,filled);
		setWidth(width);
		setHeight(height);
	} 
	
	// CompareTo---------------------------
	 public int compareTo(Shape sh) {
		 if(getArea() == sh.getArea())
			 return 1;
		else
			return -1;
	 }
	//-------------------------------------
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	//Overridden
	public double getArea() {
		return width*height;
	}
	public double getPerimeter() {
		return 2*width + 2*height;
	}
	@Override
	public String toString() {
		return super.toString() + "\n" +"width: " + width + ". height: " + height + "\n"
				+ "Area: " + getArea() + ". Perimeter: " + getPerimeter();
	}
	
	
	
	
}
