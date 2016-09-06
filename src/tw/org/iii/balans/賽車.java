package tw.org.iii.balans;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 賽車 extends JFrame {
	private JButton go;
	private JLabel[] lanes;
	private int rank;
	
	public 賽車(){ 
		super ("racing");
		go= new JButton("go");
		add(go);
		setLayout(new GridLayout(9, 1));
		//定義位置
		//跑道
		lanes = new JLabel[8];
		for(int i =0;i<lanes.length;i++){
			lanes[i]=new JLabel((i+1)+". ");
			add(lanes[i]);					
		}
		
		go.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				go();
			}
		});
		
		
		//視窗大小
		setSize(1027,700);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	private void go(){
		car[] cars =new car[8];
		for(int i=0;i<cars.length;i++){
			cars[i]=new car(i);
		}
		for(int i=0;i<cars.length;i++){
			cars[i].start();
		}
		
	}
	private class car extends Thread{
		private int num;
		car(int num){
			this.num=num;
		}
		@Override
		public void run() {
			for(int i=0;i<70;i++){
				lanes[num].setText(lanes[num].getText()+">>");
				try {
					Thread.sleep((int)(Math.random()*200));
				} catch (InterruptedException e) {
				}
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		new 賽車();
	}

}
