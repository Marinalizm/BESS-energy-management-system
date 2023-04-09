package com.hepi.hils.gui.tab;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JCheckBox;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class ControlPanel extends JPanel {
	public ControlPanel() {
		setBorder(new TitledBorder(null, "Control", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setLayout(new GridLayout(3, 2, 2, 2));
		
		JCheckBox chckbxTotalPcsComm = new JCheckBox("Total PCS Comm Error");
		add(chckbxTotalPcsComm);
		
		JButton btnNewButton = new JButton("PCS Control Screen");
		btnNewButton.setHorizontalAlignment(SwingConstants.LEADING);
		btnNewButton.setIcon(new ImageIcon("res\\low-battery1.png"));
		add(btnNewButton);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Total BMS Comm Error");
		add(chckbxNewCheckBox);
		
		JButton btnBmsControlScreen = new JButton("BMS Control Screen");
		btnBmsControlScreen.setHorizontalAlignment(SwingConstants.LEADING);
		btnBmsControlScreen.setIcon(new ImageIcon("res\\electric.PNG"));
		btnBmsControlScreen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		add(btnBmsControlScreen);
	}

}

