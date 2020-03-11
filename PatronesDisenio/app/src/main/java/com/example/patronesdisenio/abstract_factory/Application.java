package com.example.patronesdisenio.abstract_factory;

import com.example.patronesdisenio.abstract_factory.interfaces.Button;
import com.example.patronesdisenio.abstract_factory.interfaces.CheckBox;
import com.example.patronesdisenio.abstract_factory.interfaces.GUIFactory;

public class Application {
    private Button button;
    private CheckBox checkBox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkBox = factory.createCheckBox();
    }

    public String paint(){
        return button.paint() + "\n" + checkBox.paint();
    }
}
