package tw.org.iii.balans;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.LinkedList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.text.html.ParagraphView;

import sun.java2d.cmm.ProfileActivator;

public class 畫板 extends JFrame {
	private 畫板2 畫板2;
	private JButton clean, undo, redo;

	public 畫板() {
		super("yoyoyo");

		setLayout(new BorderLayout());

		畫板2 = new 畫板2();
		add(畫板2, BorderLayout.CENTER);

		clean = new JButton("clean");
		undo = new JButton("undo");
		redo = new JButton("clean");
		JPanel top = new JPanel(new FlowLayout(FlowLayout.LEFT));
		top.add(clean);
		top.add(undo);
		top.add(redo);

		add(top, BorderLayout.NORTH);

		setSize(1024, 728);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		clean.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				clearDrawer();
			}
		});
		undo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				undoDrawer();
			}
		});
		redo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				redoDrawer();
			}
		});

	}

	private void clearDrawer() {
		畫板2.clear();
	}

	private void undoDrawer() {
		畫板2.undo();
	}

	private void redoDrawer() {
		畫板2.redo();
	}

	public static void main(String[] args) {
		new 畫板();
	}

}
