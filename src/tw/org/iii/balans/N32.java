package tw.org.iii.balans;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileLockInterruptionException;

import sun.awt.image.FileImageSource;

public class N32 {

	public static void main(String[] args) {
		File file1=new File("lab01/123.txt");
		long len = file1.length();
//		System.out.println(file1.getAbsolutePath());
		if(file1.exists()){
			System.out.println("ok");
		}
		
		try {
			FileInputStream file9=new FileInputStream(file1);
			int c ;
			byte []buf=new byte[(int)len];
			c=file9.read(buf);
			System.out.println(new String(buf));
//			while ((c=file9.read())!=-1){
//				System.out.print((char)c);
//			}
			
			
			file9.close();
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		
	}

}
