package authenticator;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;

import payroll.listeners.Listeners;
import tools.Utilities;
import tools.Utilities.DarkModeColorPalette;
import tools.Utilities.RoundedButton;
import tools.Utilities.RoundedJPasswordField;
import tools.Utilities.RoundedPanel;
import tools.Utilities.RoundedTextField;

public class Authenticator implements Listeners {
	public static JFrame authFrame;
	public static JLabel authStatelbl;
	public static JLabel asklbl;
	public static JButton changestatebtn;

	public static RoundedTextField companyField;
	public static RoundedJPasswordField passField;
	public static JButton eyebtn;

	public Authenticator() {
		authFrame = new JFrame();
		authFrame.setTitle("Payroll");
		authFrame.setSize(350, 475);
		authFrame.setLocationRelativeTo(null);
		authFrame.setResizable(false);
		authFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		authFrame.getContentPane().setBackground(DarkModeColorPalette.DARK_CHARCOAL);
		authFrame.setFocusable(true);
		authFrame.getContentPane().setLayout(null);

		RoundedPanel panel = new RoundedPanel(30, DarkModeColorPalette.SLIGHTLY_LIGHTER_CHARCOAL, 5);
		panel.setBounds(44, 20, 250, 60);
		panel.setLayout(null);
		authFrame.getContentPane().add(panel);

		JLabel Logo = new JLabel("Payroll");
		Logo.setBounds(65, 11, 120, 36);
		Logo.setHorizontalAlignment(SwingConstants.CENTER);
		Logo.setVerticalAlignment(SwingConstants.CENTER);
		Logo.setForeground(DarkModeColorPalette.GREAT_PURPLE);
		Logo.setFont(new Font("Consolas", Font.BOLD, 31));
		panel.add(Logo);

		authStatelbl = new JLabel("Login");
		authStatelbl.setBounds(54, 110, 95, 27);
		authStatelbl.setForeground(DarkModeColorPalette.MEDIUM_GRAY);
		authStatelbl.setFont(new Font("Consolas", Font.BOLD, 22));
		authFrame.getContentPane().add(authStatelbl);

		JLabel companyLbl = new JLabel("company");
		companyLbl.setBounds(54, 165, 65, 14);
		companyLbl.setForeground(DarkModeColorPalette.MEDIUM_GRAY.darker());
		companyLbl.setFont(new Font("Consolas", Font.BOLD, 12));
		companyLbl.setBorder(null);
		authFrame.getContentPane().add(companyLbl);

		companyField = new RoundedTextField(20, DarkModeColorPalette.SLIGHTLY_LIGHTER_CHARCOAL, 5);
		companyField.setBounds(54, 190, 230, 30);
		companyField.setForeground(DarkModeColorPalette.LIGHT_GRAY);
		companyField.setHorizontalAlignment(SwingConstants.CENTER);
		companyField.setFont(new Font("Consolas", Font.PLAIN, 14));
		companyField.setBorder(null);
		companyField.addKeyListener(filtercharacter);
		authFrame.getContentPane().add(companyField);

		JLabel passwordLbl = new JLabel("password");
		passwordLbl.setBounds(54, 245, 65, 14);
		passwordLbl.setForeground(DarkModeColorPalette.MEDIUM_GRAY.darker());
		passwordLbl.setFont(new Font("Consolas", Font.BOLD, 12));
		passwordLbl.setBorder(null);
		authFrame.getContentPane().add(passwordLbl);

		passField = new RoundedJPasswordField(20, DarkModeColorPalette.SLIGHTLY_LIGHTER_CHARCOAL, 20);
		passField.setBounds(54, 275, 230, 30);
		passField.setForeground(DarkModeColorPalette.LIGHT_GRAY);
		passField.setHorizontalAlignment(SwingConstants.CENTER);
		passField.setFont(new Font("Consolas", Font.PLAIN, 14));
		passField.setBorder(null);
		passField.addKeyListener(filtercharacter);
		authFrame.getContentPane().add(passField);

		eyebtn = new JButton();
		eyebtn.setContentAreaFilled(false);
		eyebtn.setBorder(null);
		eyebtn.setBounds(291, 278, 20, 20);
		eyebtn.setIcon(new ImageIcon(Utilities.show_img.getScaledInstance(eyebtn.getWidth(), eyebtn.getHeight(),
				Image.SCALE_AREA_AVERAGING)));
		eyebtn.addActionListener(changeVisibility);
		authFrame.getContentPane().add(eyebtn);

		asklbl = new JLabel("no account yet?");
		asklbl.setHorizontalAlignment(SwingConstants.CENTER);
		asklbl.setForeground(DarkModeColorPalette.MEDIUM_GRAY.darker());
		asklbl.setFont(new Font("Consolas", Font.BOLD, 10));
		asklbl.setBorder(null);
		asklbl.setBounds(65, 345, 130, 14);
		authFrame.getContentPane().add(asklbl);

		changestatebtn = new JButton("Create");
		changestatebtn.setContentAreaFilled(false);
		changestatebtn.setFont(new Font("Consolas", Font.PLAIN, 10));
		changestatebtn.setForeground(DarkModeColorPalette.GREAT_PURPLE);
		changestatebtn.setBounds(195, 345, 53, 14);
		changestatebtn.setBorder(null);
		changestatebtn.setFocusable(false);
		changestatebtn.addActionListener(changeAuthWay);
		authFrame.getContentPane().add(changestatebtn);

		RoundedButton Go = new RoundedButton(20, DarkModeColorPalette.GREEN, 5);
		Go.setText("Go");
		Go.setBounds(125, 380, 76, 36);
		Go.setFont(new Font("Consolas", Font.BOLD, 16));
		Go.setForeground(DarkModeColorPalette.DARK_CHARCOAL);
		Go.setBorder(null);
		Go.addActionListener(Sendrequest);
		authFrame.getContentPane().add(Go);
		
		JLabel versionString = new JLabel("version.1.0.Jets");
		versionString.setHorizontalTextPosition(SwingConstants.CENTER);
		versionString.setHorizontalAlignment(SwingConstants.RIGHT);
		versionString.setForeground(DarkModeColorPalette.MEDIUM_GRAY.darker());
		versionString.setFont(new Font("Consolas", Font.BOLD, 10));
		versionString.setBorder(null);
		versionString.setBounds(204, 422, 130, 14);
		authFrame.getContentPane().add(versionString);

		authFrame.setVisible(true);
	}
}
