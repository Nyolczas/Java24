import java.awt.*;
import javax.swing.JPanel;

public class simpleGradient extends JPanel {
    simpleGradient() {
    }

    public void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g;

        GradientPaint gradient =  new GradientPaint(92,70, Color.blue, 192, 70, Color.orange);

        g2d.setPaint(gradient);
        g2d.fillRect(92,75,100,100);
    }
}
