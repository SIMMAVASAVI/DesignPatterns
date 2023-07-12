package factory;

import factory.components.buttons.Button;
import factory.components.dropDown.DropDown;
import factory.components.menu.Menu;

public class Client {
    public static void main(String[] args) {
        Flutter flutter=new Flutter(SupportedPlatform.IOS);
        UIFactory uiFactory= flutter.createUIFactory();
        Button button= uiFactory.createButton();
        DropDown dropDown= uiFactory.createDropDown();
        Menu menu = uiFactory.createMenu();
    }
}
