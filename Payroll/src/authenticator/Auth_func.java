package authenticator;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import tools.Utilities;

public abstract class Auth_func {

	protected class UI extends Auth_func {

		static ActionListener changeTheme = new ActionListener() {
			Authenticator authenticator;

			@Override
			public void actionPerformed(ActionEvent e) {
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

			private void transitionTo(Authenticator authenticator, Image img, int startBg, int startFg) {
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

			private void changeTheme(Component component, Color bg, Color fg) {
				if (component instanceof JFrame) {
					JFrame frame = (JFrame) component;
					frame.getContentPane().setBackground(bg);
					frame.getContentPane().setForeground(fg);
				} else {
					component.setBackground(bg);
					component.setForeground(fg);
				}
			}

			private void changeTheme(JTextField textField, Color bg, Color fg, Color border) {
				textField.setBackground(bg);
				textField.setForeground(fg);
				textField.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, border.darker()));
			}

			private void changeTheme(JButton button, Color bg, Image img) {
				button.setIcon(new ImageIcon(img));
				button.setBackground(bg);
			}

			private void changeTheme(JButton button, Color bg) {
				button.setBackground(bg);
				Mechanics.updateButtonIcon();
			}
		};

	}

	protected class Mechanics extends Auth_func {
		private static String password = "";
		private static String user = "";

		protected static MouseListener requestFocus = new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Component component = e.getComponent();
				component.requestFocusInWindow();
			}
		};
		protected static FocusListener add_PlaceHolder = new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
				JTextField field = (JTextField) e.getComponent();
				if (field.getText().equals("username")) {
					field.setText(user);
				} else if (field.getText().equals("password")) {
					// Authenticator.PassVisibleBtn.setIcon(new
					// ImageIcon(Utilities.show_light_img.getScaledInstance(Authenticator.PassVisibleBtn.getWidth(),
					// Authenticator.PassVisibleBtn.getHeight(), Image.SCALE_AREA_AVERAGING)));
					field.setText(password);
					((JPasswordField) field).setEchoChar('\u2022');
					Authenticator.PassVisibleBtn.setVisible(true);
				}
			}

			@Override
			public void focusLost(FocusEvent e) {
				JTextField field = (JTextField) e.getComponent();
				if (field.getText().isEmpty()) {
					if (field == Authenticator.UserField) {
						field.setText("username");
						user = null;
					} else if (field == Authenticator.PassField) {
						field.setText("password");
						((JPasswordField) field).setEchoChar((char) 0);
						password = null;
						Authenticator.PassVisibleBtn.setVisible(false);
					}
				} else {

					if (field == Authenticator.UserField) {
						user = field.getText();
					} else if (field == Authenticator.PassField) {
						password = field.getText();
					}
				}
			}
		};

		protected static KeyListener filterSpace = new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();

				if (!(Character.isAlphabetic(c) || Character.isDigit(c))) {
					e.consume();
				}
			}
		};

		protected static ActionListener toggleEyeBtn = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (isPassVisible()
						|| Authenticator.PassVisibleBtn.getIcon().equals(new ImageIcon(Utilities.show_light_img))) {
					hidePassword();
					updateButtonIcon();
				} else {
					showPassword();
					updateButtonIcon();
				}
			}
		};

		public static void updateButtonIcon() {
			Image iconImage;
			boolean passwordVisible = isPassVisible();

			if (passwordVisible) {
				if (darkTheme()) {
					iconImage = Utilities.hide_dark_img;
				} else {
					iconImage = Utilities.hide_light_img;
				}
			} else {
				if (darkTheme()) {
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

		private static boolean darkTheme() {
			return Authenticator.AuthFrame.getContentPane().getBackground().equals(Utilities.dark);
		}

		private static boolean isPassVisible() {
			return Authenticator.PassField.getEchoChar() == 0;
		}

		private static void showPassword() {
			Authenticator.PassField.setEchoChar((char) 0);
		}

		private static void hidePassword() {
			Authenticator.PassField.setEchoChar('\u2022');
		}

		public static String getPassword() {
			return password;
		}
	}
}