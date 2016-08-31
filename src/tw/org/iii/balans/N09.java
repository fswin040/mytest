package tw.org.iii.balans;

public class N09 {

	public static void main(String[] args) {
		int a = 10 , b = 3;
		if (a++<=10 && b-- >=3   ){
			System.out.println("ok a:"+ a +"-b:" + b);
		}else{
			System.out.println("XX a:"+ a +"-b:" + b);
		}
//		if (++a<=10 && --b >=3   ){
//			System.out.println("ok a:"+ a +"-b:" + b);
//		}else{
//			System.out.println("XX a:"+ a +"-b:" + b);
//		}
		
	}

}
