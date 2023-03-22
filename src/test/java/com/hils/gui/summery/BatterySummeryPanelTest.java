package com.hils.gui.summery;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

import com.hils.gui.MainFrame;
import com.hils.gui.summery.BatterySummeryPanel;

public class BatterySummeryPanelTest {
	
	private void showBattery() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame("HEPI HILS Manager");
					//create BatterySummeryPanel
					frame.setLayout(new GridLayout(1, 10));
					frame.add(new BatterySummeryPanel(100,200));
					frame.add(new BatterySummeryPanel(100,50));
					frame.add(new BatterySummeryPanel(100,100));
					frame.add(new BatterySummeryPanel(200,100));
					frame.add(new BatterySummeryPanel(200,200));					
					frame.add(new BatterySummeryPanel(400,200));
					frame.add(new BatterySummeryPanel(400,300));
					
					
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame.setSize(frame.screenW, frame.screenH);					
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
					frame.setResizable(true);	
					//frame.pack();
					
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
	
	public static void main(String[] args) {		
		BatterySummeryPanelTest app = new BatterySummeryPanelTest();
		app.showBattery();
	}

}
