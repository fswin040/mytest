package tw.org.iii.balans;

public class N21比對字串 {

	public static void main(String[] args) {
		String S1 = "123";
		String S2 ="123";
		String S3 = new String ("123");
		String S4 = new String ("123");
		System.out.println(S1.equals(S3));//equals只有在string不同
		Bike b1 =new Bike(123);
		Bike b2 =new Bike(123);
		System.out.println(b1.equals(b2));

		
	}

}
