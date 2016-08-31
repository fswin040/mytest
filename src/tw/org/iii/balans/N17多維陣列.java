package tw.org.iii.balans;

public class N17多維陣列 {

	public static void main(String[] args) {
		int a[][];
		int []b[];
		int [][]c;
		a =new int [3] [4];
		b = new int [3][];
	//	c = new int [ ][4]; 錯的
		b[0]=new int [2];
		b[1]=new int [3];
		b[2]=new int [4];
		
		
		
		//System.out.println(b[2].length);
		
		
		b[0][1]=1;
		b[1][2]=2;
		b[2][3]=3;
		for(int i = 0 ; i<b.length;i++){
			for(int v=0;v<b[i].length;v++){
				System.out.print(b[i][v]);
			}System.out.println();
		}
	
	}

}
