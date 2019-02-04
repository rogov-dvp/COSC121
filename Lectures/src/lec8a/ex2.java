package lec8a;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ex2 {
	public static void main(String[] args) throws Exception {
		
		double[] nums = new double[100];
		for(double n: nums) {
			int i = (int)(Math.random()*100001);
			n = i;
		}
		
		DataOutputStream out = new DataOutputStream(new FileOutputStream("c:/Users/alexa/OneDrive/Documents/UBC/2019S/cosc121/test.txt",true)); //false means overwrite data on file
		DataInputStream in = new DataInputStream(new FileInputStream("c:/Users/alexa/OneDrive/Documents/UBC/2019S/cosc121/test.txt"));
		
		for(int i = 0; i<5; i++) 
			out.writeDouble(Math.random());
		
		while(in.available()>7)
			System.out.println(in.readDouble());
		out.close();
		in.close();
	}
}
