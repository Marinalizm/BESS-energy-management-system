package com.hils;

import java.awt.EventQueue;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

import com.hils.gui.MainFrame;

public class App {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame("HEPI HILS Manager");
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame.setSize(frame.screenW, frame.screenH);
					frame.pack();
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
					frame.setResizable(true);	
					
					
					frame.addWindowListener(new WindowAdapter() {
						@Override
						public void windowClosing(WindowEvent e) {
							System.exit(0);
						}
					});
				} catch (Exception e) {
					e.printStackTrace();
				} 
			}
		});				

	}

}
