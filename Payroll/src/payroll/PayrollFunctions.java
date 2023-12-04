package payroll;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public interface PayrollFunctions {
	ActionListener OptionsActionListener = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			Object source = e.getSource();
			if (source.equals(Payroll.Options)) {
				Payroll.OptionsItems.show(Payroll.Options, 0, Payroll.Options.getHeight());
			} else if (source.equals(Payroll.Settings)) {
				// to be added
			} else {
				int confirm = JOptionPane.showConfirmDialog(Payroll.MainFrame, "Are you sure you want to quit?", "Confirm", JOptionPane.YES_NO_OPTION);
				if (confirm == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		}
	};
}
