package payroll.employeeViewer;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;

import com.toedter.calendar.JDateChooser;

import payroll.listeners.Listeners;
import tools.Utilities.DarkModeColorPalette;
import tools.Utilities.RoundedPanel;

public class EmployeeViewer extends RoundedPanel implements Listeners {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static JLabel placeholder;
	public static RoundedPanel Viewer;
	private RoundedPanel container;
	private JScrollPane scrollPane;

	public static JLabel lbl_EmployeeAvatar;
	public static Image avatar;

	public static JTextField txtF_EmployeeFirstName;
	public static JTextField txtF_EmployeeLastName;

	public static JTextField txtF_EmployeeAge;
	public static JTextField txtF_EmployeeId;

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
	public static JTextField txtF_EmployeeHourlyWage;

	public static JButton EditAvatarBtn;
	public static JButton EditBtn;
	public static JButton SaveBtn;
	public static JButton CancelBtn;
	public static JButton CloseBtn;
	public static JButton PayBtn;
	public static JButton FireBtn;
	public static JButton EmployBtn;

	public EmployeeViewer(int radius, Color fillColor, int shadowSize) {
		super(radius, fillColor, shadowSize);
		this.setBounds(1300, 425, 600, 625);
		this.setLayout(null);

		setPlaceHolder();
		setViewMode();
	}


	public void setEmployMode() {
		setViewer();
		setContainer();
		setAvatar();
		setFirstName();
		setLastName();
		setID();
		setAge();
		setAddress();
		setBirth();
		setGender();
		setEmail();
		setContact();
		setWorkSite();
		setRole();
		setBankAccount();
		setStartedDate();
		setContractEnd();
		setEmployBtn();
		setMonthlySalary();
		setHourlyWage();
		setEditAvatarBtn();
		setCloseViewerBtn();
		setEmployBtn();
		setScrollPane();

	}

	private void setPlaceHolder() {
		placeholder = new JLabel("Select Entity to View");
		placeholder.setBounds( 140, 200,300, 100);
		placeholder.setHorizontalAlignment(SwingConstants.CENTER);
		placeholder.setFont(new Font("Consolas", Font.PLAIN, 18));
		placeholder.setForeground(DarkModeColorPalette.MEDIUM_GRAY.darker());
		this.add(placeholder);
	}

	private void setViewMode() {
		setViewer();
		setContainer();
		setAvatar();
		setFirstName();
		setLastName();
		setID();
		setAge();
		setAddress();
		setBirth();
		setGender();
		setEmail();
		setContact();
		setWorkSite();
		setRole();
		setBankAccount();
		setStartedDate();
		setContractEnd();
		setHourlyWage();
		setMonthlySalary();
		setEditBtn();
		setEditAvatarBtn();
		setSaveBtn();
		setCancelBtn();
		setCloseViewerBtn();
		setFireBtn();
		setPayBtn();
		setEmployBtn();
		setScrollPane();
	}



	private void setViewer() {
		Viewer = new RoundedPanel(30, DarkModeColorPalette.SLIGHTLY_LIGHTER_CHARCOAL, 5);
		Viewer.setBounds(0, 0, 600, 625);
		Viewer.setLayout(null);
		Viewer.setVisible(false);
		this.add(Viewer);

	}

	private void setContainer() {
		container = new RoundedPanel(30, DarkModeColorPalette.SLIGHTLY_LIGHTER_CHARCOAL, 0);
		container.setBounds(0, 0, 595, 800);
		container.setBackground(DarkModeColorPalette.SLIGHTLY_LIGHTER_CHARCOAL);
		container.setLayout(null);
		container.setOpaque(true);
		// Viewer.add(container);
	}

	private void setScrollPane() {
		scrollPane = new JScrollPane(container);
		scrollPane.setBounds(5, 5, 590, 610);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setBackground(DarkModeColorPalette.SLIGHTLY_LIGHTER_CHARCOAL);
		scrollPane.setBorder(null);
		Viewer.add(scrollPane);
	}

	private void setAvatar() {
		lbl_EmployeeAvatar = new JLabel();
		lbl_EmployeeAvatar.setText("N/A");
		lbl_EmployeeAvatar.setBounds(248, 36, 100, 100);
		lbl_EmployeeAvatar.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_EmployeeAvatar.setForeground(DarkModeColorPalette.MEDIUM_GRAY);
		lbl_EmployeeAvatar.setBorder(BorderFactory.createLineBorder(null));
		container.add(lbl_EmployeeAvatar);
	}

	private void setFirstName() {
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
	}

	private void setLastName() {
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
	}

	private void setID() {
		JLabel IdLbl = new JLabel("ID:");
		IdLbl.setBounds(385, 175, 21, 14);
		IdLbl.setFont(new Font("Consolas", Font.PLAIN, 13));
		IdLbl.setForeground(DarkModeColorPalette.MEDIUM_GRAY);
		container.add(IdLbl);

		txtF_EmployeeId = new JTextField();
		txtF_EmployeeId.setBorder(null);
		txtF_EmployeeId.setEditable(false);
		txtF_EmployeeId.setBounds(416, 172, 130, 20);
		txtF_EmployeeId.setHorizontalAlignment(SwingConstants.CENTER);
		txtF_EmployeeId.setFont(new Font("Consolas", Font.PLAIN, 14));
		txtF_EmployeeId.setForeground(DarkModeColorPalette.LIGHT_GRAY);
		txtF_EmployeeId.setBackground(DarkModeColorPalette.SLIGHTLY_LIGHTER_CHARCOAL);
		container.add(txtF_EmployeeId);
	}

	private void setAge() {
		JLabel EmployeeAgeLbl = new JLabel("Age:");
		EmployeeAgeLbl.setBounds(378, 225, 28, 14);
		EmployeeAgeLbl.setFont(new Font("Consolas", Font.PLAIN, 13));
		EmployeeAgeLbl.setForeground(DarkModeColorPalette.MEDIUM_GRAY);
		container.add(EmployeeAgeLbl);

		txtF_EmployeeAge = new JTextField();
		txtF_EmployeeAge.setBorder(null);
		txtF_EmployeeAge.setEditable(false);
		txtF_EmployeeAge.setBounds(411, 222, 30, 20);
		txtF_EmployeeAge.setHorizontalAlignment(SwingConstants.CENTER);
		txtF_EmployeeAge.setFont(new Font("Consolas", Font.PLAIN, 14));
		txtF_EmployeeAge.setForeground(DarkModeColorPalette.LIGHT_GRAY);
		txtF_EmployeeAge.setBackground(DarkModeColorPalette.SLIGHTLY_LIGHTER_CHARCOAL);
		container.add(txtF_EmployeeAge);
	}

	private void setAddress() {
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
	}

	private void setBirth() {
		JLabel lblBirthdate = new JLabel("BirthDate:");
		lblBirthdate.setBounds(378, 275, 72, 14);
		lblBirthdate.setFont(new Font("Consolas", Font.PLAIN, 13));
		lblBirthdate.setForeground(DarkModeColorPalette.MEDIUM_GRAY);
		container.add(lblBirthdate);

		EmployeeBirthDate = new JDateChooser();
		EmployeeBirthDate.setBounds(451, 272, 95, 20);
		EmployeeBirthDate.setForeground(DarkModeColorPalette.LIGHT_GRAY);
		EmployeeBirthDate.setBackground(DarkModeColorPalette.SLIGHTLY_LIGHTER_CHARCOAL);
		EmployeeBirthDate.setEnabled(false);
		container.add(EmployeeBirthDate);
	}

	private void setGender() {
		JLabel lblGender = new JLabel("Gender:");
		lblGender.setBounds(451, 225, 50, 14);
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
		txtF_EmployeeGender.setBounds(511, 222, 35, 20);
		container.add(txtF_EmployeeGender);

	}

	private void setEmail() {
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

	}

	private void setContact() {
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

	}

	private void setWorkSite() {
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
		txtf_EmployeeWorkLocation.setFont(new Font("Consolas", Font.PLAIN, 14));
		txtf_EmployeeWorkLocation.setForeground(DarkModeColorPalette.LIGHT_GRAY);
		txtf_EmployeeWorkLocation.setBackground(DarkModeColorPalette.SLIGHTLY_LIGHTER_CHARCOAL);
		txtf_EmployeeWorkLocation.setBounds(115, 372, 260, 20);
		container.add(txtf_EmployeeWorkLocation);

	}

	private void setRole() {
		JLabel lblRole_1 = new JLabel("Role:");
		lblRole_1.setBounds(378, 375, 40, 14);
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
		txtF_EmployeeJobTitle.setBounds(416, 372, 130, 20);
		container.add(txtF_EmployeeJobTitle);
	}

	private void setBankAccount() {
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
		txtF_EmployeeBankAcc.setBounds(115, 422, 155, 20);
		container.add(txtF_EmployeeBankAcc);
	}

	private void setStartedDate() {
		JLabel lblStarted = new JLabel("Started:");
		lblStarted.setBounds(32, 475, 56, 14);
		lblStarted.setFont(new Font("Consolas", Font.PLAIN, 13));
		lblStarted.setForeground(DarkModeColorPalette.MEDIUM_GRAY);
		container.add(lblStarted);

		EmployeeStartDate = new JDateChooser();
		EmployeeStartDate.setBorder(null);
		EmployeeStartDate.setEnabled(false);
		EmployeeStartDate.setFont(new Font("Consolas", Font.BOLD, 13));
		EmployeeStartDate.setForeground(DarkModeColorPalette.LIGHT_GRAY);
		EmployeeStartDate.setBackground(DarkModeColorPalette.SLIGHTLY_LIGHTER_CHARCOAL);
		EmployeeStartDate.setBounds(98, 469, 95, 20);
		container.add(EmployeeStartDate);

	}

	private void setContractEnd() {
		JLabel lblEndOfContract = new JLabel("Contract End:");
		lblEndOfContract.setBounds(215, 475, 91, 14);
		lblEndOfContract.setFont(new Font("Consolas", Font.PLAIN, 13));
		lblEndOfContract.setForeground(DarkModeColorPalette.MEDIUM_GRAY);
		container.add(lblEndOfContract);

		EmployeeContractEnd = new JDateChooser();
		EmployeeContractEnd.setBorder(null);
		EmployeeContractEnd.setEnabled(false);
		EmployeeContractEnd.setFont(new Font("Consolas", Font.BOLD, 13));
		EmployeeContractEnd.setForeground(DarkModeColorPalette.LIGHT_GRAY);
		EmployeeContractEnd.setBackground(DarkModeColorPalette.SLIGHTLY_LIGHTER_CHARCOAL);
		EmployeeContractEnd.setBounds(316, 469, 95, 20);
		container.add(EmployeeContractEnd);

	}

	private void setMonthlySalary() {
		JLabel lblSallary = new JLabel("Monthly Salary:");
		lblSallary.setBounds(275, 516, 105, 14);
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
		txtF_EmployeeMonthlySalary.setBounds(411, 513, 140, 20);
		container.add(txtF_EmployeeMonthlySalary);
	}

	private void setHourlyWage() {
		JLabel lblHourlyWage = new JLabel("Hourly Wage:");
		lblHourlyWage.setBounds(32, 516, 85, 14);
		lblHourlyWage.setFont(new Font("Consolas", Font.PLAIN, 13));
		lblHourlyWage.setForeground(DarkModeColorPalette.MEDIUM_GRAY);
		container.add(lblHourlyWage);

		txtF_EmployeeHourlyWage = new JTextField();
		txtF_EmployeeHourlyWage.setBorder(null);
		txtF_EmployeeHourlyWage.setEditable(false);
		txtF_EmployeeHourlyWage.setHorizontalAlignment(SwingConstants.CENTER);
		txtF_EmployeeHourlyWage.setFont(new Font("Consolas", Font.BOLD, 13));
		txtF_EmployeeHourlyWage.setForeground(DarkModeColorPalette.LIGHT_GRAY);
		txtF_EmployeeHourlyWage.setBackground(DarkModeColorPalette.SLIGHTLY_LIGHTER_CHARCOAL);
		txtF_EmployeeHourlyWage.setBounds(127, 513, 140, 20);
		container.add(txtF_EmployeeHourlyWage);

	}

	private void setEditAvatarBtn() {
		EditAvatarBtn = new JButton("Choose");
		EditAvatarBtn.setContentAreaFilled(false);
		EditAvatarBtn.setFocusable(false);
		EditAvatarBtn.setVisible(false);
		EditAvatarBtn.setForeground(DarkModeColorPalette.MEDIUM_GRAY);
		EditAvatarBtn.setFont(new Font("Consolas", Font.BOLD, 10));
		EditAvatarBtn.setBounds(358, 116, 78, 20);
		EditAvatarBtn.setBorder(null);
		EditAvatarBtn.addActionListener(chooseImage);
		container.add(EditAvatarBtn);
	}

	private void setEditBtn() {
		EditBtn = new JButton("Edit");
		EditBtn.setContentAreaFilled(false);
		EditBtn.setVisible(true);
		EditBtn.setFocusable(false);
		EditBtn.setForeground(DarkModeColorPalette.MEDIUM_GRAY);
		EditBtn.setFont(new Font("Consolas", Font.BOLD, 15));
		EditBtn.setBounds(502, 36, 78, 20);
		EditBtn.setBorder(null);
		container.add(EditBtn);
	}

	private void setSaveBtn() {
		SaveBtn = new JButton("Save");
		SaveBtn.setContentAreaFilled(false);
		SaveBtn.setVisible(false);
		SaveBtn.setFocusable(false);
		SaveBtn.setForeground(DarkModeColorPalette.MEDIUM_GRAY);
		SaveBtn.setFont(new Font("Consolas", Font.BOLD, 15));
		SaveBtn.setBounds(502, 36, 78, 20);
		SaveBtn.setBorder(null);
		container.add(SaveBtn);
	}

	private void setCancelBtn() {
		CancelBtn = new JButton("Cancel");
		CancelBtn.setContentAreaFilled(false);
		CancelBtn.setVisible(false);
		CancelBtn.setFocusable(false);
		CancelBtn.setForeground(DarkModeColorPalette.MEDIUM_GRAY);
		CancelBtn.setFont(new Font("Consolas", Font.BOLD, 15));
		CancelBtn.setBounds(469, 36, 56, 20);
		CancelBtn.setBorder(null);
		container.add(CancelBtn);
	}

	private void setCloseViewerBtn() {
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

	}
	private void setPayBtn() {
		PayBtn = new JButton("Pay");
		PayBtn.setContentAreaFilled(false);
		PayBtn.setVisible(true);
		PayBtn.setFocusable(false);
		PayBtn.setForeground(DarkModeColorPalette.GREEN);
		PayBtn.setFont(new Font("Consolas", Font.BOLD, 15));
		PayBtn.setBounds(496, 565, 56, 20);
		PayBtn.setBorder(null);
		container.add(PayBtn);
	}

	private void setFireBtn() {
		FireBtn = new JButton("Fire");
		FireBtn.setContentAreaFilled(false);
		FireBtn.setVisible(true);
		FireBtn.setFocusable(false);
		FireBtn.setForeground(DarkModeColorPalette.RED);
		FireBtn.setFont(new Font("Consolas", Font.BOLD, 15));
		FireBtn.setBounds(32, 565, 56, 20);
		FireBtn.setBorder(null);
		container.add(FireBtn);
	}

	private void setEmployBtn() {
		EmployBtn = new JButton("Employ");
		EmployBtn.setContentAreaFilled(false);
		EmployBtn.setFocusable(false);
		EmployBtn.setBorder(null);
		EmployBtn.setFont(new Font("Consolas", Font.BOLD, 17));
		EmployBtn.setForeground(DarkModeColorPalette.GREEN);
		EmployBtn.setBounds(248, 563, 100, 25);
		EmployBtn.addActionListener(Employ);
		container.add(EmployBtn);

		JLabel lblRole_1 = new JLabel("Role:");
		lblRole_1.setForeground(new Color(204, 204, 204));
		lblRole_1.setFont(new Font("Consolas", Font.PLAIN, 13));
		lblRole_1.setBounds(422, 473, 40, 14);
		container.add(lblRole_1);

	}
}