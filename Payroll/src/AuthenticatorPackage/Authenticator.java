package AuthenticatorPackage;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import Tools.Utilities;

public class Authenticator extends Functions {
	public static JFrame AuthFrame;
	public static JLabel AuthLbl, Logo;
	public static JButton AuthBtn;
	public static JButton ThemeBtn;
	public static JButton PassVisibleBtn;
	public static JTextField UserField;
	public static JPasswordField PassField;
	public Authenticator() {
		_init_Auth();
	}
	//call all components
	void _init_Auth() {
		set_authFrame();
		set_Logo();
		set_ThemeBtn();
		set_AuthLbl();
		set_AuthBtn();
		set_UserField();
		set_PassField();
		set_PassVisibleBtn();
	}
	
	void set_authFrame() {
		AuthFrame = new JFrame("Payroll");
		AuthFrame.setSize(700, 460);
		AuthFrame.setResizable(false);
		AuthFrame.setLocationRelativeTo(null);
		AuthFrame.setIconImage(Utilities.App_icon);
		AuthFrame.getContentPane().setLayout(null);
		AuthFrame.setForeground(Utilities.light);
		AuthFrame.getContentPane().setBackground(Utilities.light);
		AuthFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		AuthFrame.setFocusable(true);
		AuthFrame.addMouseListener(Functions.requestFocus);
		AuthFrame.setVisible(true);
	}
	
	void set_AuthLbl() {
		AuthLbl = new JLabel("Sign-up");
		AuthLbl.setBounds(60, 75, 180, 75);
		AuthLbl.setBackground(Utilities.light);
		AuthLbl.setForeground(Utilities.dark);
		AuthLbl.setFont(new Font("Consolas", Font.BOLD, 27));
		AuthLbl.setHorizontalAlignment(SwingConstants.CENTER);
		AuthFrame.getContentPane().add(AuthLbl);
	}
	
	void set_UserField() {
		UserField = new JTextField("username");
		UserField.setBounds(75, 160, 150, 25);
		UserField.setBackground(Utilities.light);
		UserField.setForeground(Utilities.dark);
		UserField.setFont(new Font("Consolas", Font.PLAIN, 16));
		UserField.setHorizontalAlignment(SwingConstants.CENTER);
		UserField.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Utilities.dark));
		UserField.addFocusListener(Functions.add_PlaceHolder);
		UserField.addKeyListener(Functions.filterSpace);
		AuthFrame.getContentPane().add(UserField);
		
	}
	
	void set_PassField() {
		PassField = new JPasswordField("password");
		PassField.setEchoChar((char) 0);
		PassField.setBounds(75, 220, 150, 25);
		PassField.setBackground(Utilities.light);
		PassField.setForeground(Utilities.dark);
		PassField.setFont(new Font("Consolas", Font.PLAIN, 16));
		PassField.setHorizontalAlignment(SwingConstants.CENTER);
		PassField.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Utilities.dark));
		PassField.addFocusListener(Functions.add_PlaceHolder);
		PassField.addKeyListener(Functions.filterSpace);
		AuthFrame.getContentPane().add(PassField);
	}
	
	void set_PassVisibleBtn() {
		PassVisibleBtn = new JButton();
		PassVisibleBtn.setBounds(229, 220, 20, 20);
		PassVisibleBtn.setBorder(null);
		PassVisibleBtn.setFocusable(false);
		PassVisibleBtn.setBackground(Utilities.light);
		PassVisibleBtn.setIcon(new ImageIcon(Utilities.show_light_img.getScaledInstance(Authenticator.PassVisibleBtn.getWidth(), Authenticator.PassVisibleBtn.getHeight(), Image.SCALE_AREA_AVERAGING)));
		PassVisibleBtn.addActionListener(Functions.toggleEyeBtn);
		AuthFrame.getContentPane().add(PassVisibleBtn);
	}
	
	void set_AuthBtn() {
		AuthBtn = new JButton("Create");
		AuthBtn.setBounds(95, 300, 115, 35);
		AuthBtn.setBorder(null);
		AuthBtn.setFocusable(false);
		AuthBtn.setBackground(Color.GREEN);
		AuthBtn.setForeground(Utilities.dark);
		AuthBtn.setHorizontalAlignment(SwingConstants.CENTER);
		AuthBtn.setVerticalAlignment(SwingConstants.CENTER);
		AuthBtn.setFont(new Font("Consolas", Font.BOLD, 21));
		AuthBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//System.out.println(Functions.getPassword());
			}
		});
		AuthFrame.getContentPane().add(AuthBtn);
	}
	
	void set_ThemeBtn() {
		ThemeBtn = new JButton();
		ThemeBtn.setBounds(620, 15, 40, 40);
		ThemeBtn.setBorder(BorderFactory.createEmptyBorder());
		ThemeBtn.setFocusable(false);
		ThemeBtn.setIcon(new ImageIcon(Utilities.moon_img.getScaledInstance(ThemeBtn.getWidth(), ThemeBtn.getHeight(), Image.SCALE_AREA_AVERAGING)));
		ThemeBtn.setBackground(Utilities.light);
		ThemeBtn.addActionListener(Functions.switchTheme);
		AuthFrame.getContentPane().add(ThemeBtn);
	}
	
	void set_Logo() {
		Logo = new JLabel("PayRoll");
		Logo.setBounds(315, 135, 315, 150);	
		Logo.setBackground(Utilities.light);
		Logo.setForeground(Utilities.dark);
		Logo.setFont(new Font("Consolas", Font.BOLD, 65));
		Logo.setHorizontalAlignment(SwingConstants.CENTER);
		AuthFrame.getContentPane().add(Logo);
	}
	
}
