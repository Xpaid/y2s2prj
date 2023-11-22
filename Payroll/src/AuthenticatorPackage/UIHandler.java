package AuthenticatorPackage;

import java.awt.Color;
import java.awt.Component;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import Tools.Utilities;

public interface UIHandler {

	public static void switchTheme(Authenticator authenticator) {
		Image sun = Utilities.sun_img.getScaledInstance(Authenticator.ThemeBtn.getWidth(),
				Authenticator.ThemeBtn.getHeight(), Image.SCALE_AREA_AVERAGING);
		Image moon = Utilities.moon_img.getScaledInstance(Authenticator.ThemeBtn.getWidth(),
				Authenticator.ThemeBtn.getHeight(), Image.SCALE_AREA_AVERAGING);

		Color background = Authenticator.AuthFrame.getContentPane().getBackground();

		if (background.equals(Utilities.light)) {
			transitionTo(authenticator, sun, 255, 0);
		} else {
			transitionTo(authenticator, moon, 0, 255);
		}
	}

	static void transitionTo(Authenticator authenticator, Image img, int startBg, int startFg) {
		Thread bgThread = new Thread(() -> {
			int bg = startBg, fg = startFg;
			while ((startBg > 0 && bg > 0) || (startBg < 255 && bg < 255)) {
				try {
					Thread.sleep(15);
				} catch (InterruptedException ex) {
					ex.printStackTrace();
				}
				bg += (startBg == 255) ? -17 : 17;
				fg -= (startBg == 255) ? -17 : 17;
				Color newbg = new Color(bg, bg, bg);
				Color newfg = new Color(fg, fg, fg);
				Color brdrclr = newfg;
				changeTheme(Authenticator.AuthFrame, newbg, newfg);
				changeTheme(Authenticator.AuthLbl, newbg, newfg);
				changeTheme(Authenticator.Logo, newbg, newfg);
				changeTheme(Authenticator.UserField, newbg, newfg, brdrclr);
				changeTheme(Authenticator.PassField, newbg, newfg, brdrclr);
				changeTheme(Authenticator.ThemeBtn, newbg, img);
				changeTheme(Authenticator.PassVisibleBtn, newbg);
			}
		});
		bgThread.start();
	}

	private static void changeTheme(Component component, Color bg, Color fg) {
		if (component instanceof JFrame) {
			JFrame frame = (JFrame) component;
			frame.getContentPane().setBackground(bg);
			frame.getContentPane().setForeground(fg);
		} else {
			component.setBackground(bg);
			component.setForeground(fg);
		}
	}

	private static void changeTheme(JTextField textField, Color bg, Color fg, Color border) {
		textField.setBackground(bg);
		textField.setForeground(fg);
		textField.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, border.darker()));
	}

	private static void changeTheme(JButton button, Color bg, Image img) {
		button.setIcon(new ImageIcon(img));
		button.setBackground(bg);
	}

	private static void changeTheme(JButton button, Color bg) {
		button.setBackground(bg);
		updateEyeIcon();
	}

	public static void updateEyeIcon() {
		Image iconImage;
		boolean passwordVisible = isPassVisible();

		if (passwordVisible) {
			if (isdarkTheme(Authenticator.AuthFrame)) {
				iconImage = Utilities.hide_dark_img;
			} else {
				iconImage = Utilities.hide_light_img;
			}
		} else {
			if (isdarkTheme(Authenticator.AuthFrame)) {
				iconImage = Utilities.show_dark_img;
			} else {
				iconImage = Utilities.show_light_img;
			}
		}

		// Scale the image to match the button dimensions
		iconImage = iconImage.getScaledInstance(Authenticator.PassVisibleBtn.getWidth(),
				Authenticator.PassVisibleBtn.getHeight(), Image.SCALE_AREA_AVERAGING);

		// Set the icon image on the PassVisibleBtn button
		Authenticator.PassVisibleBtn.setIcon(new ImageIcon(iconImage));
	}

	static boolean isdarkTheme(Component component) {
		return component.getBackground().equals(Utilities.dark);
	}

	static void showPassword(JPasswordField field) {
		field.setEchoChar((char) 0);
	}

	static void showPassword() {
		Authenticator.PassField.setEchoChar((char) 0);
	}

	static boolean isPassVisible() {
		return Authenticator.PassField.getEchoChar() == 0;
	}

	static void hidePassword() {
		Authenticator.PassField.setEchoChar('\u2022');
	}

	static void showEyeToggle() {
		Authenticator.PassVisibleBtn.setVisible(true);
	}

}
