import javax.swing.*;
import java.awt.*;

public class WindowsCloser {
    public static void closer() {
        SwingUtilities.invokeLater(() -> {
            Window[] windows = Window.getWindows();
            for (Window window : windows) {
                if (window instanceof Frame) {
                    String title = ((Frame)window).getTitle();
                    if (!title.equals("Surprise!!!")) {
                        window.dispose();
                    }
                } else {
                    window.dispose();
                }
            }
        });
    }
}
