import javax.swing.*;
import java.awt.*;
import java.net.URL;
import java.util.*;

public class ErrorWindow {
    public static void window() {
        Random rand = new Random();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(200,100);
                int maxX = screenSize.width - frame.getWidth();
                int maxY = screenSize.height - frame.getHeight();
                int x = rand.nextInt(maxX + 1);
                int y = rand.nextInt(maxY + 1);
                URL iconURL = getClass().getClassLoader().getResource("error.png");
                if (iconURL != null) {
                    frame.setIconImage(new ImageIcon(iconURL).getImage());
                }
                frame.setLocation(x,y);
                frame.setVisible(true);
                JLabel label = new JLabel("Error!");
                Font defaultfont = label.getFont();
                Font biggerFont = defaultfont.deriveFont(26f);
                label.setFont(biggerFont);
                frame.setLayout(new GridBagLayout());
                GridBagConstraints gbc = new GridBagConstraints();
                gbc.gridx = 0;
                gbc.gridy = 0;
                gbc.weightx = 1;
                gbc.weighty = 1;
                gbc.anchor = GridBagConstraints.CENTER;
                frame.add(label,gbc);
            }
        });
    }
}
