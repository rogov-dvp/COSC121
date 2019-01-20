package lec4;

public class CircleCloneTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		Circle c1 = new Circle(2,5,false);
		//.......
		Circle c2 = (Circle)c1.clone();

			c1.setRadius(10);
			
			System.out.println(c1.getRadius());
			System.out.println(c2.getRadius());
		
	}
}
