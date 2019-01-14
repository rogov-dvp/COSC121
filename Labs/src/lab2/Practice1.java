package lab2;

public class Practice1 {
	Practice1() {
		Figure f = new Figure();
		Rectangle r = new Rectangle();
		Box b = new Box();
		f.display();
		f = r;
		f.display();
		f = b;
		f.display();
		
	}
	public static void main(String[] args) {
		new Practice1();
	}
	
	class Figure {
		void display() {System.out.println("Figure");}
	}
	class Rectangle extends Figure {
		void display() {System.out.println("Rectangle");}
	}
	class Box extends Figure{
		void display() {System.out.println("Box");}
	}
}
