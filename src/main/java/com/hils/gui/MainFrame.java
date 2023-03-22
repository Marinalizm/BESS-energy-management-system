package com.hils.gui;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class MainFrame extends JFrame{
	public int screenW = 700;
	public int screenH = 500;
	
	private static MainFrame mainFrame;
	
	public MainFrame(String title) {
		super(title);
		this.setLayout(new BorderLayout());
		
		mainFrame = this;		
	}
	
	public static MainFrame getInstance() {
		return mainFrame;
	}
	

}
