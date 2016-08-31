package tw.org.iii.balans;

import java.util.Arrays;

public class 洗牌系統 {

	public static void main(String[] args) {
		int [] poker = new int[52];
		for(int i=0;i<poker.length;i++){
			int temp = (int)(Math.random()*52);
		boolean isRepeat ;
		do{
			temp = (int)(Math.random()*52);
			isRepeat = false;
			for (int j=0;j<i;j++){
				if(temp == poker[j]){
					isRepeat = true;
					break;
				}
			}
		}while(isRepeat);
//		System.out.println(temp);
		poker[i]=temp;
		
		}
		int[][]player = new int [4][13];
		for(int i = 0 ; i<poker.length;i++){
		player[i%4][i/4]=poker[i];
		}
		
		
		String [] suit = {"黑桃","紅心","方塊","梅花"};
		String [] value = {"A","2","3","4","5","6","7","8"
				,"9","10","J","Q","K"
		};
		
		for(int []cards:player){
			Arrays.sort(cards);
			for(int card : cards){
				System.out.print(suit[card/13]+value[card%13]+"   ");
			}
			System.out.println();
		}
	}

}
