package com.hepi.hils.gui.tab;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

import com.hepi.hils.vo.tab.PCSStatus;


/**
 * control tab panel
 * @author hyun keun lim 
 *
 */
public class TabPanel extends JPanel{	
	public String title;
	
	
	/**
	//top panel
	//PCS 상태, Battery Status, Control
	//body panel		
	 * gui inital 모양 변경
	*/	
	public TabPanel(String tab1Title) {
		this.title	= tab1Title;
		
		this.setLayout(new BorderLayout(5,5));
		//JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JPanel topPanel = new JPanel(new GridLayout(1,3));
		JPanel pcsStatusPanel = new JPanel(new GridLayout(3,6));
		pcsStatusPanel.setBorder(BorderFactory.createTitledBorder("PCS Status"));
		
		PCSStatus pcsStatus = new PCSStatus(
				PCSStatus.Remote,
				PCSStatus.Ready,
				PCSStatus.Run,
				PCSStatus.Standby,
				PCSStatus.CPMode
		);
		
		
		String[] LABELS = {
			"REMOTE/LOCAL",
			"Ready",
			"Run/Stop",
			"StandBy",
			"CP/CV Mode"
		};
		pcsStatusPanel.add(new JLabel(LABELS[0]));
		pcsStatusPanel.add(new JLabel("2"));
		pcsStatusPanel.add(new JLabel(LABELS[1]));
		pcsStatusPanel.add(new JLabel("4"));
		pcsStatusPanel.add(new JLabel(LABELS[2]));
		pcsStatusPanel.add(new JLabel("6"));
		pcsStatusPanel.add(new JLabel(LABELS[3]));
		pcsStatusPanel.add(new JLabel("8"));
		pcsStatusPanel.add(new JLabel(LABELS[4]));
		pcsStatusPanel.add(new JLabel("10"));
		pcsStatusPanel.add(new JLabel());
		pcsStatusPanel.add(new JLabel());
		pcsStatusPanel.add(new JLabel());		
		pcsStatusPanel.add(new JLabel());		
		pcsStatusPanel.add(new JLabel());
		pcsStatusPanel.add(new JLabel());
		pcsStatusPanel.add(new JLabel());
		pcsStatusPanel.add(new JLabel());
		
		topPanel.add(pcsStatusPanel);
		
		JPanel batteryStatusPanel = new JPanel(new GridLayout(3,5));
		batteryStatusPanel.setBorder(BorderFactory.createTitledBorder("Battery Status"));
		batteryStatusPanel.add(new JCheckBox("1"));
		batteryStatusPanel.add(new JCheckBox("2"));
		batteryStatusPanel.add(new JCheckBox("3"));
		batteryStatusPanel.add(new JCheckBox("4"));
		batteryStatusPanel.add(new JCheckBox("5"));
		batteryStatusPanel.add(new JCheckBox("6"));
		batteryStatusPanel.add(new JCheckBox("7"));
		batteryStatusPanel.add(new JCheckBox("8"));
		batteryStatusPanel.add(new JCheckBox("9"));
		batteryStatusPanel.add(new JCheckBox("10"));
		batteryStatusPanel.add(new JLabel("11"));
		batteryStatusPanel.add(new JLabel("12"));
		batteryStatusPanel.add(new JLabel("13"));
		batteryStatusPanel.add(new JLabel("14"));
		topPanel.add(batteryStatusPanel);	
		
		this.add(topPanel, BorderLayout.NORTH);
		
	}
}
