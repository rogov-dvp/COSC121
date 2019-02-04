package lec8a;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Robottest {
	public static void main(String[] args) throws Exception{
//		Robot r1 = new Robot(5, 3,"Bob");
//		Robot r2 = new Robot(1, 1,"Steve");
//		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("objects.dat"));
//		out.writeObject(r1);
//		out.writeObject(r1);
//		out.close();
//		System.out.println("DONE!");
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("c:/1/objects.dat"));
		
		Robot rr1 = (Robot)in.readObject();
		Robot rr2 = (Robot)in.readObject();

		rr1.printStatus();
		rr2.printStatus();
		in.close();
	}
}
