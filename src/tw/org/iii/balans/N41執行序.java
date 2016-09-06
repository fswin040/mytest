package tw.org.iii.balans;

public class N41執行序 {

	public static void main(String[] args) {
		N411 obj1= new N411("A");
		obj1.start();
		N411 obj2= new N411("B");
		obj2.start();
	}
}
class N411 extends Thread{
	String name;
	N411(String name){
		this.name = name;
	}
	
	@Override
	public void run() {
		
		
		for(int i = 1 ; i<=10;i++){
			
			try {
				Thread.sleep(50);
				System.out.println(name+"-"+i);
			} catch (InterruptedException e) {
				
			}
		}
	}
}
