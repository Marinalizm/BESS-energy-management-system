package com.hils.gui.summery;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.nio.file.DirectoryNotEmptyException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;

import lombok.AllArgsConstructor;
import lombok.Data;

public class SummeryPanel extends JPanel {
	private String title = "PCS/BMS Summery";

	public SummeryPanel() {
		Border border = BorderFactory.createTitledBorder(title);
		this.setBorder(border);
		this.setLayout(new FlowLayout());		
		
		//mfix how many group
		PCSBMSSummery pcsbmsSummery1 = new PCSBMSSummery();		
		this.add(pcsbmsSummery1);
		PCSBMSSummery pcsbmsSummery2 = new PCSBMSSummery();		
		this.add(pcsbmsSummery2);
	}
	
	
}

class PCSBMSSummery extends JPanel{
	
	public PCSBMSSummery() {
		Border border = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
		FlowLayout layout = new  FlowLayout();		
		this.setLayout(layout);
		
		this.setBorder(border);		
		
		
		BatterySummeryPanel battery = new BatterySummeryPanel(1, 40);
		this.add(battery);
		PCSSummeryPanel pcs = new PCSSummeryPanel();
		this.add(pcs);
		BMSummeryPanel bms = new BMSummeryPanel();
		this.add(bms);	
		
	}
}

/**
 * pcs summery
 */
class PCSSummeryPanel extends JPanel {
	String[] str = { "PCS Fault", "지령값", "유효전력", "DC전압", "DC전류", "Fault" };
	JButton 	detailBTN = new JButton("...");
	
	JLabel labelReferValue; // 지령값
	JLabel labelActivePower;// 유효전력
	JLabel labelDcVoltage; 	// dc전압
	JLabel labelDcCurrent; 	// dc전류
	JLabel labelFault; 		// 누락 카운트
	
	
	public PCSSummeryPanel() {
		this.setLayout(new GridLayout(6, 2));
		//data load
		//sample data
		PCSSummery summery = new PCSSummery(true,0.0, 0.0, 876.7,1.7,1);
		
		JCheckBox 	checkBox = new JCheckBox(str[0], summery.isPCS_FAULT());	
		
		labelReferValue =new JLabel(summery.getReferValue()+"", SwingConstants.RIGHT);
		labelActivePower=new JLabel(summery.getActivePower()+"", SwingConstants.RIGHT);
		labelDcVoltage 	=new JLabel(summery.getDcVoltage()+"", SwingConstants.RIGHT);
		labelDcCurrent 	=new JLabel(summery.getDcCurrent()+"", SwingConstants.RIGHT);
		labelFault 		=new JLabel(summery.getFault()+"", SwingConstants.RIGHT);
		
		//gui	
		this.add(checkBox);
		this.add(detailBTN);
		
		this.add(new JLabel(str[1], SwingConstants.RIGHT));
		this.add(labelReferValue);
		this.add(new JLabel(str[2], SwingConstants.RIGHT));
		this.add(labelActivePower);
		this.add(new JLabel(str[3], SwingConstants.RIGHT));
		this.add(labelDcVoltage);
		this.add(new JLabel(str[4], SwingConstants.RIGHT));
		this.add(labelDcCurrent);
		this.add(new JLabel(str[5], SwingConstants.RIGHT));
		this.add(labelFault);			
	}

}

class BMSummeryPanel extends JPanel {
	String[] str = { "PCS Fault", "지령값", "유효전력", "DC전압", "DC전류", "Fault" };	
	JButton detailBTN = new JButton("...");
	
	JLabel labelSoc;
	JLabel labelSoh;
	JLabel labelDcVoltage; // dc전압
	JLabel labelDcCurrent; // dc전류
	JLabel labelBMS_HB; // guess high voltage
	
	
	public BMSummeryPanel() {
		this.setLayout(new GridLayout(6, 2));
		//data load
		BMSSummery summery = new BMSSummery(false,45.5, 100.0, 873.3,0.0,3);
		
		JCheckBox 	checkBox = new JCheckBox(str[0], summery.isBMS_FAULT());
		
		labelSoc 		=new JLabel(summery.getSoc()+"", SwingConstants.RIGHT);
		labelSoh		=new JLabel(summery.getSoh()+"", SwingConstants.RIGHT);
		labelDcVoltage 	=new JLabel(summery.getDcVoltage()+"", SwingConstants.RIGHT);
		labelDcCurrent 	=new JLabel(summery.getDcCurrent()+"", SwingConstants.RIGHT);
		labelBMS_HB 	=new JLabel(summery.getBMS_HB()+"", SwingConstants.RIGHT);
			
		//gui				
		this.add(checkBox);
		this.add(detailBTN);
		
		this.add(new JLabel(str[1], SwingConstants.RIGHT));
		this.add(labelSoc);
		this.add(new JLabel(str[2], SwingConstants.RIGHT));
		this.add(labelSoh);
		this.add(new JLabel(str[3], SwingConstants.RIGHT));
		this.add(labelDcVoltage);
		this.add(new JLabel(str[4], SwingConstants.RIGHT));
		this.add(labelDcCurrent);
		this.add(new JLabel(str[5], SwingConstants.RIGHT));
		this.add(labelBMS_HB);	
		
	}
	
}
@AllArgsConstructor
@Data
class PCSSummery {
	boolean PCS_FAULT;

	double referValue; // 지령값
	double activePower; // 유효전력
	double dcVoltage; // dc전압
	double dcCurrent; // dc전류
	int fault; // 누락 카운트
}

@AllArgsConstructor
@Data
class BMSSummery {
	boolean BMS_FAULT;

	double soc;
	double soh;
	double dcVoltage; // dc전압
	double dcCurrent; // dc전류
	int BMS_HB; // guess high voltage
}
