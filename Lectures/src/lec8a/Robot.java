package lec8a;

import java.io.Serializable;

public class Robot implements Serializable{
	public int x,y;
	public String name;
	
	public Robot(int x, int y, String name) {
		super();
		this.x = x;
		this.y = y;
		this.name = name;
	}

	public void printStatus() { 
		System.out.printf("%s is at %d,%d",name,x,y);
	}
	
}
