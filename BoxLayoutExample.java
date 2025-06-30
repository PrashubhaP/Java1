import javax.swing.*; // Needed for JFrame, JPanel, JButton, BoxLayout

public class BoxLayoutExample {
    
    public static void main(String[] args) {
        // Create a frame
        JFrame frame = new JFrame("BoxLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 600);

        // Create a panel
        JPanel panel = new JPanel();

        // Apply BoxLayout and fix the error
        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));

        // Add multiple buttons
        panel.add(new JButton("Button 1"));
        panel.add(new JButton("Button 2"));
        panel.add(new JButton("Button 3"));
        panel.add(new JButton("Button 4"));

        // Add panel to frame
        frame.add(panel);
        frame.setVisible(true);
    }
}
