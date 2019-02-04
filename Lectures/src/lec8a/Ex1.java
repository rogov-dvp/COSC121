package lec8a;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex1 {
	
	public static void main(String[] args) throws Exception{
		FileOutputStream out = new FileOutputStream("c:/Users/alexa/OneDrive/Documents/UBC/2019S/cosc121/test.txt");
		for(int i = 10; i < 20; i++)
			out.write(i);
		out.close();
		FileInputStream in = new FileInputStream("c:/Users/alexa/OneDrive/Documents/UBC/2019S/cosc121/test.txt");
//		while(in.available()>0)
//		System.out.println(in.read());
		
		int d; // more compact
		while((d=in.read())>0) {
			System.out.println(d);
			d=in.read();
		}
		in.close();
		System.out.println("DONE!");
	}
	
}
