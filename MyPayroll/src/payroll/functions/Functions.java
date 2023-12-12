package payroll.functions;

import java.awt.Container;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
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

import data.Employee;
import payroll.Payroll;
import payroll.employeeViewer.Employing;
import tools.Utilities;

public interface Functions {
	
	public static boolean areAllFieldsNotBlank() {
	    if (Employing.txtF_EmployeeFirstName.getText().isBlank()
	            || Employing.txtF_EmployeeLastName.getText().isBlank()
	            || Employing.txtF_EmployeeAddress.getText().isBlank()
	            || Employing.txtF_EmployeeGender.getText().isBlank()
	            || Employing.txtF_EmployeeEmail.getText().isBlank()
	            || Employing.txtf_EmployeeContact.getText().isBlank()
	            || Employing.txtF_EmployeeJobTitle.getText().isBlank()
	            || Employing.txtf_EmployeeWorkLocation.getText().isBlank()
	            || Employing.txtF_EmployeeBankAcc.getText().isBlank()
	            || Employing.txtF_EmployeeMonthlySalary.getText().isBlank()
	            || Employing.EmployeeBirthDate.getDate() == null
	            || Employing.EmployeeStartDate.getDate() == null
	            || Employing.EmployeeContractEnd.getDate() == null) {
	        return false; // At least one field is blank
	    } else {
	        return true; // All fields are not blank
	    }
	}
	
	public static void clearFields() {
	    // Clear text fields
		Employing.lbl_EmployeeAvatar.setIcon(null);
	    Employing.txtF_EmployeeFirstName.setText("");
	    Employing.txtF_EmployeeLastName.setText("");
	    Employing.txtF_EmployeeAddress.setText("");
	    Employing.txtF_EmployeeGender.setText("");
	    Employing.txtF_EmployeeEmail.setText("");
	    Employing.txtf_EmployeeContact.setText("");
	    Employing.txtF_EmployeeJobTitle.setText("");
	    Employing.txtf_EmployeeWorkLocation.setText("");
	    Employing.txtF_EmployeeBankAcc.setText("");
	    Employing.txtF_EmployeeMonthlySalary.setText("");

	    // Clear date choosers
	    Employing.EmployeeBirthDate.setDate(null);
	    Employing.EmployeeStartDate.setDate(null);
	    Employing.EmployeeContractEnd.setDate(null);
	}
	
	
	public static void addEmployee() {
		Payroll.RightContainer.defaultpanel.setVisible(false);
		Payroll.RightContainer.employing.setVisible(true);
	}	

	public static void close() {
		Payroll.RightContainer.defaultpanel.setVisible(true);
		Payroll.RightContainer.employing.setVisible(false);
	}
	
	public static Image selectImage() {

		JFileChooser fileChooser = new JFileChooser();
		fileChooser
				.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("Image Files", "jpg", "png", "gif"));

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
	
	public static boolean isNumber(char c) {
		if (Character.isDigit(c)) {
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
