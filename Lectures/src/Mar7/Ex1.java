package Mar7;

import java.util.Scanner;

public class Ex1 {
	private static final Exception HowDidThisHappenException = null;
	public static void main(String[] args) throws Exception {
		
		Scanner in = new Scanner(System.in);
		String YeBoi = in.nextLine();
		
		try {
				if( YeBoi.equals("Me Like, Heck Ya"))
		 			Say( "Gimme Gimme ");
				else 
					forceError();               // hehexd
					Say( "Heck Nah, wth?!?    You crazy" );

			} catch (  HowDidThisHappenException e) {
				Say("Gimme Gimme anyways lol");
			}

	}
		public static void forceError() throws Exception {
			throw HowDidThisHappenException;
		}
		
		public static void Say(String s) {
			System.out.println(s);
		}
		
}
