import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class MyWindow {
    public static void window() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("Surprise!!!");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(450,300);
                frame.setLayout(new GridBagLayout());
                GridBagConstraints gbc = new GridBagConstraints();
                JButton button = new JButton("点击有惊喜");
                button.setPreferredSize(new Dimension(200,100));
                button.setBackground(Color.white);
                button.setForeground(Color.BLACK);
                button.setFocusPainted(false);
                Font defaultfont = button.getFont();
                Font biggerFont = defaultfont.deriveFont(26f);
                button.setFont(biggerFont);
                gbc.gridx = 0;
                gbc.gridy = 0;
                gbc.weightx = 1;
                gbc.weighty = 1;
                gbc.anchor = GridBagConstraints.CENTER;
                frame.add(button,gbc);
                button.addActionListener(e -> {
                    try {
                        Surprise.surprise();
                        Surprise.printer();
                    } catch(Exception e1) {
                        System.out.println("未知错误，请重试");
                    }
                });
                frame.setVisible(true);
                frame.setLocationRelativeTo(null);
                URL iconURL = getClass().getClassLoader().getResource("icon.png");
                if (iconURL != null) {
                    frame.setIconImage(new ImageIcon(iconURL).getImage());
                }
            }
        });
    }
}
