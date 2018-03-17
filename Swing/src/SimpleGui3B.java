import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleGui3B{
    JFrame frame;

    public static void main(String[] args) {
        SimpleGui3B gui = new SimpleGui3B();
        gui.go();
    }

    public void go(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        simpleGradient sg = new simpleGradient();

        frame.getContentPane().add(sg);
        frame.setSize(300,300);
        frame.setVisible(true);
    }

}
