package lec1;

public class Main {
	public static void main(String[] args) {
		Shape sh1 = new Shape();
		Shape sh2 = new Shape("Red", false);
		
		sh1.setColour("White");
		
		System.out.println(sh1);
		System.out.println(sh2);
		
	}
}
