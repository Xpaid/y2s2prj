package payroll.functions;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import tools.Utilities;

public interface Functions {

	public static Image selectImage() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("Image Files", "jpg", "png", "gif"));
        
        int result = fileChooser.showOpenDialog(null);
        
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            
            try {
                return ImageIO.read(selectedFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        
        return null; // Return null if no image is selected or an error occurs
    }
	
	public static boolean isFilled(JTextField comp) {
		if (comp.getText().length() >= 5) {
			return true;
		}
		return false;
	}

	public static boolean isValid(char c) {
		if (Character.isAlphabetic(c) || Character.isDigit(c)) {
			return true;
		}
		return false;
	}

	public static void passVisibility(JPasswordField field, JButton button) {
		if (field.getEchoChar() == '\u2022') {
			field.setEchoChar((char) 0);
			button.setIcon(new ImageIcon(Utilities.hide_img.getScaledInstance(button.getWidth(), button.getHeight(),
					Image.SCALE_AREA_AVERAGING)));

			return;
		}
		field.setEchoChar('\u2022');
		button.setIcon(new ImageIcon(Utilities.show_img.getScaledInstance(button.getWidth(), button.getHeight(),
				Image.SCALE_AREA_AVERAGING)));

	}

	public static void changeAuth(JComponent authstatelbl, JComponent asklbl, JComponent changestatebtn) {
		if (((JLabel) authstatelbl).getText().equals("Login")) {
			toSignUp(authstatelbl, asklbl, changestatebtn);
			return;
		}
		toLogin(authstatelbl, asklbl, changestatebtn);

	}

	private static void toLogin(JComponent authstatelbl, JComponent asklbl, JComponent changestatebtn) {
		((JLabel) authstatelbl).setText("Login");
		((JLabel) asklbl).setText("no account yet?");
		((JButton) changestatebtn).setText("Create");

	}

	private static void toSignUp(JComponent authstatelbl, JComponent asklbl, JComponent changestatebtn) {
		((JLabel) authstatelbl).setText("Sign up");
		((JLabel) asklbl).setText("have account already?");
		((JButton) changestatebtn).setText("Login");
	}

	public static boolean isValidEmail(String email) {
		String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
		Pattern pattern = Pattern.compile(emailRegex);
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}
}
