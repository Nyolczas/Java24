import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

class MyDrawPanel extends JPanel {
    MyDrawPanel() {
    }

    public void paintComponent(Graphics g) {
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
        int red = (int)(Math.random() * 255.0D);
        int green = (int)(Math.random() * 255.0D);
        int blue = (int)(Math.random() * 255.0D);
        Color randomColor = new Color(red, green, blue);
        g.setColor(randomColor);
        g.fillOval(92, 63, 100, 100);
    }
}
