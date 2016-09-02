package tw.org.iii.balans;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class N25繼承關西 extends JFrame implements ActionListener{
	private JButton save,exit,open;
	
	
	
	N25繼承關西() {
		super("小朋友齊打交");
		
		setLayout(new FlowLayout());
		
		open = new JButton("open");
		save = new JButton("save");
		exit = new JButton("exit");
		add (open);add(save);add(exit);
		open.addActionListener(this);
		save.addActionListener(this);
		exit.addActionListener(this); 
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.exit(0);
//			}
//		});
		
		setSize(800, 600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args) {
		new N25繼承關西();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
				if (e.getSource()== open){
					System.out.println("open");
				}else if (e.getSource()== save){
					System.out.println("save");
				}else if (e.getSource()==exit){
					System.exit(0);
				}
	}
}


class Mylisten implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("save");
	}
	
}



