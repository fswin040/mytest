package tw.org.iii.balans;

public class N26interface {

	public static void main(String[] args) {
		N262 obj1=new N262();
		N263 obj2=new N263();
		N264 obj3=new N264();
		obj3.m3();
	}
}

	interface N261{
		void m1();
		void m2();
}

	class N262 implements N261{
		public void m1(){System.out.println("N262:m1");}
		public void m2 (){System.out.println("N262:m2");}
}
	class N263 implements N261{
		public void m1(){System.out.println("N263:m1");}
		public void m2 (){System.out.println("N263:m2");}
}
	class N264 {
		void m3(){
			System.out.println();
		}
}
