package assignment2;

import java.util.Arrays;
import java.util.Comparator;

public class Q3 {
	public static void main(String[] args) throws CloneNotSupportedException {
		Shape[] shapes1 = new Shape[5];
		shapes1[0] = new Rectangle(5,10);			//width = 5, height = 10
		shapes1[1] = new Hexagon(4);				//length = 4
		shapes1[2] = new Rectangle(8,13);
		shapes1[3] = new Rectangle(3,11);
		shapes1[4] = new Hexagon(10);

		double sum = 0;							
		for(Shape s: shapes1) {					// Calculates Sum of area thru for each loop
			sum += s.getArea();
		}
		System.out.println("Total area of all shapes in 'shapes1' is " + sum);
		
		Shape[] shapes2 = new Shape[shapes1.length];
		int counter = 0;
		for(Shape s: shapes1) {
			shapes2[counter] = (Shape) s.clone();
			counter++;
		}
		
		
		System.out.println("shapes1 has been cloned to shapes 2");
		Arrays.sort(shapes2, new ShapeComparator());				
		System.out.println("shapes2 has been reordered");

		System.out.println("Areas in shapes1\tAreas in shapes2");
		for (int i = 0; i < shapes2.length; i++) {
			System.out.printf("%.2f\t\t\t%.2f\n",shapes1[i].getArea(),shapes2[i].getArea());        
		
		}
	}
}
class  ShapeComparator implements Comparator<Shape>{// This is the only way I knew how to have Arrays.sort() work. It didn't work on it's own
	public int compare(Shape o1, Shape o2) {
		int num = (int)(o1.getArea() - o2.getArea());
		return num;
	}
}
