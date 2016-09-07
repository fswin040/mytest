package tw.org.iii.balans;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class N44net {

	public static void main(String[] args) {
		String msg="巭奀嫑夯尻";
		byte[] buf = msg.getBytes();
		
		try {
			DatagramPacket ds = new DatagramPacket(buf,buf.length,InetAddress.getByName("10.1.6.255"),8888);
			DatagramSocket dn = new DatagramSocket();
			dn.send(ds);
			dn.close();
			} catch (Exception e) {
			
		}
	}

}
