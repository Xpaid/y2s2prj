
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
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.AbstractBorder;

public interface Utilities {

	
	static Image show_img = new ImageIcon("assets/show.png").getImage();
	static Image hide_img = new ImageIcon("assets/hide.png").getImage();
	
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
	
	public class RoundedTextField extends JTextField {
	    private int radius;
	    private Color fillColor;
	    private int shadowSize;

	    public RoundedTextField(int radius, Color fillColor, int shadowSize) {
	        this.radius = radius;
	        this.fillColor = fillColor;
	        this.shadowSize = shadowSize;
	        setOpaque(false);
	        setBorder(new RoundedBorder());
	    }

	    // Custom border class to create a rounded border with shadow
	    private class RoundedBorder extends AbstractBorder {
	        @Override
	        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
	            Graphics2D g2d = (Graphics2D) g.create();

	            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	            g2d.setColor(new Color(0, 0, 0, 100));
	            g2d.fillRoundRect(shadowSize, shadowSize, width - 2 * shadowSize, height - 2 * shadowSize, radius, radius);
	            g2d.dispose();
	        }

	        @Override
	        public Insets getBorderInsets(Component c) {
	            return new Insets(shadowSize, shadowSize, shadowSize, shadowSize);
	        }
	    }

	    @Override
	    protected void paintComponent(Graphics g) {
	        Graphics2D g2d = (Graphics2D) g.create();

	        // Paint the rounded rectangle
	        g2d.setColor(fillColor);
	        g2d.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, radius, radius);

	        g2d.dispose();
	        super.paintComponent(g);
	    }
	}
	
	public class RoundedJPasswordField extends JPasswordField {
	    private int radius;
	    private Color fillColor;
	    private int shadowSize;

	    public RoundedJPasswordField(int radius, Color fillColor, int shadowSize) {
	        this.radius = radius;
	        this.fillColor = fillColor;
	        this.shadowSize = shadowSize;
	        setOpaque(false);
	        setBorder(new RoundedBorder());
	    }

	    // Custom border class to create a rounded border with shadow
	    private class RoundedBorder extends AbstractBorder {
	        @Override
	        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
	            Graphics2D g2d = (Graphics2D) g.create();

	            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	            g2d.setColor(new Color(0, 0, 0, 100));
	            g2d.fillRoundRect(shadowSize, shadowSize, width - 2 * shadowSize, height - 2 * shadowSize, radius, radius);
	            g2d.dispose();
	        }

	        @Override
	        public Insets getBorderInsets(Component c) {
	            return new Insets(shadowSize, shadowSize, shadowSize, shadowSize);
	        }
	    }

	    @Override
	    protected void paintComponent(Graphics g) {
	        Graphics2D g2d = (Graphics2D) g.create();

	        // Paint the rounded rectangle
	        g2d.setColor(fillColor);
	        g2d.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, radius, radius);

	        g2d.dispose();
	        super.paintComponent(g);
	    }
	}
	
	
	public class RoundedButton extends JButton {
	    private int radius;
	    private Color fillColor;
	    private int shadowSize;

	    public RoundedButton(int radius, Color fillColor, int shadowSize) {
	        this.radius = radius;
	        this.fillColor = fillColor;
	        this.shadowSize = shadowSize;
	        setOpaque(false);
	        setContentAreaFilled(false);
	        setFocusPainted(false);
	    }

	    @Override
	    protected void paintComponent(Graphics g) {
	        Graphics2D g2d = (Graphics2D) g.create();

	        // Enable better anti-aliasing for smoother edges
	        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);

	        // Paint the rounded rectangle
	        g2d.setColor(fillColor);
	        g2d.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, radius, radius);

	        g2d.dispose();
	        super.paintComponent(g);
	    }

	    @Override
	    protected void paintBorder(Graphics g) {
	        Graphics2D g2d = (Graphics2D) g.create();

	        // Enable anti-aliasing for smoother border
	        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	        g2d.setColor(Color.BLACK);
	        g2d.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, radius, radius);

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

