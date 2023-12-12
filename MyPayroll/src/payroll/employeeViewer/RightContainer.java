package payroll.employeeViewer;

import java.awt.Color;

import tools.Utilities.DarkModeColorPalette;
import tools.Utilities.RoundedPanel;

public class RightContainer extends RoundedPanel {
	public Defaultpanel defaultpanel = new Defaultpanel(30, DarkModeColorPalette.SLIGHTLY_LIGHTER_CHARCOAL, 5);
	public Employing employing = new Employing(30, DarkModeColorPalette.SLIGHTLY_LIGHTER_CHARCOAL, 5);

	public RightContainer(int radius, Color fillColor, int shadowSize) {
		super(radius, fillColor, shadowSize);
		this.setBounds(1300, 425, 600, 625);
		this.setLayout(null);
		this.setVisible(true);

		this.add(defaultpanel);
		this.add(employing);
	}

}
