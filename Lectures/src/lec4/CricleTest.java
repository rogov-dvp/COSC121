package lec4;

public class CricleTest {
	public static void main(String[] args) {
		
	
	Circle c1 = new Circle(2.0,10,true);
	Circle c2 = new Circle(5.0,4,false);
	
	Rabbit r = new Rabbit();  
	 
	if(c1.compareTo(c2) > 0)                //will be error because compareTo() uses Casting. Compilation Error!!!
		System.out.println("c1 > c2");
	else 
		System.out.println("c2<c1");
	}
}
