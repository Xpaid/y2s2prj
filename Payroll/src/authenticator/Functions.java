package authenticator;

import java.awt.Component;
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

import javax.swing.ImageIcon;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import tools.Utilities;

public class Functions implements UIHandler {
	private static String password = "";
	private static String username = "";

	protected static MouseListener requestFocus = new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
			Component component = e.getComponent();
			component.requestFocusInWindow();
		}
	};

	// change theme
	protected static ActionListener switchTheme = new ActionListener() {
		Authenticator authenticator;

		@Override
		public void actionPerformed(ActionEvent e) {

			UIHandler.switchTheme(authenticator);
		}
	};

	protected static FocusListener add_PlaceHolder = new FocusListener() {

		JTextField field;

		@Override
		public void focusGained(FocusEvent e) {

			field = (JTextField) e.getComponent();

			if (field.getText().equals("username")) {
				field.setText(username);
			} else if (field.getText().equals("password")) {
				field.setText(password);
				UIHandler.hidePassword();
				UIHandler.updateEyeIcon();
				UIHandler.showEyeToggle();
			}
		}

		@Override
		public void focusLost(FocusEvent e) {

			if (field.getText().isEmpty()) {

				if (field.equals(Authenticator.UserField)) {
					field.setText("username");
					username = "";
				} else if (field.equals(Authenticator.PassField)) {
					field.setText("password");
					UIHandler.showPassword((JPasswordField) field);
					password = "";
					UIHandler.defaulteyeIconShow();
				}

			} else {

				if (field == Authenticator.UserField) {
					username = field.getText();
				} else if (field == Authenticator.PassField) {
					password = field.getText();
				}
			}
		}
	};

	protected static ActionListener toggleEyeBtn = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {

			if (!password.isBlank() || Authenticator.PassField.isFocusOwner()) {
				if (UIHandler.isPassVisible()
						|| Authenticator.PassVisibleBtn.getIcon().equals(new ImageIcon(Utilities.show_light_img))) {
					UIHandler.hidePassword();
				} else {
					UIHandler.showPassword();
				}
				UIHandler.updateEyeIcon();

			}
		}
	};

	// filter and assign
	protected static KeyListener DigestInput = new KeyAdapter() {
		@Override
		public void keyTyped(KeyEvent e) {
			char c = e.getKeyChar();

			if (!(Character.isAlphabetic(c) || Character.isDigit(c))) {
				e.consume();
			} else if (e.isControlDown() && e.getKeyCode() == KeyEvent.VK_V) {
				e.consume();
			} else {
				if (e.getComponent().equals(Authenticator.UserField)) {
					if (islimit(username, 15))
						e.consume();
					else
						Functions.username = new String(Authenticator.UserField.getText()) + c;
				} else {
					if (islimit(password, 15))
						e.consume();
					else
						Functions.password = new String(Authenticator.PassField.getPassword()) + c;
				}
			}
		}
	};

	protected static ActionListener sendRequest = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {

			if (!username.isBlank() && !password.isBlank()) {
				System.out.println(getUsername(username));
				System.out.println(getPassword(password));
			}
		}
	};

	private static boolean islimit(String text, int limit) {
		if (text.length() >= limit)
			return true;
		else
			return false;
	}

	protected static char[] getUsername(String username) {
		return username.toCharArray();
	}

	protected static char[] getPassword(String password) {
		return password.toCharArray();
	}

}
