package lec1;

public class ShapeTest {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		Circle c2 = new Circle(5.2);
		Circle c3 = new Circle("Red", true, 3.4);
		
		System.out.println(c3.toString());
	}
}
