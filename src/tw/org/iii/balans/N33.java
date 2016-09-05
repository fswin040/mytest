package tw.org.iii.balans;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.channels.FileLockInterruptionException;

import sun.awt.image.FileImageSource;

public class N33 {

	public static void main(String[] args) {
		File file1=new File("lab01/123.txt");
		try {
			int c;
			FileReader reader = new FileReader(file1);
			while((c=reader.read()) != -1){
			System.out.print(reader);
			}
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
