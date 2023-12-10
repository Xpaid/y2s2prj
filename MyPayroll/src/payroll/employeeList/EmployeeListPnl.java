package payroll.employeeList;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListCellRenderer;
import javax.swing.SwingConstants;

import data.Employee;
import tools.Utilities.DarkModeColorPalette;
import tools.Utilities.RoundedPanel;

public class EmployeeListPnl extends RoundedPanel {
    /**
	 *
	 */
	private static final long serialVersionUID = 1L;
	public static DefaultListModel<Employee> listModel;
    public static JList<Employee> employeeList;

    private GridBagConstraints c;

    public EmployeeListPnl(int radius, Color fillColor, int shadowSize) {
        super(radius, fillColor, shadowSize);
        this.setBounds(25, 425, 1220, 625);

        // Create the list model and the custom list
        listModel = new DefaultListModel<>();

        employeeList = new JList<>(listModel);
        employeeList.setBackground(DarkModeColorPalette.SLIGHTLY_LIGHTER_CHARCOAL);
        employeeList.setBorder(BorderFactory.createEmptyBorder());
        employeeList.setCellRenderer(new CustomListCellRenderer());
        employeeList.setLayoutOrientation(JList.HORIZONTAL_WRAP);
        employeeList.setVisibleRowCount(-1);

        JScrollPane scrollPane = new JScrollPane(employeeList);
        scrollPane.setBorder(null);

        // Set the layout and add components to the JPanel
        setLayout(new GridBagLayout());

        c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        c.fill = GridBagConstraints.BOTH;
        c.weightx = 1.0;
        c.weighty = 1.0;
        this.add(scrollPane, c);
    }

    private class CustomListCellRenderer implements ListCellRenderer<Employee> {

        public Component getListCellRendererComponent(JList<? extends Employee> list, Employee employee, int index,
                boolean isSelected, boolean cellHasFocus) {
            RoundedPanel employeePanel = new RoundedPanel(30, DarkModeColorPalette.SLIGHTLY_LIGHTER_CHARCOAL, 3);
            employeePanel.setLayout(null);
            employeePanel.setPreferredSize(new Dimension(200, 100));
            employeePanel.setBorder(null);

            JLabel avatar = new JLabel("n/a");
            avatar.setBounds(5, 5, 50, 50);
            avatar.setIcon(new ImageIcon(employee.getEmployeeAvatar().getScaledInstance(avatar.getWidth(), avatar.getHeight(), Image.SCALE_AREA_AVERAGING)));
            avatar.setBorder(BorderFactory.createLineBorder(DarkModeColorPalette.MEDIUM_GRAY.darker()));
            avatar.setFont(new Font("Consolas", Font.PLAIN, 13));
            avatar.setHorizontalAlignment(SwingConstants.CENTER);
            avatar.setForeground(DarkModeColorPalette.MEDIUM_GRAY);
            avatar.setBackground(employeePanel.getBackground());
            employeePanel.add(avatar);

            JLabel firstName = new JLabel(employee.getEmployeeFirstName());
            firstName.setBounds(60, 5, 135, 20);
            firstName.setFont(new Font("Consolas", Font.PLAIN, 13));
            firstName.setHorizontalAlignment(SwingConstants.CENTER);
            firstName.setForeground(DarkModeColorPalette.AMBER);
            firstName.setBackground(employeePanel.getBackground());
            employeePanel.add(firstName);

            JLabel lastName = new JLabel(employee.getEmployeeLastName());
            lastName.setBounds(60, 30, 135, 20);
            lastName.setFont(new Font("Consolas", Font.PLAIN, 13));
            lastName.setHorizontalAlignment(SwingConstants.CENTER);
            lastName.setForeground(DarkModeColorPalette.AMBER);
            lastName.setBackground(employeePanel.getBackground());
            employeePanel.add(lastName);

            JLabel position = new JLabel(employee.getEmployeeJobTitle());
            position.setBounds(60, 60, 135, 20);
            position.setFont(new Font("Consolas", Font.PLAIN, 13));
            position.setHorizontalAlignment(SwingConstants.CENTER);
            position.setForeground(DarkModeColorPalette.GREAT_PURPLE);
            position.setBackground(employeePanel.getBackground());
            employeePanel.add(position);

            return employeePanel;
        }
    }
}