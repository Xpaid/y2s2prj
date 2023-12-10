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
import tools.Utilities.RoundedPanel;

public class Viewing extends RoundedPanel implements Listeners {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	// public static JLabel placeholder;
	public static JPanel employer;
	public static RoundedPanel container;
	public static JScrollPane scrollPane;

	public static JLabel lbl_EmployeeAvatar;
	public static Image avatar;

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
	public static JButton CloseBtn;
	public static JButton EmployBtn;

	public Viewing(int radius, Color fillColor, int shadowSize) {
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
		ChooseAvatarBtn.setContentAreaFilled(false);
		ChooseAvatarBtn.setFocusable(false);
		ChooseAvatarBtn.setVisible(false);
		ChooseAvatarBtn.setForeground(DarkModeColorPalette.MEDIUM_GRAY);
		ChooseAvatarBtn.setFont(new Font("Consolas", Font.BOLD, 10));
		ChooseAvatarBtn.setBounds(358, 116, 78, 20);
		ChooseAvatarBtn.setBorder(null);
		ChooseAvatarBtn.addActionListener(chooseImage);
		container.add(ChooseAvatarBtn);


		JLabel lblFirstName = new JLabel("FirstName:");
		lblFirstName.setHorizontalAlignment(SwingConstants.CENTER);
		lblFirstName.setBounds(32, 175, 72, 14);
		lblFirstName.setFont(new Font("Consolas", Font.PLAIN, 13));
		lblFirstName.setForeground(DarkModeColorPalette.MEDIUM_GRAY);
		container.add(lblFirstName);

		txtF_EmployeeFirstName = new JTextField();
		txtF_EmployeeFirstName.setBorder(null);
		txtF_EmployeeFirstName.setEditable(false);
		txtF_EmployeeFirstName.setBounds(115, 172, 260, 20);
		txtF_EmployeeFirstName.setHorizontalAlignment(SwingConstants.CENTER);
		txtF_EmployeeFirstName.setFont(new Font("Consolas", Font.PLAIN, 14));
		txtF_EmployeeFirstName.setForeground(DarkModeColorPalette.LIGHT_GRAY);
		txtF_EmployeeFirstName.setBackground(DarkModeColorPalette.SLIGHTLY_LIGHTER_CHARCOAL);
		container.add(txtF_EmployeeFirstName);

		JLabel lblLastName = new JLabel("LastName:");
		lblLastName.setHorizontalAlignment(SwingConstants.CENTER);
		lblLastName.setForeground(new Color(204, 204, 204));
		lblLastName.setFont(new Font("Consolas", Font.PLAIN, 13));
		lblLastName.setBounds(32, 225, 72, 14);
		container.add(lblLastName);

		txtF_EmployeeLastName = new JTextField();
		txtF_EmployeeLastName.setHorizontalAlignment(SwingConstants.CENTER);
		txtF_EmployeeLastName.setForeground(new Color(245, 245, 245));
		txtF_EmployeeLastName.setFont(new Font("Consolas", Font.PLAIN, 14));
		txtF_EmployeeLastName.setEditable(false);
		txtF_EmployeeLastName.setBorder(null);
		txtF_EmployeeLastName.setBackground(new Color(30, 30, 30));
		txtF_EmployeeLastName.setBounds(115, 222, 260, 20);
		container.add(txtF_EmployeeLastName);

		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddress.setBounds(32, 275, 72, 14);
		lblAddress.setFont(new Font("Consolas", Font.PLAIN, 13));
		lblAddress.setForeground(DarkModeColorPalette.MEDIUM_GRAY);
		container.add(lblAddress);

		txtF_EmployeeAddress = new JTextField();
		txtF_EmployeeAddress.setBorder(null);
		txtF_EmployeeAddress.setEditable(false);
		txtF_EmployeeAddress.setHorizontalAlignment(SwingConstants.CENTER);
		txtF_EmployeeAddress.setFont(new Font("Consolas", Font.PLAIN, 14));
		txtF_EmployeeAddress.setForeground(DarkModeColorPalette.LIGHT_GRAY);
		txtF_EmployeeAddress.setBackground(DarkModeColorPalette.SLIGHTLY_LIGHTER_CHARCOAL);
		txtF_EmployeeAddress.setBounds(115, 272, 260, 20);
		container.add(txtF_EmployeeAddress);

		JLabel lblBirthdate = new JLabel("BirthDate:");
		lblBirthdate.setBounds(378, 225, 72, 14);
		lblBirthdate.setFont(new Font("Consolas", Font.PLAIN, 13));
		lblBirthdate.setForeground(DarkModeColorPalette.MEDIUM_GRAY);
		container.add(lblBirthdate);

		EmployeeBirthDate = new JDateChooser();
		EmployeeBirthDate.setFont(new Font("Consolas", Font.PLAIN, 11));
		EmployeeBirthDate.setBounds(451, 219, 95, 20);
		EmployeeBirthDate.setForeground(DarkModeColorPalette.LIGHT_GRAY);
		EmployeeBirthDate.setBackground(DarkModeColorPalette.SLIGHTLY_LIGHTER_CHARCOAL);
		EmployeeBirthDate.setEnabled(false);
		container.add(EmployeeBirthDate);

		JLabel lblGender = new JLabel("Gender:");
		lblGender.setBounds(378, 275, 50, 14);
		lblGender.setFont(new Font("Consolas", Font.PLAIN, 13));
		lblGender.setForeground(DarkModeColorPalette.MEDIUM_GRAY);
		container.add(lblGender);

		txtF_EmployeeGender = new JTextField();
		txtF_EmployeeGender.setBorder(null);
		txtF_EmployeeGender.setEditable(false);
		txtF_EmployeeGender.setHorizontalAlignment(SwingConstants.CENTER);
		txtF_EmployeeGender.setFont(new Font("Consolas", Font.PLAIN, 14));
		txtF_EmployeeGender.setForeground(DarkModeColorPalette.LIGHT_GRAY);
		txtF_EmployeeGender.setBackground(DarkModeColorPalette.SLIGHTLY_LIGHTER_CHARCOAL);
		txtF_EmployeeGender.setBounds(451, 272, 95, 20);
		container.add(txtF_EmployeeGender);

		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmail.setBounds(32, 325, 72, 14);
		lblEmail.setFont(new Font("Consolas", Font.PLAIN, 13));
		lblEmail.setForeground(DarkModeColorPalette.MEDIUM_GRAY);
		container.add(lblEmail);

		txtF_EmployeeEmail = new JTextField();
		txtF_EmployeeEmail.setBorder(null);
		txtF_EmployeeEmail.setEditable(false);
		txtF_EmployeeEmail.setHorizontalAlignment(SwingConstants.CENTER);
		txtF_EmployeeEmail.setFont(new Font("Consolas", Font.PLAIN, 13));
		txtF_EmployeeEmail.setForeground(DarkModeColorPalette.LIGHT_GRAY);
		txtF_EmployeeEmail.setBackground(DarkModeColorPalette.SLIGHTLY_LIGHTER_CHARCOAL);
		txtF_EmployeeEmail.setBounds(115, 322, 260, 20);
		container.add(txtF_EmployeeEmail);

		JLabel lblContact = new JLabel("Phone:");
		lblContact.setBounds(378, 325, 42, 14);
		lblContact.setFont(new Font("Consolas", Font.PLAIN, 13));
		lblContact.setForeground(DarkModeColorPalette.MEDIUM_GRAY);
		container.add(lblContact);

		txtf_EmployeeContact = new JTextField();
		txtf_EmployeeContact.setBorder(null);
		txtf_EmployeeContact.setEditable(false);
		txtf_EmployeeContact.setHorizontalAlignment(SwingConstants.CENTER);
		txtf_EmployeeContact.setFont(new Font("Consolas", Font.PLAIN, 13));
		txtf_EmployeeContact.setForeground(DarkModeColorPalette.LIGHT_GRAY);
		txtf_EmployeeContact.setBackground(DarkModeColorPalette.SLIGHTLY_LIGHTER_CHARCOAL);
		txtf_EmployeeContact.setBounds(422, 322, 124, 20);
		container.add(txtf_EmployeeContact);

		JLabel lblAddress_1_2 = new JLabel("WorkSite:");
		lblAddress_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddress_1_2.setBounds(32, 375, 72, 14);
		lblAddress_1_2.setFont(new Font("Consolas", Font.PLAIN, 13));
		lblAddress_1_2.setForeground(DarkModeColorPalette.MEDIUM_GRAY);
		container.add(lblAddress_1_2);

		txtf_EmployeeWorkLocation = new JTextField();
		txtf_EmployeeWorkLocation.setBorder(null);
		txtf_EmployeeWorkLocation.setEditable(false);
		txtf_EmployeeWorkLocation.setHorizontalAlignment(SwingConstants.CENTER);
		txtf_EmployeeWorkLocation.setFont(new Font("Consolas", Font.PLAIN, 13));
		txtf_EmployeeWorkLocation.setForeground(DarkModeColorPalette.LIGHT_GRAY);
		txtf_EmployeeWorkLocation.setBackground(DarkModeColorPalette.SLIGHTLY_LIGHTER_CHARCOAL);
		txtf_EmployeeWorkLocation.setBounds(115, 372, 250, 20);
		container.add(txtf_EmployeeWorkLocation);

		JLabel lblRole_1 = new JLabel("Role:");
		lblRole_1.setBounds(380, 175, 40, 14);
		lblRole_1.setFont(new Font("Consolas", Font.PLAIN, 13));
		lblRole_1.setForeground(DarkModeColorPalette.MEDIUM_GRAY);
		container.add(lblRole_1);

		txtF_EmployeeJobTitle = new JTextField();
		txtF_EmployeeJobTitle.setBorder(null);
		txtF_EmployeeJobTitle.setEditable(false);
		txtF_EmployeeJobTitle.setHorizontalAlignment(SwingConstants.CENTER);
		txtF_EmployeeJobTitle.setFont(new Font("Consolas", Font.PLAIN, 11));
		txtF_EmployeeJobTitle.setForeground(DarkModeColorPalette.LIGHT_GRAY);
		txtF_EmployeeJobTitle.setBackground(DarkModeColorPalette.SLIGHTLY_LIGHTER_CHARCOAL);
		txtF_EmployeeJobTitle.setBounds(421, 172, 130, 20);
		container.add(txtF_EmployeeJobTitle);

		JLabel lblBankaccount = new JLabel("BankAccount:");
		lblBankaccount.setBounds(32, 425, 85, 14);
		lblBankaccount.setFont(new Font("Consolas", Font.PLAIN, 13));
		lblBankaccount.setForeground(DarkModeColorPalette.MEDIUM_GRAY);
		container.add(lblBankaccount);

		txtF_EmployeeBankAcc = new JTextField();
		txtF_EmployeeBankAcc.setBorder(null);
		txtF_EmployeeBankAcc.setEditable(false);
		txtF_EmployeeBankAcc.setHorizontalAlignment(SwingConstants.CENTER);
		txtF_EmployeeBankAcc.setFont(new Font("Consolas", Font.BOLD, 13));
		txtF_EmployeeBankAcc.setForeground(DarkModeColorPalette.LIGHT_GRAY);
		txtF_EmployeeBankAcc.setBackground(DarkModeColorPalette.SLIGHTLY_LIGHTER_CHARCOAL);
		txtF_EmployeeBankAcc.setBounds(127, 422, 221, 20);
		container.add(txtF_EmployeeBankAcc);

		JLabel lblStarted = new JLabel("Started:");
		lblStarted.setBounds(372, 375, 56, 14);
		lblStarted.setFont(new Font("Consolas", Font.PLAIN, 13));
		lblStarted.setForeground(DarkModeColorPalette.MEDIUM_GRAY);
		container.add(lblStarted);

		EmployeeStartDate = new JDateChooser();
		EmployeeStartDate.setBorder(null);
		EmployeeStartDate.setEnabled(false);
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
		EmployeeContractEnd.setEnabled(false);
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
		txtF_EmployeeMonthlySalary.setBorder(null);
		txtF_EmployeeMonthlySalary.setEditable(false);
		txtF_EmployeeMonthlySalary.setHorizontalAlignment(SwingConstants.CENTER);
		txtF_EmployeeMonthlySalary.setFont(new Font("Consolas", Font.BOLD, 13));
		txtF_EmployeeMonthlySalary.setForeground(DarkModeColorPalette.LIGHT_GRAY);
		txtF_EmployeeMonthlySalary.setBackground(DarkModeColorPalette.SLIGHTLY_LIGHTER_CHARCOAL);
		txtF_EmployeeMonthlySalary.setBounds(142, 472, 140, 20);
		container.add(txtF_EmployeeMonthlySalary);

		CloseBtn = new JButton("Close");
		CloseBtn.setContentAreaFilled(false);
		CloseBtn.setVisible(true);
		CloseBtn.setFocusable(false);
		CloseBtn.setForeground(DarkModeColorPalette.GREAT_PURPLE);
		CloseBtn.setFont(new Font("Consolas", Font.BOLD, 15));
		CloseBtn.setBounds(32, 36, 56, 20);
		CloseBtn.setBorder(null);
		CloseBtn.addActionListener(close);
		container.add(CloseBtn);



		this.setVisible(true);
	}
}
