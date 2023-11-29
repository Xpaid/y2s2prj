package Payroll;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

public class EmployeeFunction {
	private JTextField inputField  = new JTextField(20);
	private JButton addButton = new JButton("Add");;
	private JButton removeButton = new JButton("Remove");
	
	ActionListener actionListener = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			String item = inputField.getText();
			if (!item.isEmpty()) {
				//listModel.addEslement(item);
				inputField.setText("");
			}
		}
	};

	// Attach ActionListener to the remove button
	ActionListener ActionListener = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			//int selectedIndex = employeeList.getSelectedIndex();
			/*
			 * if (selectedIndex != -1) { //listModel.remove(selectedIndex); }
			 */
		}
	};
}
