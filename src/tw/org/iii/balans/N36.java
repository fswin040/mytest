package tw.org.iii.balans;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;


//存取資料
public class N36 {
	
	public static void main(String[] args) {
		student s1 = new student(76, 54, 43);
		System.out.println(s1.gettotle());
		System.out.println(s1.getAvg());
		try {
			ObjectOutputStream oot = new ObjectOutputStream(
					new FileOutputStream("lab01/s.dat"));
			oot.writeObject(s1);
			oot.flush();
			oot.close();
		} catch (IOException e) {
			System.out.println("Exception: " + e.toString());		}
	}
	
}
class student implements Serializable {
	int en,eng,math;
	student (int en,int eng,int math){
		this.en=en;this.eng=eng;this.math=math;
		}
	int gettotle(){
		return en+eng+math ;
	}
	double getAvg(){
		return gettotle()/3.0 ;
	}
}