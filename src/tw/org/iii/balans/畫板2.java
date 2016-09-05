package tw.org.iii.balans;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

public class 畫板2 extends JPanel {
	
	
//	@Override
//	public void paint(Graphics g) {
//		// TODO Auto-generated method stub
//		super.paint(g);
//		System.out.println("a");
//	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2d =(Graphics2D)g;
		g2d.setColor(Color.red);
		g2d.setStroke(new BasicStroke(4));
		g2d.drawLine(0, 0, 100, 100);
	}
	
	private class mouse extends MouseAdapter{

		@Override
		public void mousePressed(MouseEvent e) {
			
			super.mousePressed(e);
			System.out.println();
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			super.mouseReleased(e);
			System.out.println();
		}

		@Override
		public void mouseDragged(MouseEvent e) {
			super.mouseDragged(e);
			System.out.println();
		}
	
	}
}
