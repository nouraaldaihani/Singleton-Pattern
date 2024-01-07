public class App {
    public static void main(String[] args) throws Exception {

        IphoneSettings setting = IphoneSettings.getInstance();
        setting.setBrightness(20);
        System.out.println("brightness=" + setting.getbrightness());
        System.out.println("wifi on"+ setting.getenableWifi());



    }
}
