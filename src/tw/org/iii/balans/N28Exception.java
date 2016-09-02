package tw.org.iii.balans;

public class N28Exception {

	public static void main(String[] args) {
		try{
		int [] d = {1,2,3,4};
		int a=10 , b= 3;
		int c= a/b;
		System.out.println(c);
		System.out.println(d[2]);
		//runtimeException 找爺爺解決問題
		}catch(RuntimeException ae){
			System.out.println("black");
	}//旁系 直系要照順序 越大越下面
		
//		}catch(ArithmeticException ae){
//			System.out.println("black");
//	}catch(ArrayIndexOutOfBoundsException ae){
//		System.out.println("black");
//}
System.out.println(123);
}
}