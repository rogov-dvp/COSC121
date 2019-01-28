package assignment2;

import java.util.Scanner;

public class TestRectangle {
	public static void main(String[] args) throws CloneNotSupportedException {
	
		Scanner in = new Scanner(System.in);
		System.out.print("Color: ");
		String color = in.nextLine();
		System.out.print("Filled (Yes/No)? ");
		String preFill = in.nextLine();
		boolean filled = preFill.equals("Yes")? true: false;
		System.out.print("Width and Height: ");
		double width = in.nextDouble();
		double height = in.nextDouble();
		in.close();
		
		System.out.println("First Rectangle");
		Shape r = new Rectangle(color,filled,width,height);
		System.out.println(r.toString());
		System.out.println("Clonned Rectangle");
		Shape cloneR = (Rectangle) r.clone();
		System.out.println(cloneR.toString());
		if (((Rectangle)r).compareTo(cloneR) == 1) 
			System.out.println("Both Rectangles are identical");
			else
			System.out.println("Rectangles are not identical");
		
	}
}
