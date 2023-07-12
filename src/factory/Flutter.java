package factory;

public class Flutter {

    private SupportedPlatform platform;

    public Flutter(SupportedPlatform platform) {
        this.platform = platform;
    }

    public void setTheme(){
        System.out.println("setting Theme");
    }

    public void setWallpaper(){
        System.out.println("setting wallpaper");
    }

    public UIFactory createUIFactory() {
        return UIFactoryFactory.createUIFactory(this.platform);
    }
}
