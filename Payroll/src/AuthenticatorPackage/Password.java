package AuthenticatorPackage;

import javax.swing.JTextField;

public class Password {
	private String password;
	private String placeHolder = "password";
	final char hide_char = '\u2022';
	
	public Password(JTextField passfield) {
		passfield.setText(placeHolder);
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
