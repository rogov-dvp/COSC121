package lec7;

import java.io.*; // works for imports below except URL
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.net.URL;


public class ex9 {
	public static void main(String[] args) throws Exception{
		// 1) open
		URL url = new URL("http://libteam.ok.ubc.ca");
		BufferedReader in = new BufferedReader(new InputStreamReader(url.openConnection()));		//InputSTreamReader has
		// 2) read
		String s = in.readLine();
		while(s != null) {
			System.out.println(s);
			s = in.readLine();
		}
		in.close();
	}
}
