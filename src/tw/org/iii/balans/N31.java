package tw.org.iii.balans;

import java.io.File;
import java.io.IOException;

import sun.font.CreatedFontTracker;

public class N31 {

	public static void main(String[] args) {
		 File file1 = new File("c:/test/fill1"); //檔案
		 if(file1.isFile()){
			 System.out.println("OK");
		 }else{
			 try{
				 file1.createNewFile();
			 }catch(IOException ee){
				 System.out.println("XX");
			 }
		 }
		 
		 File file2= new File("c:/test/file2/1/5/161/65/16156/1/151/6");
		 if(!file2.isDirectory()){ //資料夾
			 file2.mkdirs();
		 }
		 
		
	}
		
}
