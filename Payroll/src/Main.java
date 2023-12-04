
import java.awt.EventQueue;

import authenticator.Authenticator;
import payroll.Payroll;

public class Main {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new Payroll();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
