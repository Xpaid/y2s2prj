package Payroll;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import Tools.Utilities.DarkModeColorPalette;
import Tools.Utilities.RoundedPanel;

public class UserPanel extends RoundedPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel ClientAvatarLbl;
	private JTextArea txtA_ClientName;
	private JTextArea txtA_ClientRole;
	private JTextArea txtA_ClientStatus;
	private JTextArea txtA_ClientID;
	private JTextField txtF_CompanyName;
	private JTextField txtF_ClientName;
	private JTextField txtF_ClientRole;
	private JTextField txtF_ClientId;
	private JTextField txtF_ClientStatus;

	public UserPanel(int radius, Color fillColor, int shadowSize) {
		super(radius, fillColor, shadowSize);
		this.setBounds(30, 50, 400, 300);
		this.setBackground(DarkModeColorPalette.SLIGHTLY_LIGHTER_CHARCOAL);
		this.setBorder(null);
		setLayout(null);

		setClientAvatarLbl();
		setClientNameArea();
		setClientRoleArea();
		setClientIdArea();
		setClientStatusArea();
		
		setCompanyNameField();
		setClientNameField();
		setClientRoleField();
		setClientIdField();
		setClientStatusField();
	}

	private void setClientAvatarLbl() {
		ClientAvatarLbl = new JLabel();
		ClientAvatarLbl.setBounds(10, 11, 90, 90);
		ClientAvatarLbl.setBackground(DarkModeColorPalette.SLIGHTLY_LIGHTER_CHARCOAL);
		ClientAvatarLbl.setHorizontalAlignment(SwingConstants.CENTER);
		ClientAvatarLbl.setBorder(BorderFactory.createLineBorder(null));
		this.add(ClientAvatarLbl);
	}

	private void setClientNameArea() {
		txtA_ClientName = new JTextArea("Client:");
		txtA_ClientName.setEditable(false);
		txtA_ClientName.setBounds(23, 130, 68, 25);
		txtA_ClientName.setFont(new Font("Consolas", Font.BOLD, 16));
		txtA_ClientName.setForeground(DarkModeColorPalette.MEDIUM_GRAY);
		txtA_ClientName.setBackground(DarkModeColorPalette.SLIGHTLY_LIGHTER_CHARCOAL);
		txtA_ClientName.setBorder(null);
		this.add(txtA_ClientName);

	}

	private void setClientRoleArea() {
		txtA_ClientRole = new JTextArea("Role:");
		txtA_ClientRole.setEditable(false);
		txtA_ClientRole.setBounds(23, 175, 68, 25);
		txtA_ClientRole.setFont(new Font("Consolas", Font.BOLD, 16));
		txtA_ClientRole.setForeground(DarkModeColorPalette.MEDIUM_GRAY);
		txtA_ClientRole.setBackground(DarkModeColorPalette.SLIGHTLY_LIGHTER_CHARCOAL);
		txtA_ClientRole.setBorder(null);
		this.add(txtA_ClientRole);

	}

	private void setClientIdArea() {
		txtA_ClientID = new JTextArea("Id:");
		txtA_ClientID.setEditable(false);
		txtA_ClientID.setBounds(23, 220, 68, 25);
		txtA_ClientID.setFont(new Font("Consolas", Font.BOLD, 16));
		txtA_ClientID.setForeground(DarkModeColorPalette.MEDIUM_GRAY);
		txtA_ClientID.setBackground(DarkModeColorPalette.SLIGHTLY_LIGHTER_CHARCOAL);
		txtA_ClientID.setBorder(null);
		this.add(txtA_ClientID);
	}

	private void setClientStatusArea() {
		txtA_ClientStatus = new JTextArea("Stat:");
		txtA_ClientStatus.setEditable(false);
		txtA_ClientStatus.setBounds(23, 265, 68, 25);
		txtA_ClientStatus.setFont(new Font("Consolas", Font.BOLD, 16));
		txtA_ClientStatus.setForeground(DarkModeColorPalette.MEDIUM_GRAY);
		txtA_ClientStatus.setBackground(DarkModeColorPalette.SLIGHTLY_LIGHTER_CHARCOAL);
		txtA_ClientStatus.setBorder(null);
		this.add(txtA_ClientStatus);
	}

	private void setCompanyNameField() {
		txtF_CompanyName = new JTextField("Company.Inc");
		txtF_CompanyName.setHorizontalAlignment(SwingConstants.CENTER);
		txtF_CompanyName.setEditable(false);
		txtF_CompanyName.setBounds(129, 32, 240, 50);
		txtF_CompanyName.setFont(new Font("Consolas", Font.BOLD, 19));
		txtF_CompanyName.setAlignmentX(SwingConstants.CENTER);
		txtF_CompanyName.setForeground(DarkModeColorPalette.LIGHT_GRAY);
		txtF_CompanyName.setBackground(DarkModeColorPalette.SLIGHTLY_LIGHTER_CHARCOAL);
		txtF_CompanyName.setBorder(null);
		this.add(txtF_CompanyName);
	}
	
	private void setClientNameField() {
		txtF_ClientName = new JTextField("Jetro Apilado");
		txtF_ClientName.setEditable(false);
		txtF_ClientName.setBounds(129, 127, 240, 25);
		txtF_ClientName.setFont(new Font("Consolas", Font.BOLD, 16));
		txtF_ClientName.setForeground(DarkModeColorPalette.MEDIUM_GRAY);
		txtF_ClientName.setBackground(DarkModeColorPalette.SLIGHTLY_LIGHTER_CHARCOAL);
		txtF_ClientName.setBorder(null);
		this.add(txtF_ClientName);
	}
	
	private void setClientRoleField() {
		txtF_ClientRole = new JTextField("Admin");
		txtF_ClientRole.setEditable(false);
		txtF_ClientRole.setBounds(129, 172, 240, 25);
		txtF_ClientRole.setFont(new Font("Consolas", Font.BOLD, 16));
		txtF_ClientRole.setForeground(DarkModeColorPalette.MEDIUM_GRAY);
		txtF_ClientRole.setBackground(DarkModeColorPalette.SLIGHTLY_LIGHTER_CHARCOAL);
		txtF_ClientRole.setBorder(null);
		this.add(txtF_ClientRole);
	}
	
	private void setClientIdField() {
		txtF_ClientId = new JTextField("#Apij-0722");
		txtF_ClientId.setEditable(false);
		txtF_ClientId.setBounds(129, 217, 240, 25);
		txtF_ClientId.setFont(new Font("Consolas", Font.BOLD, 16));
		txtF_ClientId.setForeground(DarkModeColorPalette.MEDIUM_GRAY);
		txtF_ClientId.setBackground(DarkModeColorPalette.SLIGHTLY_LIGHTER_CHARCOAL);
		txtF_ClientId.setBorder(null);
		this.add(txtF_ClientId);
	}
	
	private void setClientStatusField() {
		txtF_ClientStatus = new JTextField("Active");
		txtF_ClientStatus.setEditable(false);
		txtF_ClientStatus.setBounds(129, 262, 240, 25);
		txtF_ClientStatus.setFont(new Font("Consolas", Font.BOLD, 16));
		txtF_ClientStatus.setForeground(DarkModeColorPalette.MEDIUM_GRAY);
		txtF_ClientStatus.setBackground(DarkModeColorPalette.SLIGHTLY_LIGHTER_CHARCOAL);
		txtF_ClientStatus.setBorder(null);
		this.add(txtF_ClientStatus);
	}

}