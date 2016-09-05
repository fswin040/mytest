package tw.org.iii.balans;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;

import javax.print.DocFlavor.INPUT_STREAM;
import javax.print.attribute.standard.JobMessageFromOperator;

public class N35 {

	public static void main(String[] args) {
		try {
			FileInputStream N351 = new FileInputStream("lab01/123.txt");
			InputStreamReader isr  = new InputStreamReader(N351);
			BufferedReader br = new BufferedReader(isr);
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
