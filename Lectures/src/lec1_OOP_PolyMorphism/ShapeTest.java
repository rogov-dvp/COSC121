package lec1_OOP_PolyMorphism;

public class ShapeTest {
	public static void main(String[] args) {

		//Shape s = new Shape();			//Can't make an object since abstract
		Shape c = new Circle();
		//System.out.println(s.getArea());
		System.out.println(c.getArea());
	}
}
