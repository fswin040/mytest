package tw.org.iii.balans;

public class N30 {

	public static void main(String[] args) {
		N301 obj1 =new N301();
		obj1.m1();
	}
}
class N301{
	void m1(){
	int a = 10,b=3;
	
	try{
		System.out.println(a/b);
		
	}catch(Exception ee){
		System.out.println("GG");
	}finally{
		System.out.println("finally");
	}System.out.println("gameover");
	}
}
