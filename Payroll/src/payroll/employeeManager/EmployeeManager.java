package payroll.employeeManager;

import java.awt.Color; 
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import payroll.functions.Functions;
import payroll.listeners.Listeners;
import tools.Utilities;
import tools.Utilities.DarkModeColorPalette;
import tools.Utilities.RoundedPanel;

public class EmployeeManager extends RoundedPanel implements Listeners {

	public static JTextField SearchField;
	private JButton SearchBtn;
	public  JButton PlusBtn;
	private JButton FilterBtn;
	private JButton PayAllBtn;
	private JButton SelectAllBtn;
	
	public EmployeeManager(int radius, Color fillColor, int shadowSize) {
		super(radius, fillColor, shadowSize);
		this.setBounds(550, 365, 675, 50);
		this.setLayout(null);
		setSearchField();
		setSearchBtn();
		setFilterBtn();
		setPlusBtn();
		setPayAllBtn();
		setSelectAllBtn();
	}

	private void setSearchField() {
		SearchField = new JTextField("Search");
		SearchField.setBounds(20, 12, 334, 30);
		SearchField.setForeground(DarkModeColorPalette.MEDIUM_GRAY);
		SearchField.setBackground(DarkModeColorPalette.SLIGHTLY_LIGHTER_CHARCOAL);
		SearchField.setFont(new Font("Consolas", Font.PLAIN, 15));
		SearchField.setBorder(null);
		this.add(SearchField);
	}
	private void setSearchBtn() {
		SearchBtn = new JButton("Go");
		SearchBtn.setBounds(380, 10, 30, 30);
		SearchBtn.setIcon(new ImageIcon(Utilities.search_img.getScaledInstance(SearchBtn.getWidth(),
				SearchBtn.getHeight(), Image.SCALE_SMOOTH)));
		SearchBtn.setBackground(DarkModeColorPalette.SLIGHTLY_LIGHTER_CHARCOAL);
		SearchBtn.setHorizontalAlignment(SwingConstants.CENTER);
		SearchBtn.setContentAreaFilled(false);
		SearchBtn.setFocusable(false);
		SearchBtn.setBorder(null);
		this.add(SearchBtn);

	}

	private void setFilterBtn() {
		FilterBtn = new JButton("Filter");
		FilterBtn.setBounds(430, 13, 25, 25);
		FilterBtn.setIcon(new ImageIcon(Utilities.filter_img.getScaledInstance(FilterBtn.getWidth(),
				FilterBtn.getHeight(), Image.SCALE_SMOOTH)));
		FilterBtn.setBackground(DarkModeColorPalette.SLIGHTLY_LIGHTER_CHARCOAL);
		FilterBtn.setHorizontalAlignment(SwingConstants.CENTER);
		FilterBtn.setContentAreaFilled(false);
		FilterBtn.setFocusable(false);
		FilterBtn.setBorder(null);
		this.add(FilterBtn);
	}
	
	private void setPlusBtn() {
		PlusBtn = new JButton("Add");
		PlusBtn.setBounds(470, 10, 30, 30);
		PlusBtn.setIcon(new ImageIcon(Utilities.plus_img.getScaledInstance(PlusBtn.getWidth(),
				PlusBtn.getHeight(), Image.SCALE_SMOOTH)));
		PlusBtn.setBackground(DarkModeColorPalette.SLIGHTLY_LIGHTER_CHARCOAL);
		PlusBtn.setHorizontalAlignment(SwingConstants.CENTER);
		PlusBtn.setContentAreaFilled(false);
		PlusBtn.setFocusable(false);
		PlusBtn.setBorder(null);
		PlusBtn.addActionListener(addEmployee);
		this.add(PlusBtn);
	}
	
	private void setPayAllBtn() {
		PayAllBtn = new JButton("Pay");
		PayAllBtn.setBounds(510, 10, 30, 30);
		PayAllBtn.setIcon(new ImageIcon(Utilities.pay_img.getScaledInstance(PayAllBtn.getWidth(),
				PayAllBtn.getHeight(), Image.SCALE_SMOOTH)));
		PayAllBtn.setBackground(DarkModeColorPalette.SLIGHTLY_LIGHTER_CHARCOAL);
		PayAllBtn.setHorizontalAlignment(SwingConstants.CENTER);
		PayAllBtn.setContentAreaFilled(false);
		PayAllBtn.setFocusable(false);
		PayAllBtn.setBorder(null);
		this.add(PayAllBtn);
	}
	
	private void setSelectAllBtn() {
		SelectAllBtn = new JButton("Select All");
		SelectAllBtn.setBounds(550, 11, 104, 30);
		SelectAllBtn.setFont(new Font("Consolas", Font.PLAIN, 14));
		SelectAllBtn.setForeground(DarkModeColorPalette.LIGHT_GRAY);
		SelectAllBtn.setBackground(DarkModeColorPalette.SLIGHTLY_LIGHTER_CHARCOAL);
		SelectAllBtn.setHorizontalAlignment(SwingConstants.CENTER);
		SelectAllBtn.setContentAreaFilled(false);
		SelectAllBtn.setFocusable(false);
		SelectAllBtn.setBorder(null);
		this.add(SelectAllBtn);
	}
	
	private void setCheckboxListener() {
		// Assuming you have a JList<String> named myList and a CustomListCellRenderer applied

		/*
		 * List<String> selectedItems = new ArrayList<>(); ListCellRenderer<? super
		 * String> renderer = myList.getCellRenderer();
		 * 
		 * for (int i = 0; i < myList.getModel().getSize(); i++) { String item =
		 * myList.getModel().getElementAt(i); Component rendererComponent =
		 * renderer.getListCellRendererComponent(myList, item, i, false, false);
		 * 
		 * if (rendererComponent instanceof RoundedPanel) { RoundedPanel panel =
		 * (RoundedPanel) rendererComponent; Component[] components =
		 * panel.getComponents();
		 * 
		 * for (Component component : components) { if (component instanceof JCheckBox)
		 * { JCheckBox checkBox = (JCheckBox) component;
		 * 
		 * if (checkBox.isSelected()) { selectedItems.add(item); } } } } }
		 */

		// Now you have a list of selected items in the selectedItems List
	}
	

}
