
package Payroll;

import Tools.Utilities;

import javax.swing.JFrame;


public class Payroll implements Utilities{

	private JFrame Payroll_Frame;

	public Payroll() {
		init_Payroll();
	}

	private void init_Payroll() {
		Payroll_Frame = new JFrame();
		Payroll_Frame.setIconImage(App_icon);
		Payroll_Frame.setBounds(0, 0, 1920, 1080);
		Payroll_Frame.setResizable(false);
		Payroll_Frame.getContentPane().setLayout(null);
		Payroll_Frame.getContentPane().setBackground(Utilities.light);
		
		
		Payroll_Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Payroll_Frame.setVisible(true);

	}
}
