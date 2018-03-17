import java.awt.*;
import javax.swing.JPanel;

public class randomGradient extends JPanel {
    randomGradient() {
    }

    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        int red = (int) (Math.random() * 255);
        int green = (int) (Math.random() * 255);
        int blue = (int) (Math.random() * 255);
        Color startColor = new Color(red, green, blue);

        red = (int) (Math.random() * 255);
        green = (int) (Math.random() * 255);
        blue = (int) (Math.random() * 255);
        Color endColor = new Color(red, green, blue);

        GradientPaint gradient =  new GradientPaint(92,63, startColor, 192, 163, endColor);
        g2d.setPaint(gradient);
        g2d.fillOval(92,63,100,100);
    }
}
