package payroll.employeeViewer;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;

import com.toedter.calendar.JDateChooser;

import payroll.listeners.Listeners;
import tools.Utilities.DarkModeColorPalette;
import tools.Utilities.RoundedButton;
import tools.Utilities.RoundedPanel;
import java.awt.event.ActionListener;

public class Employing extends RoundedPanel implements Listeners {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	// public static JLabel placeholder;
	public static JPanel employer;
	public static RoundedPanel container;
	public static JScrollPane scrollPane;
	

	public static JLabel lbl_EmployeeAvatar;

	public static JTextField txtF_EmployeeFirstName;
	public static JTextField txtF_EmployeeLastName;

	public static JTextField txtF_EmployeeAddress;
	public static JDateChooser EmployeeBirthDate;
	public static JTextField txtF_EmployeeGender;

	public static JTextField txtF_EmployeeEmail;
	public static JTextField txtf_EmployeeContact;

	public static JTextField txtF_EmployeeJobTitle;
	public static JDateChooser EmployeeStartDate;
	public static JTextField txtf_EmployeeWorkLocation;

	public static JTextField txtF_EmployeeBankAcc;
	public static JDateChooser EmployeeContractEnd;
	public static JTextField txtF_EmployeeMonthlySalary;

	public static JButton ChooseAvatarBtn;
	public static RoundedButton CloseBtn;
	public static RoundedButton EmployBtn;

	public Employing(int radius, Color fillColor, int shadowSize) {
		super(radius, fillColor, shadowSize);
		this.setBounds(0, 0, 600, 625);
		this.setLayout(null);

		/*
		 * private void setPlaceHolder() { placeholder = new
		 * JLabel("Select Entity to View"); placeholder.setBounds(140, 200, 300, 100);
		 * placeholder.setHorizontalAlignment(SwingConstants.CENTER);
		 * placeholder.setFont(new Font("Consolas", Font.PLAIN, 18));
		 * placeholder.setForeground(DarkModeColorPalette.MEDIUM_GRAY.darker());
		 * this.add(placeholder); }
		 */

		container = new RoundedPanel(30, DarkModeColorPalette.SLIGHTLY_LIGHTER_CHARCOAL, 0);
		container.setBounds(0, 0, 595, 800);
		container.setBackground(DarkModeColorPalette.SLIGHTLY_LIGHTER_CHARCOAL);
		container.setLayout(null);
		container.setOpaque(true);
		// Viewer.add(container);

		scrollPane = new JScrollPane(container);
		scrollPane.setBounds(5, 5, 590, 610);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBackground(DarkModeColorPalette.SLIGHTLY_LIGHTER_CHARCOAL);
		scrollPane.setBorder(null);
		this.add(scrollPane);

		lbl_EmployeeAvatar = new JLabel();
		lbl_EmployeeAvatar.setText("N/A");
		lbl_EmployeeAvatar.setBounds(248, 36, 100, 100);
		lbl_EmployeeAvatar.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_EmployeeAvatar.setForeground(DarkModeColorPalette.MEDIUM_GRAY);
		lbl_EmployeeAvatar.setBorder(BorderFactory.createLineBorder(null));
		container.add(lbl_EmployeeAvatar);

		ChooseAvatarBtn = new JButton("Choose");
		ChooseAvatarBtn.setBounds(358, 116, 78, 20);
		ChooseAvatarBtn.setFocusable(false);
		ChooseAvatarBtn.setContentAreaFilled(false);
		ChooseAvatarBtn.setForeground(DarkModeColorPalette.MEDIUM_GRAY);
		ChooseAvatarBtn.setFont(new Font("Consolas", Font.BOLD, 10));
		ChooseAvatarBtn.setBorder(null);
		ChooseAvatarBtn.addActionListener(chooseImage);
		container.add(ChooseAvatarBtn);

		JLabel lblFirstName = new JLabel("FirstName:");
		lblFirstName.setBounds(32, 175, 72, 14);
		lblFirstName.setHorizontalAlignment(SwingConstants.CENTER);
		lblFirstName.setFont(new Font("Consolas", Font.PLAIN, 13));
		lblFirstName.setForeground(DarkModeColorPalette.MEDIUM_GRAY);
		container.add(lblFirstName);

		txtF_EmployeeFirstName = new JTextField();
		txtF_EmployeeFirstName.setBorder(null);
		txtF_EmployeeFirstName.setBounds(115, 172, 250, 20);
		txtF_EmployeeFirstName.setHorizontalAlignment(SwingConstants.CENTER);
		txtF_EmployeeFirstName.setFont(new Font("Consolas", Font.PLAIN, 14));
		txtF_EmployeeFirstName.setForeground(DarkModeColorPalette.LIGHT_GRAY);
		txtF_EmployeeFirstName.setBackground(DarkModeColorPalette.SLIGHTLY_LIGHTER_CHARCOAL);
		txtF_EmployeeFirstName
				.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, DarkModeColorPalette.MEDIUM_GRAY.darker()));
		container.add(txtF_EmployeeFirstName);

		JLabel lblLastName = new JLabel("LastName:");
		lblLastName.setBounds(32, 225, 72, 14);
		lblLastName.setFont(new Font("Consolas", Font.PLAIN, 13));
		lblLastName.setForeground(DarkModeColorPalette.MEDIUM_GRAY);
		lblLastName.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(lblLastName);

		txtF_EmployeeLastName = new JTextField();
		txtF_EmployeeLastName.setBounds(115, 222, 250, 20);
		txtF_EmployeeLastName.setHorizontalAlignment(SwingConstants.CENTER);
		txtF_EmployeeLastName.setFont(new Font("Consolas", Font.PLAIN, 14));
		txtF_EmployeeLastName.setForeground(DarkModeColorPalette.LIGHT_GRAY);
		txtF_EmployeeLastName.setBackground(DarkModeColorPalette.SLIGHTLY_LIGHTER_CHARCOAL);
		txtF_EmployeeLastName
				.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, DarkModeColorPalette.MEDIUM_GRAY.darker()));
		container.add(txtF_EmployeeLastName);

		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setBounds(32, 275, 72, 14);
		lblAddress.setFont(new Font("Consolas", Font.PLAIN, 13));
		lblAddress.setForeground(DarkModeColorPalette.MEDIUM_GRAY);
		lblAddress.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(lblAddress);

		txtF_EmployeeAddress = new JTextField();
		txtF_EmployeeAddress.setBounds(115, 272, 250, 20);
		txtF_EmployeeAddress.setHorizontalAlignment(SwingConstants.CENTER);
		txtF_EmployeeAddress.setFont(new Font("Consolas", Font.PLAIN, 14));
		txtF_EmployeeAddress.setForeground(DarkModeColorPalette.LIGHT_GRAY);
		txtF_EmployeeAddress.setBackground(DarkModeColorPalette.SLIGHTLY_LIGHTER_CHARCOAL);
		txtF_EmployeeAddress
				.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, DarkModeColorPalette.MEDIUM_GRAY.darker()));
		container.add(txtF_EmployeeAddress);

		JLabel lblBirthdate = new JLabel("BirthDate:");
		lblBirthdate.setBounds(369, 175, 72, 14);
		lblBirthdate.setFont(new Font("Consolas", Font.PLAIN, 13));
		lblBirthdate.setForeground(DarkModeColorPalette.MEDIUM_GRAY);
		container.add(lblBirthdate);

		EmployeeBirthDate = new JDateChooser();
		EmployeeBirthDate.setFont(new Font("Consolas", Font.PLAIN, 11));
		EmployeeBirthDate.setBounds(451, 169, 95, 20);
		EmployeeBirthDate.setForeground(DarkModeColorPalette.LIGHT_GRAY);
		EmployeeBirthDate.setBackground(DarkModeColorPalette.SLIGHTLY_LIGHTER_CHARCOAL);
		container.add(EmployeeBirthDate);

		JLabel lblGender = new JLabel("Gender:");
		lblGender.setBounds(378, 275, 50, 14);
		lblGender.setFont(new Font("Consolas", Font.PLAIN, 13));
		lblGender.setForeground(DarkModeColorPalette.MEDIUM_GRAY);
		container.add(lblGender);

		txtF_EmployeeGender = new JTextField();
		txtF_EmployeeGender.setBounds(438, 272, 108, 20);
		txtF_EmployeeGender.setHorizontalAlignment(SwingConstants.CENTER);
		txtF_EmployeeGender.setFont(new Font("Consolas", Font.PLAIN, 14));
		txtF_EmployeeGender.setForeground(DarkModeColorPalette.LIGHT_GRAY);
		txtF_EmployeeGender.setBackground(DarkModeColorPalette.SLIGHTLY_LIGHTER_CHARCOAL);
		txtF_EmployeeGender
				.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, DarkModeColorPalette.MEDIUM_GRAY.darker()));
		container.add(txtF_EmployeeGender);

		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmail.setBounds(32, 325, 72, 14);
		lblEmail.setFont(new Font("Consolas", Font.PLAIN, 13));
		lblEmail.setForeground(DarkModeColorPalette.MEDIUM_GRAY);
		container.add(lblEmail);
		
		txtF_EmployeeEmail = new JTextField();
		txtF_EmployeeEmail.setBounds(115, 322, 250, 20);
		txtF_EmployeeEmail.setHorizontalAlignment(SwingConstants.CENTER);
		txtF_EmployeeEmail.setFont(new Font("Consolas", Font.PLAIN, 14));
		txtF_EmployeeEmail.setForeground(DarkModeColorPalette.LIGHT_GRAY);
		txtF_EmployeeEmail.setBackground(DarkModeColorPalette.SLIGHTLY_LIGHTER_CHARCOAL);
		txtF_EmployeeEmail
				.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, DarkModeColorPalette.MEDIUM_GRAY.darker()));
		container.add(txtF_EmployeeEmail);

		JLabel lblContact = new JLabel("Phone:");
		lblContact.setBounds(378, 325, 42, 14);
		lblContact.setFont(new Font("Consolas", Font.PLAIN, 13));
		lblContact.setForeground(DarkModeColorPalette.MEDIUM_GRAY);
		container.add(lblContact);

		
		txtf_EmployeeContact = new JTextField();
		txtf_EmployeeContact.setBounds(438, 322, 108, 20);
		txtf_EmployeeContact.setHorizontalAlignment(SwingConstants.CENTER);
		txtf_EmployeeContact.setFont(new Font("Consolas", Font.PLAIN, 14));
		txtf_EmployeeContact.setForeground(DarkModeColorPalette.LIGHT_GRAY);
		txtf_EmployeeContact.setBackground(DarkModeColorPalette.SLIGHTLY_LIGHTER_CHARCOAL);
		txtf_EmployeeContact
				.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, DarkModeColorPalette.MEDIUM_GRAY.darker()));
		txtf_EmployeeContact.addKeyListener(onlynumber);
		container.add(txtf_EmployeeContact);

		JLabel lblWorksite = new JLabel("WorkSite:");
		lblWorksite.setHorizontalAlignment(SwingConstants.CENTER);
		lblWorksite.setBounds(32, 375, 72, 14);
		lblWorksite.setFont(new Font("Consolas", Font.PLAIN, 13));
		lblWorksite.setForeground(DarkModeColorPalette.MEDIUM_GRAY);
		container.add(lblWorksite);
		
		txtf_EmployeeWorkLocation = new JTextField();
		txtf_EmployeeWorkLocation.setBounds(115, 372, 250, 20);
		txtf_EmployeeWorkLocation.setHorizontalAlignment(SwingConstants.CENTER);
		txtf_EmployeeWorkLocation.setFont(new Font("Consolas", Font.PLAIN, 14));
		txtf_EmployeeWorkLocation.setForeground(DarkModeColorPalette.LIGHT_GRAY);
		txtf_EmployeeWorkLocation.setBackground(DarkModeColorPalette.SLIGHTLY_LIGHTER_CHARCOAL);
		txtf_EmployeeWorkLocation
				.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, DarkModeColorPalette.MEDIUM_GRAY.darker()));
		container.add(txtf_EmployeeWorkLocation);

		JLabel lblRole = new JLabel("Role:");
		lblRole.setBounds(380, 225, 40, 14);
		lblRole.setFont(new Font("Consolas", Font.PLAIN, 13));
		lblRole.setForeground(DarkModeColorPalette.MEDIUM_GRAY);
		container.add(lblRole);
		
		txtF_EmployeeJobTitle = new JTextField();
		txtF_EmployeeJobTitle.setBounds(438, 222, 108, 20);
		txtF_EmployeeJobTitle.setHorizontalAlignment(SwingConstants.CENTER);
		txtF_EmployeeJobTitle.setFont(new Font("Consolas", Font.PLAIN, 14));
		txtF_EmployeeJobTitle.setForeground(DarkModeColorPalette.LIGHT_GRAY);
		txtF_EmployeeJobTitle.setBackground(DarkModeColorPalette.SLIGHTLY_LIGHTER_CHARCOAL);
		txtF_EmployeeJobTitle
				.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, DarkModeColorPalette.MEDIUM_GRAY.darker()));
		container.add(txtF_EmployeeJobTitle);

		JLabel lblBankaccount = new JLabel("BankAccount:");
		lblBankaccount.setBounds(32, 425, 85, 14);
		lblBankaccount.setFont(new Font("Consolas", Font.PLAIN, 13));
		lblBankaccount.setForeground(DarkModeColorPalette.MEDIUM_GRAY);
		container.add(lblBankaccount);
		
		txtF_EmployeeBankAcc = new JTextField();
		txtF_EmployeeBankAcc.setBounds(115, 422, 243, 20);
		txtF_EmployeeBankAcc.setHorizontalAlignment(SwingConstants.CENTER);
		txtF_EmployeeBankAcc.setFont(new Font("Consolas", Font.PLAIN, 14));
		txtF_EmployeeBankAcc.setForeground(DarkModeColorPalette.LIGHT_GRAY);
		txtF_EmployeeBankAcc.setBackground(DarkModeColorPalette.SLIGHTLY_LIGHTER_CHARCOAL);
		txtF_EmployeeBankAcc
				.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, DarkModeColorPalette.MEDIUM_GRAY.darker()));
		txtF_EmployeeBankAcc.addKeyListener(onlynumber);
		container.add(txtF_EmployeeBankAcc);

		JLabel lblStarted = new JLabel("Started:");
		lblStarted.setBounds(372, 375, 56, 14);
		lblStarted.setFont(new Font("Consolas", Font.PLAIN, 13));
		lblStarted.setForeground(DarkModeColorPalette.MEDIUM_GRAY);
		container.add(lblStarted);

		EmployeeStartDate = new JDateChooser();
		EmployeeStartDate.setBorder(null);
		EmployeeStartDate.setFont(new Font("Consolas", Font.PLAIN, 11));
		EmployeeStartDate.setForeground(DarkModeColorPalette.LIGHT_GRAY);
		EmployeeStartDate.setBackground(DarkModeColorPalette.SLIGHTLY_LIGHTER_CHARCOAL);
		EmployeeStartDate.setBounds(451, 375, 95, 20);
		container.add(EmployeeStartDate);

		JLabel lblEndOfContract = new JLabel("Contract End:");
		lblEndOfContract.setBounds(358, 425, 91, 14);
		lblEndOfContract.setFont(new Font("Consolas", Font.PLAIN, 13));
		lblEndOfContract.setForeground(DarkModeColorPalette.MEDIUM_GRAY);
		container.add(lblEndOfContract);

		EmployeeContractEnd = new JDateChooser();
		EmployeeContractEnd.setBorder(null);
		EmployeeContractEnd.setFont(new Font("Consolas", Font.BOLD, 11));
		EmployeeContractEnd.setForeground(DarkModeColorPalette.LIGHT_GRAY);
		EmployeeContractEnd.setBackground(DarkModeColorPalette.SLIGHTLY_LIGHTER_CHARCOAL);
		EmployeeContractEnd.setBounds(451, 419, 95, 20);
		container.add(EmployeeContractEnd);

		JLabel lblSallary = new JLabel("Monthly Salary:");
		lblSallary.setBounds(32, 475, 105, 14);
		lblSallary.setFont(new Font("Consolas", Font.PLAIN, 13));
		lblSallary.setForeground(DarkModeColorPalette.MEDIUM_GRAY);
		container.add(lblSallary);
		
		txtF_EmployeeMonthlySalary = new JTextField();
		txtF_EmployeeMonthlySalary.setBounds(136, 472, 250, 20);
		txtF_EmployeeMonthlySalary.setHorizontalAlignment(SwingConstants.CENTER);
		txtF_EmployeeMonthlySalary.setFont(new Font("Consolas", Font.PLAIN, 14));
		txtF_EmployeeMonthlySalary.setForeground(DarkModeColorPalette.LIGHT_GRAY);
		txtF_EmployeeMonthlySalary.setBackground(DarkModeColorPalette.SLIGHTLY_LIGHTER_CHARCOAL);
		txtF_EmployeeMonthlySalary
				.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, DarkModeColorPalette.MEDIUM_GRAY.darker()));
		container.add(txtF_EmployeeMonthlySalary);

		CloseBtn = new RoundedButton(20, DarkModeColorPalette.GREAT_PURPLE, 2);
		CloseBtn.setText("Close");
		CloseBtn.setContentAreaFilled(false);
		CloseBtn.setVisible(true);
		CloseBtn.setFocusable(false);
		CloseBtn.setForeground(DarkModeColorPalette.DARK_CHARCOAL);
		CloseBtn.setFont(new Font("Consolas", Font.BOLD, 15));
		CloseBtn.setBounds(32, 36, 56, 20);
		CloseBtn.setBorder(null);
		CloseBtn.addActionListener(close);
		container.add(CloseBtn);

		EmployBtn = new RoundedButton(20, DarkModeColorPalette.GREEN, 2);
		EmployBtn.setText("Employ");
		EmployBtn.setContentAreaFilled(false);
		EmployBtn.setFocusable(false);
		EmployBtn.setBorder(null);
		EmployBtn.setFont(new Font("Consolas", Font.BOLD, 17));
		EmployBtn.setForeground(DarkModeColorPalette.DARK_CHARCOAL);

		EmployBtn.setBounds(248, 531, 100, 25);
		EmployBtn.addActionListener(Employ);
		container.add(EmployBtn);

		this.setVisible(true);
	}
}
