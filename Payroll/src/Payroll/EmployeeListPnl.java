package Payroll;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListCellRenderer;

import Tools.Utilities.DarkModeColorPalette;
import Tools.Utilities.RoundedPanel;

public class EmployeeListPnl extends RoundedPanel {
	private DefaultListModel<String> listModel;
	private JList<String> employeeList;
	
	private GridBagConstraints c;

	public EmployeeListPnl(int radius, Color fillColor, int shadowSize) {
		super(radius, fillColor, shadowSize);
		this.setBounds(25, 425, 1200, 625);

		// Create the list model and the custom list
		listModel = new DefaultListModel<>();
		
		employeeList = new JList<>(listModel);
		employeeList.setBackground(DarkModeColorPalette.SLIGHTLY_LIGHTER_CHARCOAL);
		employeeList.setBounds(0, 0, 1200, 625);
		employeeList.setBorder(BorderFactory.createEmptyBorder());
		employeeList.setCellRenderer(new CustomListCellRenderer());
		employeeList.setLayoutOrientation(JList.HORIZONTAL_WRAP);
		employeeList.setVisibleRowCount(-1);
		
		JScrollPane scrollPane = new JScrollPane(employeeList);
		scrollPane.setBorder(null);

		// Create the input field, add button, and remove button
		

		// Attach ActionListener to the add button
		

		// Set the layout and add components to the JPanel
		//setLayout(new GridBagLayout());

		c = new GridBagConstraints();
		c.gridx = 10;
		c.gridy = 10;
		c.fill = GridBagConstraints.BOTH;
		c.weightx = 1.0;
		c.weighty = 1.0;
		this.add(scrollPane, c);

		c.gridy = 1;
		c.weighty = 0.0;
//		JPanel inputPanel = new JPanel();
//		inputPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
//		inputPanel.add(inputField);
//		inputPanel.add(addButton);
//		inputPanel.add(removeButton);
//		this.add(inputPanel, c);

		//this.setVisible(true);
	}

	private class CustomListCellRenderer implements ListCellRenderer<String> {

	    @Override
	    public Component getListCellRendererComponent(JList<? extends String> list, String value, int index,
	                                                  boolean isSelected, boolean cellHasFocus) {
	        RoundedPanel employeePanel = new RoundedPanel(30, DarkModeColorPalette.AMBER, 5);
	        employeePanel.setLayout(new BorderLayout());
	        employeePanel.setPreferredSize(new Dimension(200, 100));
	        employeePanel.setBorder(null);

	        JCheckBox checkBox = new JCheckBox();
	        checkBox.setSelected(isSelected);
	        checkBox.setBackground(employeePanel.getBackground());
	        checkBox.setFocusable(false);
	        employeePanel.add(checkBox, BorderLayout.WEST);

	        JLabel nameLabel = new JLabel(value);
	        nameLabel.setFont(new Font("Consolas", Font.PLAIN, 13));
	        nameLabel.setForeground(DarkModeColorPalette.GREAT_PURPLE);
	        nameLabel.setBackground(employeePanel.getBackground());
	        employeePanel.add(nameLabel, BorderLayout.CENTER);

	        return employeePanel;
	    }
	}
}