package com.hils.gui.summery;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

import com.hils.gui.MainFrame;
import com.hils.gui.summery.SummeryPanel;

public class SummeryPanelTest {

	public static void main(String[] args) {
		SummeryPanelTest app = new SummeryPanelTest();
		app.showSummery();

	}

	private void showSummery() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame("HEPI HILS Manager");
					//create BatterySummeryPanel
					frame.setLayout(new BorderLayout());
					frame.add(new SummeryPanel(), BorderLayout.CENTER);
					
					
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					//frame.setSize(frame.screenW, frame.screenH);					
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
					frame.setResizable(true);	
					frame.pack();
					
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
