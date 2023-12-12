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
import javax.swing.JPopupMenu;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

import payroll.dashboard.DashBoard;
import payroll.employeeList.EmployeeListPnl;
import payroll.employeeManager.EmployeeManager;
import payroll.employeeViewer.RightContainer;
import payroll.employeeViewer.Defaultpanel;
import payroll.listeners.Listeners;
import payroll.userpanel.UserPanel;
import tools.Utilities;
import tools.Utilities.DarkModeColorPalette;
import tools.Utilities.RoundedPanel;

public class Payroll implements Listeners {

	public static JFrame MainFrame;

	public static JButton Options;
	public static JPopupMenu OptionsItems;
	public static JMenuItem Settings;
	public static JMenuItem Quit;

	private JLabel Logo;
	private RoundedPanel EmployeesTitle;
	private JLabel EmployeeSubTitle;

	public static RightContainer RightContainer;


	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

	public Payroll() {

		MainFrame = new JFrame();
		MainFrame.setLocation(0, 0);
		MainFrame.setSize(screenSize);
		MainFrame.setUndecorated(true);// remove window bar
		MainFrame.getContentPane().setBackground(DarkModeColorPalette.DARK_CHARCOAL);
		MainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		MainFrame.setLocationRelativeTo(null);
		MainFrame.getContentPane().setLayout(null);
		MainFrame.setMaximumSize(null);
		MainFrame.requestFocus();
		MainFrame.setVisible(true);

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

		Logo = new JLabel("Payroll");
		Logo.setHorizontalAlignment(SwingConstants.CENTER);
		Logo.setBounds(750, 11, 543, 244);
		Logo.setBackground(Utilities.dark);
		Logo.setForeground(Color.decode("#8A4FFF"));
		Logo.setFont(new Font("Consolas", Font.BOLD, 99));
		MainFrame.getContentPane().add(Logo);

		EmployeesTitle = new RoundedPanel(30, DarkModeColorPalette.SLIGHTLY_LIGHTER_CHARCOAL, 5);
		EmployeesTitle.setBounds(30, 365, 171, 50);
		EmployeesTitle.setLayout(null);
		EmployeeSubTitle = new JLabel("Employees");
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

		EmployeeManager EmployeeManager = new EmployeeManager(30, DarkModeColorPalette.SLIGHTLY_LIGHTER_CHARCOAL, 5);
		MainFrame.getContentPane().add(EmployeeManager);

		EmployeeListPnl EmployeesPnl = new EmployeeListPnl(30, DarkModeColorPalette.SLIGHTLY_LIGHTER_CHARCOAL, 5);
		MainFrame.getContentPane().add(EmployeesPnl);

		UserPanel UserPanel = new UserPanel(30, DarkModeColorPalette.SLIGHTLY_LIGHTER_CHARCOAL, 5);
		MainFrame.getContentPane().add(UserPanel);

		DashBoard DashBoard = new DashBoard(30, DarkModeColorPalette.SLIGHTLY_LIGHTER_CHARCOAL, 5);
		MainFrame.getContentPane().add(DashBoard);

		RightContainer = new RightContainer(30, DarkModeColorPalette.SLIGHTLY_LIGHTER_CHARCOAL, 5);
		MainFrame.getContentPane().add(RightContainer);
		/*
		 * Defaultpanel = new Defaultpanel(30,
		 * DarkModeColorPalette.SLIGHTLY_LIGHTER_CHARCOAL, 5);
		 * MainFrame.getContentPane().add(Defaultpanel);
		 */

		//Defaultpanel.defaultpanel.add(new Employer(30, DarkModeColorPalette.SLIGHTLY_LIGHTER_CHARCOAL, 0));


	}
}
