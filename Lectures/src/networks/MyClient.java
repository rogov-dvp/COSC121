package networks;

import java.io.*;
import java.net.*;

public class MyClient {
	public static void main(String[] args) throws Exception{
		//Port number 0 --> 1023 are iternally used and cannot be used. BindingException will occur
		Socket socket = new Socket("127.0.0.1",1552); //only works if port number are the same on the client and server. told that it should be the same.
													  //port on client side is different. But the code above is pointing to the server port
		DataInputStream in = new DataInputStream(socket.getInputStream());			//input stream from client to server
		DataOutputStream out = new DataOutputStream(socket.getOutputStream());		//output stream from server to client

		out.writeDouble(20); //to server
		double area = in.readDouble();
		System.out.println("Server says, area is " + area);
		
		in.close();
		out.close();
		socket.close();
	}
}
