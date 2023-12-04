
package tools;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Insets;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.border.AbstractBorder;

public interface Utilities {

	ImageIcon icon = new ImageIcon("D:\\secret\\Payroll\\assets\\Payroll_Logo_Light.png");
	Image App_icon = icon.getImage();

	static Image User_Icon_Dark = new ImageIcon("assets\\User_Icon_Dark.png").getImage();
	static Image User_Icon_Light = new ImageIcon("assets\\User_Icon_Light.png").getImage();
	static Image Payroll_Logo_Dark = new ImageIcon("assets\\Payroll_Logo_Dark.png").getImage();
	static Image Payroll_Logo_Light = new ImageIcon("assets\\Payroll_Logo_Light.png").getImage();

	static Image sun_img = new ImageIcon("assets\\sun.png").getImage();
	static Image moon_img = new ImageIcon("assets\\moon.png").getImage();

	static Image show_light_img = new ImageIcon("assets/show_light.png").getImage();
	static Image show_dark_img = new ImageIcon("assets/show_dark.png").getImage();
	static Image hide_light_img = new ImageIcon("assets/hide_light.png").getImage();
	static Image hide_dark_img = new ImageIcon("assets/hide_dark.png").getImage();
	static Image search_img = new ImageIcon("assets/search.png").getImage();
	static Image plus_img = new ImageIcon("assets/plus.png").getImage();
	static Image filter_img = new ImageIcon("assets/filter.png").getImage();
	static Image pay_img = new ImageIcon("assets/pay.png").getImage();

	
	static Color light = new Color(255, 255, 255);
	static Color dark = new Color(0, 0, 0);
	static Color neon_Yellow = new Color(255, 255, 0);
	static Color neon_Orange = new Color(255, 165, 0);
	static Color neon_Green = new Color(57, 255, 20);
	static Color neon_Pink = new Color(255, 110, 199);
	static Color neon_Blue = new Color(0, 255, 255);
	
	static class RoundedBorder extends AbstractBorder {
        /**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private int radius;

        public RoundedBorder(int radius) {
            this.radius = radius;
        }

        @Override
        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            Graphics2D g2d = (Graphics2D) g.create();

            // Enable antialiasing for smooth edges
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);

            // Create a rounded rectangle shape
            Shape roundedRectangle = new RoundRectangle2D.Double(x, y, width - 1, height - 1, radius, radius);

            // Set border color and draw the rounded rectangle
            g2d.setColor(Color.BLACK);
            g2d.draw(roundedRectangle);

            g2d.dispose();
        }

        @Override
        public Insets getBorderInsets(Component c) {
            return new Insets(radius, radius, radius, radius);
        }

        @Override
        public Insets getBorderInsets(Component c, Insets insets) {
            insets.left = insets.top = insets.right = insets.bottom = radius;
            return insets;
        }
    }
	
	public class RoundedPanel extends JPanel {

	    /**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private int radius;
	    private Color fillColor;
	    private int shadowSize;

	    public RoundedPanel(int radius, Color fillColor, int shadowSize) {
	        this.radius = radius;
	        this.fillColor = fillColor;
	        this.shadowSize = shadowSize;
	        this.setOpaque(false);
	        //this.setBackground(new Color(0, 0, 0, 0));
	    }

	    @Override
	    protected void paintComponent(Graphics g) {
	        Graphics2D g2d = (Graphics2D) g.create();

	        // Paint the shadow
	        g2d.setColor(new Color(0, 0, 0, 100)); // Shadow color with transparency
	        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	        g2d.fillRoundRect(shadowSize, shadowSize, getWidth() - shadowSize, getHeight() - shadowSize, radius, radius);

	        // Paint the rounded rectangle
	        g2d.setColor(fillColor);
	        g2d.fillRoundRect(0, 0, getWidth() - shadowSize, getHeight() - shadowSize, radius, radius);

	        g2d.dispose();
	    }
	}

	public class DarkModeColorPalette {
	    // Background Color: Dark Charcoal
	    public static final Color DARK_CHARCOAL = Color.decode("#121212");

	    // Panel Color: Slightly Lighter Charcoal
	    public static final Color SLIGHTLY_LIGHTER_CHARCOAL = Color.decode("#1E1E1E");

	    // Accent Color: Great Purple
	    public static final Color GREAT_PURPLE = Color.decode("#8A4FFF");

	    // Font Color: Light Gray
	    public static final Color LIGHT_GRAY = Color.decode("#F5F5F5");

	    // Secondary Font Color: Medium Gray
	    public static final Color MEDIUM_GRAY = Color.decode("#CCCCCC");

	    // Error Color: Red
	    public static final Color RED = Color.decode("#FF1744");

	    // Success Color: Green
	    public static final Color GREEN = Color.decode("#00C853");

	    // Disabled Color: Medium Gray
	    public static final Color DISABLED_GRAY = Color.decode("#666666");

	    // Amber Color: Warm Yellow
	    public static final Color AMBER = Color.decode("#FFC107");
	    
	}
}

