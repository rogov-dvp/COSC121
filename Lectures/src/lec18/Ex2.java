package lec18;

import java.io.File;

public class Ex2 {
	public static void main(String[] args) {
		File file = new File("C:/Users/alexa/OneDrive/Documents/UBC/2019s/Engl153/The First Syrota.doc");
		System.out.println(size(file));
	}
	
	private static long size(File file) { // looking for a file size or if it is a folder, it will dig deeper
		if(file.isFile())
			return file.length();
		else { // file is a folder, then compute the sum of all elements inside this folder
			long sum = 0;
				for(File elem: file.listFiles())
					sum += size(elem);
				return sum;
		}
	}
}
