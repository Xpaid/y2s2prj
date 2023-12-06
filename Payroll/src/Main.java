
import java.awt.EventQueue;
import authenticator.Authenticator;

public class Main {

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
