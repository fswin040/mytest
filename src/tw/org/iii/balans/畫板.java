package tw.org.iii.balans;

import java.awt.BorderLayout;

import javax.swing.JFrame;



public class 畫板 extends JFrame{
	private 畫板2 畫板2;


	public 畫板(){
		super("yoyoyo");
		
		setLayout(new BorderLayout());
		
		畫板2 = new 畫板2();
		add(畫板2, BorderLayout.CENTER);
		
		
		setSize(1024,728);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	public static void main(String[] args) {
		new 畫板();
	}

}
