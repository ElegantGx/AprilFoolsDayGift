public class Main {
    public static void main(String[] args) {
        try {
            MyWindow.window();
        } catch(Exception e) {
            System.out.println("未知错误，请重试");
        }
    }
}
