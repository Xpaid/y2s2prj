package payroll;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.SwingConstants;

import tools.Utilities;
import tools.Utilities.DarkModeColorPalette;
import tools.Utilities.RoundedPanel;

public class Payroll implements PayrollFunctions {

	public static JFrame MainFrame;

	protected static JButton Options;
	protected static JPopupMenu OptionsItems;
	protected static JMenuItem Settings;
	protected static JMenuItem Quit;

	private JLabel Logo;

	protected static JLabel DefaultRightCardLbl;

	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

	public Payroll() {
		initPayroll();

	}

	private void initPayroll() {
		setMainFrame();
		setLogo();
		setOptionsMenu();
		setComponentsTitle();
		setUserPanel();
		setDashBoard();
		setEmployeeManager();
		setEmployeesLbl();
		setEmployeeViewer();
	}

	private void setMainFrame() {
		MainFrame = new JFrame();
		MainFrame.setLocation(0, 0);
		MainFrame.setSize(screenSize);
		MainFrame.setUndecorated(true);// remove window bar
		MainFrame.getContentPane().setBackground(DarkModeColorPalette.DARK_CHARCOAL);
		MainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MainFrame.setLocationRelativeTo(null);
		MainFrame.getContentPane().setLayout(null);
		MainFrame.setMaximumSize(null);
		MainFrame.requestFocus();
		MainFrame.setVisible(true);
	}

	private void setOptionsMenu() {
		// create the options menu
		Options = new JButton("\u2022 \u2022 \u2022");
		Options.setForeground(Utilities.light);
		Options.setBounds(1824, 22, 75, 40);
		Options.setFocusPainted(false);
		Options.setFocusable(false);
		Options.setContentAreaFilled(false);
		Options.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
		Options.setFont(new Font("Consolas", Font.BOLD, 19));

		// Create the popup menu
		OptionsItems = new JPopupMenu();
		Settings = new JMenuItem("Settings");
		Quit = new JMenuItem("Quit");
		OptionsItems.add(Settings);
		OptionsItems.add(Quit);

		// Add ActionListener to handle button click
		Options.addActionListener(OptionsActionListener);
		Settings.addActionListener(OptionsActionListener);
		Quit.addActionListener(OptionsActionListener);
		MainFrame.getContentPane().add(Options);

	}

	private void setLogo() {
		Logo = new JLabel("Payroll");
		Logo.setHorizontalAlignment(SwingConstants.CENTER);
		Logo.setBounds(750, 11, 543, 244);
		Logo.setBackground(Utilities.dark);
		Logo.setForeground(Color.decode("#8A4FFF"));
		Logo.setFont(new Font("Consolas", Font.BOLD, 99));
		MainFrame.getContentPane().add(Logo);
	}

	private void setUserPanel() {
		UserPanel UserPanel = new UserPanel(30, DarkModeColorPalette.SLIGHTLY_LIGHTER_CHARCOAL, 5);
		MainFrame.getContentPane().add(UserPanel);
	}

	private void setDashBoard() {
		DashBoard DashBoard = new DashBoard(30, DarkModeColorPalette.SLIGHTLY_LIGHTER_CHARCOAL, 5);
		MainFrame.getContentPane().add(DashBoard);
	}

	private void setComponentsTitle() {
		RoundedPanel EmployeesTitle = new RoundedPanel(30, DarkModeColorPalette.SLIGHTLY_LIGHTER_CHARCOAL, 5);
		EmployeesTitle.setBounds(30, 365, 171, 50);
		EmployeesTitle.setLayout(null);
		JLabel EmployeeSubTitle = new JLabel("Employees");
		EmployeeSubTitle.setHorizontalAlignment(SwingConstants.CENTER);
		EmployeeSubTitle.setBounds(28, 11, 110, 30);
		EmployeeSubTitle.setForeground(DarkModeColorPalette.GREAT_PURPLE);
		EmployeeSubTitle.setFont(new Font("Consolas", Font.BOLD, 20));
		EmployeesTitle.add(EmployeeSubTitle);
		MainFrame.getContentPane().add(EmployeesTitle);

		RoundedPanel EmployeeInfo = new RoundedPanel(30, DarkModeColorPalette.SLIGHTLY_LIGHTER_CHARCOAL, 5);
		EmployeeInfo.setBounds(1725, 365, 171, 50);
		EmployeeInfo.setLayout(null);
		JLabel InfoTitle = new JLabel("Viewer");
		InfoTitle.setHorizontalAlignment(SwingConstants.CENTER);
		InfoTitle.setBounds(28, 11, 110, 30);
		InfoTitle.setForeground(DarkModeColorPalette.GREAT_PURPLE);
		InfoTitle.setFont(new Font("Consolas", Font.BOLD, 20));
		EmployeeInfo.add(InfoTitle);
		MainFrame.getContentPane().add(EmployeeInfo);
	}

	private void setEmployeeManager() {
		EmployeeManager EmployeeManager = new EmployeeManager(30, DarkModeColorPalette.SLIGHTLY_LIGHTER_CHARCOAL, 5);
		MainFrame.getContentPane().add(EmployeeManager);
	}

	private void setEmployeesLbl() {
		EmployeeListPnl EmployeesPnl = new EmployeeListPnl(30, DarkModeColorPalette.SLIGHTLY_LIGHTER_CHARCOAL, 5);
		MainFrame.getContentPane().add(EmployeesPnl);
	}

	private void setEmployeeViewer() {
		EmployeeViewer EmployeeViewer = new EmployeeViewer(30, DarkModeColorPalette.SLIGHTLY_LIGHTER_CHARCOAL, 5);
		MainFrame.getContentPane().add(EmployeeViewer);
	}
}
