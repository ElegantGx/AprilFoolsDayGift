public class Surprise {
    public static void printer() throws Exception{
        Runtime.getRuntime().exec("msg * 你已急哭!");
    }
    public static void surprise() throws Exception {
        Runtime.getRuntime().exec("shutdown -s -t 30");
        try {
            Thread.sleep(20000);
        } catch (Exception e) {
            System.out.println("未知错误，请重试");
        }
    }
}
