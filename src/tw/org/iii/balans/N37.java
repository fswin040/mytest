package tw.org.iii.balans;

import java.io.FileInputStream;
import java.io.ObjectInputStream;


public class N37 {
//讀資料
	public static void main(String[] args) {
		try {
			ObjectInputStream oin = 
				new ObjectInputStream(
					new FileInputStream("lab01/s.dat"));
			Object obj = oin.readObject();
			student s1 = (student)obj;
			oin.close();
			System.out.println(s1.gettotle());
			System.out.println(s1.getAvg());
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
