package networks;

import java.io.*;
import java.net.*;

public class MyServer {
	public static void main(String[] args) throws Exception{
		//SERVER MUST START FIRST BEFORE WORKING.
		//step1
		ServerSocket ss = new ServerSocket(1552);	
		System.out.println("Server running and waiting...");
		//step2
		Socket socket = ss.accept();		//now i have client info
		//step3
		DataInputStream in = new DataInputStream(socket.getInputStream());			//input stream from client to server
		DataOutputStream out = new DataOutputStream(socket.getOutputStream());		//output stream from server to client
		
				//server READS first then WRITES. client is vice-versa
		double r = in.readDouble(); //coming from client
		double area = Math.PI*r*r;
		out.writeDouble(area);  	//going to client
		
		//step4
		in.close();
		out.close();
		socket.close();
		ss.close();
			
	}
}
