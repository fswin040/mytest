package tw.org.iii.balans;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class N34 {

	public static void main(String[] args) {
		try {
			FileOutputStream write = new FileOutputStream("lab01/test1.txt",true);//梅家TRUE會被複寫
			write.write("123456789".getBytes()); // 覆蓋內容
			write.flush();
			write.close();
			System.out.println("ok");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
