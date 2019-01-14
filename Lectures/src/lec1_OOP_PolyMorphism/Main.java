package lec1_OOP_PolyMorphism;

public class Main {
	public static void main(String[] args) {
		Shape[] shapes = new Shape[5]; // creates 5 references     <-- step 1) 5 references to an object, not 5 objects. point to null
								       // So next, is to point them to an object:
		
		shapes[0] = new Shape();
		shapes[1] = new Rectangle();
		shapes[2] = new Circle();      // all the same type
		shapes[3] = new Circle();
		shapes[4] = new Shape();
		
		for(Shape sh: shapes)
			System.out.println("Area: "+ sh.toString());
		
	}
}
