package tw.org.iii.balans;

public class N07 {

	public static void main(String[] args) {
		double test = Math.random();
//		int ntest = (int)(test*30+40);
//		System.out.println(ntest);
		int nb = (int)(test*101);
//		System.out.println(nb);
		if (nb>=90){
			System.out.println(nb);
			System.out.println('A');
		}else if (nb>=80){
			System.out.println(nb);
			System.out.println('B');
		}else if(nb>=70){
			System.out.println(nb);
			System.out.println('C');
		}else {
			System.out.println(nb);
			System.out.println('D');
		}
				
	}

}
