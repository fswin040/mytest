package tw.org.iii.balans;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.jar.JarOutputStream;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import jdk.jfr.events.FileWriteEvent;



public class MYED extends JFrame{
	private JButton open,save,exit;
	private JTextArea editor;
	private File openFile;

	
	MYED(){
		super("MYED");
		setLayout(new BorderLayout());
		open = new JButton("Open");
		save = new JButton("Save");
		exit = new JButton("Exit");
		JPanel top = new JPanel(new FlowLayout(FlowLayout.LEFT));
		top.add(open);top.add(save);top.add(exit);
		add(top, BorderLayout.NORTH);
		
		editor = new JTextArea();
		add(editor, BorderLayout.CENTER);
		
		editor = new JTextArea();
		JScrollPane jsp = new JScrollPane(editor);
		add(jsp, BorderLayout.CENTER);
		
	setSize(800, 600);
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	open.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			doopen();
		}
	});
	save.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			dosave();
		}
	});
	exit.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	});
	
	
	
	}
	public void doopen(){
		JFileChooser jfc = new JFileChooser();
		if (jfc.showOpenDialog(null)==
				JFileChooser.APPROVE_OPTION){
			openFile = jfc.getSelectedFile();
			readFile();
	}
	}
		private void readFile(){
			if (openFile==null) return;
			editor.setText("");
			try {
				FileReader MYED = new FileReader(openFile);
				int c;
				while ( (c = MYED.read()) != -1){
					editor.append("" + (char)c);
				}
				MYED.close();
			} catch (Exception e) {
			}
		}
		
	public void dosave(){
		if(openFile==null)return;
		try {
			FileWriter MYED = new FileWriter(openFile);
			MYED.write(editor.getText());
			MYED.flush();
			MYED.close();
			JOptionPane.showMessageDialog(null, "OK");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new MYED();
	}

}
