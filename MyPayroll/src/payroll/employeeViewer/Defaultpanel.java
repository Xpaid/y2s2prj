package payroll.employeeViewer;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

import tools.Utilities.DarkModeColorPalette;
import tools.Utilities.RoundedPanel;
public class Defaultpanel extends RoundedPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static JLabel placeholder;

	public Defaultpanel(int radius, Color fillColor, int shadowSize) {
		super(radius, fillColor, shadowSize);
		this.setBounds(1300, 425, 600, 625);
		this.setLayout(null);

		placeholder = new JLabel("Select Entity to View");
		placeholder.setBounds(140, 200, 300, 100);
		placeholder.setHorizontalAlignment(SwingConstants.CENTER);
		placeholder.setFont(new Font("Consolas", Font.PLAIN, 18));
		placeholder.setForeground(DarkModeColorPalette.MEDIUM_GRAY.darker());
		this.add(placeholder);

	}

}
