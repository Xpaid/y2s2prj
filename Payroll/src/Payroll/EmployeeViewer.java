package Payroll;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

import Tools.Utilities.DarkModeColorPalette;
import Tools.Utilities.RoundedPanel;

public class EmployeeViewer extends RoundedPanel {

    private JPanel container;

    private JLabel lbl_EmployeeAvatar;
    private JLabel txtF_EmployeeId;
    private JTextField txtF_EmployeeName;
    private JTextField txtF_EmployeeAge;
    private JTextField txtF_EmployeeBirthDate;
    private JTextField txtF_EmployeeGender;
    private JTextField txtF_EmployeeAddress;

    private JTextField txtF_EmployeeJobTitle;
    private JTextField txtF_EmployeeStartDate;
    private JTextField txtf_EmployeeWorkLocation;

    private JTextField txtF_EmployeeGovID;

    private JTextField txtf_EmployeeEmergencyContact;

    private JTextField txtf_EmployeeBankAcc;

    private JTextField txtf_Employeetax;
    
    public EmployeeViewer(int radius, Color fillColor, int shadowSize) {
        super(radius, fillColor, shadowSize);
        this.setBounds(1300, 425, 600, 625);
        this.setLayout(null);

        container = new JPanel();
        container.setLayout(null);
        container.setBounds(10, 10, 590, 615);
        container.setBackground(DarkModeColorPalette.SLIGHTLY_LIGHTER_CHARCOAL);
        this.add(container);

        setAvatar();
        
        JScrollPane scrollPane = new JScrollPane(container);
        lbl_EmployeeAvatar = new JLabel();
        lbl_EmployeeAvatar.setBounds(270, 48, 50, 50);
        lbl_EmployeeAvatar.setBorder(BorderFactory.createBevelBorder(0));
        container.add(lbl_EmployeeAvatar);
        
        
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setBackground(DarkModeColorPalette.SLIGHTLY_LIGHTER_CHARCOAL);
        scrollPane.setBorder(null);
        scrollPane.setBounds(10, 10, 580, 605);
        this.add(scrollPane);
    }

    private void setAvatar() {
    }
}