package tw.org.iii.balans;

public class 骰子 {

	public static void main(String[] args) {
		int []p =new int[6] ;	
		for(int i=0;i<=1000000;i++){
		int point =(int)(Math.random()*9);
		p[point>=6?point-3:point]++; //灌鉛
	}
		for(int i = 0;i<p.length;i++){
		System.out.println((i+1)+"點"+p[i]+"次");
	}
	}
}
