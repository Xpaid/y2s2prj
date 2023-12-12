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
import payroll.employeeViewer.RightContainer;
import payroll.employeeViewer.Defaultpanel;
import payroll.employeeViewer.Employing;
import payroll.functions.Functions;
import tools.Utilities.DarkModeColorPalette;

public interface Listeners extends Functions {
	KeyListener onlynumber = new KeyAdapter() {
		@Override
		public void keyTyped(KeyEvent e) {
			if (!Functions.isNumber((e.getKeyChar()))) {
				e.consume();
			}
		}
	};

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
			Functions.addEmployee();
		}
	};

	ActionListener chooseImage = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			Image avatar = Functions.selectImage();
			if (avatar.equals(null)) {
				Employing.lbl_EmployeeAvatar.setIcon(null);
			}

		}
	};

	ActionListener Employ = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (Functions.areAllFieldsNotBlank()) {
				Payroll.RightContainer.employing.setVisible(false);
				Payroll.RightContainer.defaultpanel.setVisible(true);

				Employee Employee = new Employee();
				Employee.setEmployeeAvatar((Image) Employing.lbl_EmployeeAvatar.getIcon());
				Employee.setEmployeeFirstName(Employing.txtF_EmployeeFirstName.getText());
				Employee.setEmployeeLastName(Employing.txtF_EmployeeLastName.getText());
				Employee.setEmployeeAddress(Employing.txtF_EmployeeAddress.getText());
				Employee.setEmployeeBirthDate(Employing.EmployeeBirthDate.getDate());
				Employee.setEmployeeJobTitle(Employing.txtF_EmployeeJobTitle.getText());
				Employee.setEmployeeGender(Employing.txtF_EmployeeGender.getText());
				EmployeeListPnl.listModel.addElement(Employee);

				Functions.clearFields();
			}

			// System.out.println(Employee.getEmployeeBirthDate());
		}
	};

	ListSelectionListener listlistener = new ListSelectionListener() {

		@Override
		public void valueChanged(ListSelectionEvent e) {
			// TODO Auto-generated method stub

		}
	};

	ActionListener close = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			Functions.clearFields();
			Functions.close();
		}
	};
}
