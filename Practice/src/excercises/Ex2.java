package excercises;

public class Ex2 {
	Ex2() {
		Figure f = new Figure();
		Rectangle r = new Rectangle();
		Box b = new Box();
		f.display();		// Displays figure
		f = r;
		f.display();		// Recta
		f = b; 			
		f.display();
	}
	public static void main(String[] args ) {
		new Ex2();
	}
}
class Figure {
	void display() {System.out.println("Figure");}
}
class Rectangle extends Figure {
	void display () {System.out.println("Rectangle");}
}
class Box extends Figure {
	void display() {System.out.println("Box");}
}
