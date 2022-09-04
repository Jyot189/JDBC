package in.ac.adit;



import java.io.IOException;
import java.net.Socket;

public class Myclient {
	public static void main(String[] args) {
		try {
			Socket socket = new Socket("192.168.210.220",3000);
			System.out.print("Connected ...");
		}
		catch(IOException e ) {
			e.printStackTrace();
		}
		
	
	}
}
