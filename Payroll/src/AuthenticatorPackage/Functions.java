package AuthenticatorPackage;

import java.awt.Component;
import java.awt.event.*;

import javax.swing.ImageIcon;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import Tools.Utilities;

public class Functions implements UIHandler {

	protected static MouseListener requestFocus = new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
			Component component = e.getComponent();
			component.requestFocusInWindow();
		}
	};
	protected static FocusListener add_PlaceHolder = new FocusListener() {
		String password = "";
		String user = "";

		JTextField field;

		@Override
		public void focusGained(FocusEvent e) {

			field = (JTextField) e.getComponent();

			if (field.getText().equals("username")) {
				field.setText(user);
			} else if (field.getText().equals("password")) {
				field.setText(password);
				UIHandler.hidePassword();
				UIHandler.showEyeToggle();
			}
		}

		@Override
		public void focusLost(FocusEvent e) {

			if (field.getText().isEmpty()) {

				if (field.equals(Authenticator.UserField)) {
					field.setText("username");
					user = null;
				} else if (field.equals(Authenticator.PassField)) {
					field.setText("password");
					UIHandler.showPassword((JPasswordField) field);
					password = null;
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

	protected static ActionListener switchTheme = new ActionListener() {
		Authenticator authenticator;
		@Override
		public void actionPerformed(ActionEvent e) {
			UIHandler.switchTheme(authenticator);
		}
	};
	protected static ActionListener toggleEyeBtn = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (UIHandler.isPassVisible()
					|| Authenticator.PassVisibleBtn.getIcon().equals(new ImageIcon(Utilities.show_light_img))) {
				UIHandler.hidePassword();
				UIHandler.updateEyeIcon();
			} else {
				UIHandler.showPassword();
				UIHandler.updateEyeIcon();
			}
		}
	};
}
