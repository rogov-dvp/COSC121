package lab3;

public class Dove extends Bird implements Flyable{
	
	public int age;
	
	public Dove(int age) {  						// Method for age because abstract class (Bird)
		this.age = age;
	}
	
	public void howToFly() {						//Overrides' Flyable
		System.out.println("It flaps it's wings!");
	}
}
