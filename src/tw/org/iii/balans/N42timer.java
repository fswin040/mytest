package tw.org.iii.balans;

import java.util.Timer;
import java.util.TimerTask;

public class N42timer {

	public static void main(String[] args) {
		Mytask timer = new Mytask(name);
		Timer t1 = new Timer("A");
		Timer t2 = new Timer("B");

		t1.schedule(timer, 0,1000);
		t2.schedule(timer, 0,1000);

	}

}
class Mytask extends TimerTask{
	private String name;
	private int i ;
	Mytask (String name){
		this.name=name;
	}
	
	
	@Override
	public void run() {
		System.out.println("123");
	}
}