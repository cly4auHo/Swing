package swingPackage;

import java.io.File;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SwingApp extends JFrame {
    SwingApp() {
        JPanel panel = new JPanel();
        URL url = this.getClass().getClassLoader().getResource("images/pudge.jpg");

        JLabel label = new JLabel(new ImageIcon(url));
        JLabel label2 = new JLabel(url.toString());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setSize(500, 500);

        panel.add(label2);
        panel.add(label);
        add(panel);
    }

    public static void main(String[] args) {
        new SwingApp();
    }
}
