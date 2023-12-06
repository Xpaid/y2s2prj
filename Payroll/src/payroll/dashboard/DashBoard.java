package payroll.dashboard;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import tools.Utilities.DarkModeColorPalette;
import tools.Utilities.RoundedPanel;
import tools.Utilities.RoundedTextField;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class DashBoard extends RoundedPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private RoundedTextField bankBalance;
	private RoundedTextField totalSpent;


	public DashBoard(int radius, Color fillColor, int shadowSize) {
		super(radius, fillColor, shadowSize);
		this.setBounds(550, 200, 865, 115);
		this.setLayout(null);
		
		JLabel bankBalancelbl = new JLabel("Bank Balance:");
		bankBalancelbl.setForeground(DarkModeColorPalette.MEDIUM_GRAY);
		bankBalancelbl.setFont(new Font("Consolas", Font.BOLD, 23));
		bankBalancelbl.setBounds(10, 11, 169, 46);
		this.add(bankBalancelbl);
		
		bankBalance = new RoundedTextField(10, DarkModeColorPalette.SLIGHTLY_LIGHTER_CHARCOAL, 5);
		bankBalance.setBounds(218, 18, 272, 33);
		bankBalance.setText("P100,000,000");
		bankBalance.setForeground(DarkModeColorPalette.GREEN);
		bankBalance.setFont(new Font("Consolas", Font.BOLD, 23));
		bankBalance.setBorder(null);
		add(bankBalance);
		
		JLabel TotalSpentlbl = new JLabel("Total Spent:");
		TotalSpentlbl.setHorizontalAlignment(SwingConstants.TRAILING);
		TotalSpentlbl.setForeground(new Color(204, 204, 204));
		TotalSpentlbl.setFont(new Font("Consolas", Font.BOLD, 23));
		TotalSpentlbl.setBounds(10, 58, 169, 46);
		add(TotalSpentlbl);
		
		totalSpent = new RoundedTextField(10, DarkModeColorPalette.SLIGHTLY_LIGHTER_CHARCOAL, 5);
		totalSpent.setBounds(218, 65, 272, 33);
		totalSpent.setText("P100,000,000");
		totalSpent.setForeground(DarkModeColorPalette.RED);
		totalSpent.setFont(new Font("Consolas", Font.BOLD, 23));
		totalSpent.setBorder(null);
		add(totalSpent);
	}
}
