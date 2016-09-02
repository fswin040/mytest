package tw.org.iii.balans;

public class N24 {

	public static void main(String[] args) {
		N241 obj1 = new N241();
		obj1.m1();
		N242 obj2 = new N242();
		obj2.m1();
		obj2.m2();
	}
	}
class N241{
	N241(){System.out.println("N241()");}
	int a;
	void m1(){
		System.out.println("M1241");
	}
}
class N242 extends N241{
	void m1(){
		super.m1();
		System.out.println("M1242"+a);
	}
	void m2(){
		System.out.println("M2242");
	}

}
