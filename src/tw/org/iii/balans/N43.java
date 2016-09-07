package tw.org.iii.balans;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class N43 extends JFrame{
	private mygame gameview ;
	
	public N43(){
		setLayout(new BorderLayout());
		gameview = new mygame();
		add(gameview,BorderLayout.CENTER);
		
		
		setSize(800,600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	private class mygame extends JPanel{
		private Timer timer;
		private ball myball;
		mygame(){
			timer= new Timer();
			timer.schedule(new ViewTask(), 1000,77);
			myball =new ball (0, 0, 40, 40, Color.black);
		}
		private class ViewTask extends TimerTask{

			@Override
			public void run() {
				repaint();
			}
			
		}
		
		private class ball {
			int x,y,w,h,dx,dy;
			Color color;
			private Timer timer;
			ball(int x,int y,int w,int h,Color color){
				this.x=x;this.y=y;this.w=w;this.h=h;
				this.dx=dx;this.dy=dy;
				this.color = color;
				timer = new Timer();
				timer.schedule(new balltask(), 3000, 100);
			}
			private class balltask extends TimerTask{

				@Override
				public void run() {
					x += dx; y += dy;
					
				}
				
			}
			
			
		}
		
		
		protected void paintComponent(Graphics g){
			super.paintComponent(g);
			Graphics2D g2d = Graphics(g);
			g2d.setColor(myBall.color);
			g2d.fillOval(myBall.x, myBall.y, myBall.w, myBall.h);
		}

		
	}
	
	
	

	public static void main(String[] args) {
		new N43();
	}




	public Graphics2D Graphics(Graphics g) {
		// TODO Auto-generated method stub
		return null;
	}

}
