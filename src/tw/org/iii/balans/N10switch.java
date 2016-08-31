package tw.org.iii.balans;

public class N10switch {

	public static void main(String[] args) {
		int a = 10 ;
		final int b = 10 ; //固定常數
		switch(a){
		case  1: // CASE不能放變數
			System.out.println("A");
			break;
		case  b : 
			System.out.println("B");
			// break; //break可省略
		case  100: 
			System.out.println("C");
		 	break ;
		 default :
			 System.out.println("D");
			 break ;
		}
	}

}
