package factory;

import factory.components.buttons.AndoidButton;
import factory.components.buttons.Button;
import factory.components.dropDown.AndroidDropDown;
import factory.components.dropDown.DropDown;
import factory.components.menu.AndroidMenu;
import factory.components.menu.Menu;

public class AndroidFactory implements UIFactory{

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public DropDown createDropDown() {
        return new AndroidDropDown();
    }

    @Override
    public Button createButton() {
        return new AndoidButton();
    }
}
