package tw.org.iii.balans;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class N45收 {

	public static void main(String[] args) {
		byte[] buf = new byte[1024];
		try {
			DatagramPacket ds = new DatagramPacket(buf, buf.length);
			DatagramSocket dn = new DatagramSocket(8888);
			dn.receive(ds);
			dn.close();
			System.out.println("Rec OK");
			
			InetAddress urip = ds.getAddress();
			byte [] data = ds.getData();
			int len= ds.getLength();
			System.out.println(urip + ":"+ new String(data,0,len));
		
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
