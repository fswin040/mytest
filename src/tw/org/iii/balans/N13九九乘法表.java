package tw.org.iii.balans;

public class N13九九乘法表 {

	public static void main(String[] args) {
		int i = 1;
		for (int j = 2; j <= 9; j++) {
			for (i = 1; i <= 9; i++) {
				int b = j * i;
				System.out.print(j + "X" + i + "=" + b + "\t");
			}
			System.out.println();
		}

	}
}
