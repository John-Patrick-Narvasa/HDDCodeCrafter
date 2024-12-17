

import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class GuiTest {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Hello World!", "Yo Hoo", JOptionPane.INFORMATION_MESSAGE);
        JFrame frame = new JFrame();
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}