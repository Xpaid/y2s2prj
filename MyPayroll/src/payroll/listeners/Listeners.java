package payroll.listeners;

import java.awt.Component;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import com.toedter.calendar.JDateChooser;

import authenticator.Authenticator;
import data.Employee;
import payroll.Payroll;
import payroll.employeeList.EmployeeListPnl;
import payroll.employeeViewer.Defaultpanel;
import payroll.employeeViewer.EmployeeViewer;
import payroll.employeeViewer.Employing;
import payroll.functions.Functions;
import tools.Utilities.DarkModeColorPalette;

public interface Listeners extends Functions {

	KeyListener filtercharacter = new KeyAdapter() {

		@Override
		public void keyTyped(KeyEvent e) {
			if (!Functions.isValid(e.getKeyChar())) {
				e.consume();
			}
		}
	};

	ActionListener changeVisibility = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			Functions.passVisibility(Authenticator.passField, Authenticator.eyebtn);
		}
	};

	ActionListener changeAuthWay = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			Functions.changeAuth(Authenticator.authStatelbl, Authenticator.asklbl, Authenticator.changestatebtn);
		}
	};

	ActionListener Sendrequest = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (Functions.isFilled(Authenticator.companyField) && Functions.isFilled(Authenticator.passField)) {
				Authenticator.authFrame.dispose();
				new Payroll();
			}
		}
	};

	ActionListener OptionsActionListener = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			Object source = e.getSource();
			if (source.equals(Payroll.Options)) {
				Payroll.OptionsItems.show(Payroll.Options, 0, Payroll.Options.getHeight());
			} else if (source.equals(Payroll.Settings)) {
				// to be added
			} else {
				int confirm = JOptionPane.showConfirmDialog(Payroll.MainFrame, "Are you sure you want to quit?",
						"Confirm", JOptionPane.YES_NO_OPTION);
				if (confirm == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		}
	};

	ActionListener addEmployee = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			setComponentsEditable();
		}

		private void setComponentsEditable() {
			Defaultpanel.placeholder.setVisible(false);
			Payroll.Defaultpanel.add(new Employing(20, DarkModeColorPalette.SLIGHTLY_LIGHTER_CHARCOAL, 5));
			Employing.ChooseAvatarBtn.setVisible(true);

			setEditable(Employing.txtF_EmployeeFirstName);
			setEditable(Employing.txtF_EmployeeLastName);
			setEditable(Employing.txtF_EmployeeAddress);
			setEditable(Employing.EmployeeBirthDate);
			setEditable(Employing.txtF_EmployeeGender);
			setEditable(Employing.txtF_EmployeeEmail);
			setEditable(Employing.txtf_EmployeeContact);
			setEditable(Employing.txtf_EmployeeWorkLocation);
			setEditable(Employing.txtF_EmployeeJobTitle);
			setEditable(Employing.txtF_EmployeeBankAcc);
			setEditable(Employing.EmployeeStartDate);
			setEditable(Employing.EmployeeContractEnd);
			setEditable(Employing.txtf_EmployeeContact);
			setEditable(Employing.txtF_EmployeeMonthlySalary);
		}

		private void setEditable(Component comp) {

			if (comp instanceof JDateChooser) {
				((JDateChooser) comp).setEnabled(true);
			} else {
				((JTextField) comp).setEditable(true);
				((JTextField) comp).setBorder(
						BorderFactory.createMatteBorder(0, 0, 1, 0, DarkModeColorPalette.MEDIUM_GRAY.darker()));
			}

		}
	};

	ActionListener chooseImage = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			Employing.avatar = Functions.selectImage();
			if (!Employing.avatar.equals(null)) {
				Employing.lbl_EmployeeAvatar
						.setIcon(new ImageIcon(Employing.avatar.getScaledInstance(Employing.lbl_EmployeeAvatar.getWidth(),
								Employing.lbl_EmployeeAvatar.getHeight(), Image.SCALE_AREA_AVERAGING)));
			}

		}
	};

	ListSelectionListener listlistener = new ListSelectionListener() {

		@Override
		public void valueChanged(ListSelectionEvent e) {
			// TODO Auto-generated method stub

		}
	};

	ActionListener Employ = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			Employee Employee = new Employee();

			Employee.setEmployeeAvatar(Employing.avatar);
			Employee.setEmployeeFirstName(Employing.txtF_EmployeeFirstName.getText());
			Employee.setEmployeeLastName(Employing.txtF_EmployeeLastName.getText());
			Employee.setEmployeeAddress(Employing.txtF_EmployeeAddress.getText());
			Employee.setEmployeeBirthDate(Employing.EmployeeBirthDate.getDate());
			Employee.setEmployeeJobTitle(Employing.txtF_EmployeeJobTitle.getText());
			Employee.setEmployeeGender(Employing.txtF_EmployeeGender.getText());
			EmployeeListPnl.listModel.addElement(Employee);
			//System.out.println(Employee.getEmployeeBirthDate());
		}
	};

	ActionListener close = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {


			//Payroll.MainFrame.getContentPane().add(Payroll.Defaultpanel);
			EmployeeViewer.placeholder.setVisible(true);
		}
	};
}
