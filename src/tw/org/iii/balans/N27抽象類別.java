package tw.org.iii.balans;


public class N27抽象類別 {

	public static void main(String[] args) {
		N271 obj4 = new N271();
//		N272 obj3 =new N272();
		N273 obj1 = new N273();
		N274 obj2 = new N274();
		
	}

}
class N271{
	void m1(){};
	void m2(){};
}
//抽象列別依定要有建構式
abstract class N272{
	N272(){
		System.out.println("123");
	}
	abstract void m1();
	void m2(){}
}

class N273 extends N272 {
	void m1(){
		System.out.println("123");
	}
}
class N274 extends N272 {
	void m1(){
		System.out.println("456");
	}
}
















