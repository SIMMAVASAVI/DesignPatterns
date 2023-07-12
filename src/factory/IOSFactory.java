package factory;

import factory.components.buttons.Button;
import factory.components.buttons.IOSButton;
import factory.components.dropDown.DropDown;
import factory.components.dropDown.IOSDropDown;
import factory.components.menu.IOSMenu;
import factory.components.menu.Menu;

public class IOSFactory implements UIFactory{
    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }

    @Override
    public DropDown createDropDown() {
        return new IOSDropDown();
    }

    @Override
    public Button createButton() {
        return new IOSButton();
    }
}
