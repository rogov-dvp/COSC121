package assignment2;

import java.util.Scanner;

public class TestHexagon {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		
		Scanner in = new Scanner(System.in); //Asks Hexagon's attributes
		System.out.print("Side Length ");      
		double length = in.nextDouble();						// length 
		in.nextLine();											// Separates color from filled
		System.out.print("Color? ");
		String color = in.nextLine();							// color
		System.out.print("Filled (Yes/No)? ");
		String preFill = in.nextLine();							// String pre-filled
		boolean filled = preFill.equals("yes")? true : false;   // changing String to boolean
		in.close();												// close Scanner

		Shape h = new Hexagon(length,color,filled);  			//Create Object with user's attributes
		System.out.println("First Hexagon");	
		System.out.println(h.toString()); 						// Set to String
				
		Shape cloneH = (Hexagon) h.clone(); 
		System.out.println("Clonned Hexagon");
		System.out.println(cloneH.toString());
		if (((Hexagon)h).compareTo(cloneH) == 1) 
			System.out.println("Both Hexagons are identical");
			else
			System.out.println("Both Hexagons are not identical");
		}
	}		

