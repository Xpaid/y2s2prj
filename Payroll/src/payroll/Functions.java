package payroll;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.sql.Struct;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.BorderFactory;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.text.View;

import data.Employee;
import tools.Utilities.DarkModeColorPalette;

public interface Functions {
	
	ActionListener addEmployee = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			setComponentsEditable();
		}
		private void setComponentsEditable() {
			EmployeeViewer.Viewer.setVisible(true);
			EmployeeViewer.EmployBtn.setVisible(true);
			EmployeeViewer.EditAvatarBtn.setVisible(true);
			EmployeeViewer.placeholder.setVisible(false);
			EmployeeViewer.CancelBtn.setVisible(false);
			EmployeeViewer.EditBtn.setVisible(false);
			EmployeeViewer.FireBtn.setVisible(false);
			EmployeeViewer.PayBtn.setVisible(false);

			setEditable(EmployeeViewer.txtF_EmployeeFirstName);
			setEditable(EmployeeViewer.txtF_EmployeeLastName);
			setEditable(EmployeeViewer.txtF_EmployeeAddress);
			setEditable(EmployeeViewer.txtF_EmployeeBirthDate);
			setEditable(EmployeeViewer.txtF_EmployeeGender);
			setEditable(EmployeeViewer.txtF_EmployeeEmail);
			setEditable(EmployeeViewer.txtf_EmployeeContact);
			setEditable(EmployeeViewer.txtf_EmployeeWorkLocation);
			setEditable(EmployeeViewer.txtF_EmployeeJobTitle);
			setEditable(EmployeeViewer.txtF_EmployeeBankAcc);
			setEditable(EmployeeViewer.txtF_EmployeeStartDate);
			setEditable(EmployeeViewer.txtf_EmployeeContact);
			setEditable(EmployeeViewer.txtF_EmployeeMonthlySalary);
			setEditable(EmployeeViewer.txtF_EmployeeHourlyWage);
		}
		private void setEditable(Component comp) {
			((JTextField) comp).setEditable(true);
			((JTextField) comp)
					.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, DarkModeColorPalette.MEDIUM_GRAY.darker()));

		}
	};
	
	ActionListener chooseImage = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			JFileChooser chooser = new JFileChooser();
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

			Employee.setEmployeeFirstName(EmployeeViewer.txtF_EmployeeFirstName.getText());
			Employee.setEmployeeLastName(EmployeeViewer.txtF_EmployeeLastName.getText());
			Employee.setEmployeeJobTitle(EmployeeViewer.txtF_EmployeeJobTitle.getText());
			
			EmployeeListPnl.listModel.addElement(Employee);
		}
	};
	
	ActionListener close = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			EmployeeViewer.Viewer.setVisible(false);
			EmployeeViewer.placeholder.setVisible(true);
		}
	};

	public static boolean isValidEmail(String email) {
		String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
		Pattern pattern = Pattern.compile(emailRegex);
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}
}
