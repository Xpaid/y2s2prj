
package Tools;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;

import AuthenticatorPackage.Authenticator;

public interface Utilities {
	
	ImageIcon icon = new ImageIcon("D:\\secret\\Payroll\\assets\\Payroll_Logo_Light.png");
	Image App_icon = icon.getImage();

	ImageIcon User_Icon_Dark = new ImageIcon("assets\\User_Icon_Dark");
	ImageIcon User_Icon_Light = new ImageIcon("assets\\User_Icon_Light");
	static Image Payroll_Logo_Dark = new ImageIcon("assets\\Payroll_Logo_Dark.png").getImage();
	static Image Payroll_Logo_Light = new ImageIcon("assets\\Payroll_Logo_Light.png").getImage();
	
	static Image sun_img = new ImageIcon("assets\\sun.png").getImage();
	static Image moon_img = new ImageIcon("assets\\moon.png").getImage();
	
	static Image show_light_img = new ImageIcon("assets\\show_light.png").getImage();
	static Image show_dark_img = new ImageIcon("assets\\show_dark.png").getImage();
	static Image hide_light_img = new ImageIcon("assets\\hide_light.png").getImage();
	static Image hide_dark_img = new ImageIcon("assets\\hide_dark.png").getImage();

	static Color light = new Color(255, 255, 255);
	static Color dark = new Color(0, 0, 0);
	static Color neon_Yellow = new Color(255, 255, 0);
	static Color neon_Orange = new Color(255, 165, 0);
	static Color neon_Green = new Color(57, 255, 20);
	static Color neon_Pink = new Color(255, 110, 199);
	static Color neon_Blue = new Color(0, 255, 255);

}
