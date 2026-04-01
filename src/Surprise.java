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
                    ErrorWindow.window();
                    PlayAudio.player();
                    errorCount++;
                } else {
                    timer.stop();
                    try {
                        WindowCloser.closeAll();
                        Runtime.getRuntime().exec("msg * 你已急哭");
                        Runtime.getRuntime().exec("msg * 但祝你愚人节快乐！");
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
