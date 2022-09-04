package in.ac.adit;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SereverSocket {
	public static void main(String[] args) {
		try {
			ServerSocket sc= new ServerSocket(3000);
			Socket mysc = sc.accept();
//			System.out.print("Server Connected ...");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
