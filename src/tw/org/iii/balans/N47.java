package tw.org.iii.balans;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class N47 {

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(9999);
			Socket socket = server.accept();
			
			FileOutputStream fout=
					new FileOutputStream("upload/fly.jpg");
			
			
			InputStream in = socket.getInputStream();
			int c ;
			while ((c=in.read())!=-1){
				fout.write(c);
			}
			
			
			in.close();
			fout.flush();
			fout.close();
			
			server.close();
			System.out.println("ok");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
