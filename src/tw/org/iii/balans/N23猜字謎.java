package tw.org.iii.balans;

import javax.print.attribute.standard.JobMessageFromOperator;
import javax.swing.JOptionPane;

public class N23猜字謎 {

	public static void main(String[] args) {
//		1.設定題目
		String answer = arcAns() ;
//		2.開始遊戲
		for (int i=0;i<3;i++){
//		3.猜
		String guess =JOptionPane.showInputDialog("輸入");
//		4.檢查是否正確
		String chack = chackAB(guess , answer);
		JOptionPane.showMessageDialog(null, guess +""+ chack );
		}
//		5.final結果
//		int answer ;
		
		
	}
			static String arcAns(int n){
			// 洗牌
			int[] poker = new int[n];
			for (int i=0; i<poker.length; i++){
				int temp;
				// 檢查機制
				boolean isRepeat;
				do {
					temp = (int)(Math.random()*10);
					isRepeat = false;
					for (int j=0; j<i; j++){
						if (temp == poker[j]){
							isRepeat = true;
							break;
						}
					}
				}while(isRepeat);
				poker[i] = temp;
			}
			String ret = "";
			for (int p : poker)ret += p;
			
			return ret;
		}
	static String chackAB(String a, String g){
		int A , B ;	A = B = 0 ;
		for(int i =0 ; i <=g.length;i++){
			if(g.charAt(i)==a.charAt(i)){
				A++;
			}else{g.indexOf(a.charAt(i)!=1)
				
			}
		}
		
		
		return "1A1B";
	}

}
