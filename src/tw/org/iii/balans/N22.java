package tw.org.iii.balans;

public class N22 {
	public String id ;
	
	public N22(String id){
		this.id = id ;
	}
	
	int getAs(){
		return 1 ;
	}
	
	
	boolean 性別(){
		return id.charAt(1)==2;
	}
	
	public N22(){
		
	}
	public N22(int ares){
		
	}
	public N22(boolean gender){
		
	}
	public N22(int ares,boolean gender){
	
}
	
	
	static boolean isReight(String id){
		boolean ret = false;
		if(id.matches("^[A-Z][12][0-9]{8}$")){ //正則運算
		String check = "ABCDEFGHJKLMNPQRSTUVXYWZIO";
		int N12= check.indexOf(id.charAt(0))+10;
		int	N1 = N12/10;
		int	N2 = N12%10;
		int N3 = Integer.parseInt(id.substring(1,2));
		int N4 = Integer.parseInt(id.substring(2,3));
		int N5 = Integer.parseInt(id.substring(3,4));
		int N6 = Integer.parseInt(id.substring(4,5));
		int N7 = Integer.parseInt(id.substring(5,6));
		int N8 = Integer.parseInt(id.substring(6,7));
		int N9 = Integer.parseInt(id.substring(7,8));
		int N10 = Integer.parseInt(id.substring(8,9));
		int N11 = Integer.parseInt(id.substring(9,10));
		int sum = N1*1+N2*9+N3*8+N4*7+N5*6+N6*5+N7*4+N8*3+N9*2+N10*1+N11*1;
				
			ret = sum%10==0;
		
	}return ret;
	}
	
}
