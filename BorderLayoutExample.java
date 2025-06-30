import javax.swing.*;
import java.awt.*;

public class BorderLayoutExample {
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("BorderLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);

        // Set BorderLayout for the frame (optional, default for JFrame)
        frame.setLayout(new BorderLayout());

        // Add buttons to different regions of the BorderLayout
        frame.add(new JButton("BUTTON1"), BorderLayout.NORTH);
        frame.add(new JButton("BUTTON2"), BorderLayout.SOUTH);
        frame.add(new JButton("BUTTON3"), BorderLayout.EAST);
        frame.add(new JButton("BUTTON4"), BorderLayout.WEST);
        frame.add(new JButton("BUTTON5"), BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
