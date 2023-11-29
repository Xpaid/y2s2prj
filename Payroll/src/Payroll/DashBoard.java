package Payroll;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;

import Tools.Utilities.RoundedPanel;

public class DashBoard extends RoundedPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DashBoard(int radius, Color fillColor, int shadowSize) {
		super(radius, fillColor, shadowSize);
		this.setBounds(550, 200, 865, 115);
		this.setLayout(null);
	}

	
}
