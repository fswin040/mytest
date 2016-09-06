package tw.org.iii.balans;

public class N41執行序 {

	public static void main(String[] args) {
		N411 obj1= new N411("A");
		N411 obj2= new N411("B");
		N412 obj3= new N412("C");
		Thread t1 = new Thread(obj3);
		obj1.start();
		obj2.start();
		System.out.println("main");
		//start只有一條命 RUN可以跑很多條
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			}
		System.out.println("main");
		obj2.interrupt();
	}
}
class N411 extends Thread{
	String name;
	N411(String name){
		this.name = name;
	}
	
	@Override
	public void run() {
		
		
		for(int i = 1 ; i<=8;i++){
			
			try {
				Thread.sleep(1000);
				System.out.println(name+"-"+i);
			} catch (InterruptedException e) {
				break;
			}
		}
	}
}
	class N412 implements Runnable{
		String name;
		N412(String name){
			this.name = name;
		}
		
		@Override
		public void run() {
			
			
			for(int i = 1 ; i<=8;i++){
				
				try {
					Thread.sleep(100);
					System.out.println(name+"-"+i);
				} catch (InterruptedException e) {
					break;
				}
			}
		}
}
