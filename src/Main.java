public class Main {
    public static void main(String[] args) {
        try {
            MyWindow.window();
        } catch(Exception e) {
            ErrorWindow.window("未知错误，请重试", true);
        }
    }
}