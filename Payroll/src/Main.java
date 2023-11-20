
import java.awt.EventQueue;

import AuthenticatorPackage.Authenticator;

final public class Main {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new Authenticator();
					//new Payroll();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
