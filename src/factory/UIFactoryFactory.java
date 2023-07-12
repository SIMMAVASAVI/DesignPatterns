package factory;

public class UIFactoryFactory {

    public static UIFactory createUIFactory(SupportedPlatform platform){

        return switch (platform){
            case IOS -> new IOSFactory();
            case ANDROID -> new AndroidFactory();
        };
    }
}
