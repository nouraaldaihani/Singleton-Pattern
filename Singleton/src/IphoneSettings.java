public class IphoneSettings {


    private static IphoneSettings instance;
    private int brightness;
    private boolean enableWifi = true;
    

    
    private IphoneSettings() {}
    

public static IphoneSettings getInstance() {

    if (instance == null){
        instance = new IphoneSettings();

    }
    return instance;
}

  public void setBrightness(int brightness) {

    this.brightness = brightness;

  }

  public int getbrightness (){
    return brightness;

  }

    public boolean getenableWifi() {
        return enableWifi;
    }
    
        public void setenableWifi(boolean enableWifi) {
            this.enableWifi = enableWifi;
        }
    
    }