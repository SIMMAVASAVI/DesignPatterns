package factory;

import factory.components.buttons.Button;
import factory.components.dropDown.DropDown;
import factory.components.menu.Menu;
// abstract Factory
public interface UIFactory {

    Menu createMenu();
    DropDown createDropDown();
    Button createButton();

}
