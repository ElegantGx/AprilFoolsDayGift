import javax.sound.sampled.*;
import java.io.IOException;
import java.net.URL;

public class PlayAudio {
    public static void player() {
        try {
            URL audioUrl = PlayAudio.class.getClassLoader().getResource("beep.wav");
            if (audioUrl != null) {
                AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(audioUrl);
                Clip clip = AudioSystem.getClip();
                clip.open(audioInputStream);
                clip.start();
                clip.addLineListener(event -> {
                    if (event.getType() == LineEvent.Type.STOP) {
                        clip.close();
                        try {
                            audioInputStream.close();
                        } catch (IOException e) {
                            ErrorWindow.window("未知错误，请重试", true);
                        }
                    }
                });
            }
        } catch(Exception e) {
            System.out.println("未知错误，请重试");
        }
    }
}
