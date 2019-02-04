package lec7;

import java.io.PrintWriter;

public class Ex6 {
	public static void main(String[] args) throws Exception{
		//1) Open
		PrintWriter out = new PrintWriter("c:OneDrive/Documents/UBC/2019S/cosc121");
		//2) write
		out.println("this is our first example with output streams");
		out.print("word2 in line 2");
		out.print(", word3");
		// 3) Close
		out.close();
		
		System.out.println("Done!");
	}
}
