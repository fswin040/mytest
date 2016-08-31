package tw.org.iii.balans;

public class N20建構式 {

	public static void main(String[] args) {
		String S1 = new String();
		byte []b1={97,98,99,100};
		String S2 = new String(b1);
		String S3 = new String(b1,1,3);
		System.out.println(S1);
		System.out.println(S2);
		System.out.println(S3);

	}
	
	public String toString() {
		return super.toString();
	}

}
