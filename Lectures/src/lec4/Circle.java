package lec4;

public class Circle implements Comparable<Circle>, Cloneable{
	private double radius;
	private boolean filled;
	private double weight;
	
	public Circle() {this(1.0,1.0,true);}
	
	public Circle(double radius,double weight, boolean filled) {
		super();
		this.radius = radius;
		this.weight = weight;
		this.filled = filled;
	}
	
	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	
	public double getArea() {return Math.PI*radius*radius;}
	public double getPerimeter() {return 2*Math.PI*radius;}
	
	public int compareTo(Circle other) {
		if(this.getRadius() > other.getRadius())
				return 1;
		else
			return -1;
	}
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}
