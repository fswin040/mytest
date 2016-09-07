package tw.org.iii.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;



public class N46 {

	public static void main(String[] args) {
		try {
			File sendFile = new File("lab01/fly.jpg");
			byte[] buf= new byte [(int)sendFile.length()];
			FileInputStream fil=new FileInputStream(sendFile);
			fil.read(buf);
			fil.close();
			Socket socket = new Socket(
					InetAddress.getByName("10.1.6.80"), 9999);
				
			OutputStream out = socket.getOutputStream();
			
			out.write(buf);
			out.flush();
			out.close();
			socket.close();
			System.out.println("ok");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
