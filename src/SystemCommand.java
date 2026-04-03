public class SystemCommand {
    public static void command() {
        try {
            Runtime.getRuntime().exec("msg * 你已急哭");
            Runtime.getRuntime().exec("msg * 但祝你愚人节快乐！");
        } catch(Exception e) {
            ErrorWindow.window("未知错误，请重试", true);
        }
    }
}
