package lec1_OOP_PolyMorphism;

public class ShapeTest {
	public static void main(String[] args) {

		Shape sh = new Shape();
		Shape s2 = new Circle();
		Rectangle r = new Rectangle();
		Shape s3 = r;
		
		Circle c1 = new Circle();
		Shape sh4 = new Shape();				// Shape r2 references to the Rectangle Object
		Shape r2 = new Rectangle();             
		// superType x = subType();  <--- RULE 1
		
	
		Rectangle r1 = new Rectangle();
		Shape s1 = new Shape();
		s1 = r1;
				
		Rectangle r3 = new Rectangle();
		r3 = r1;            // It can do this
//		r3 = s1;			// But not this even though technically it is the same. You can force it
		
	}
}
