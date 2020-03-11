package com.example.patronesdisenio.abstract_factory.factory;

import com.example.patronesdisenio.abstract_factory.entity.MacOSButton;
import com.example.patronesdisenio.abstract_factory.entity.MacOSCheckBox;
import com.example.patronesdisenio.abstract_factory.interfaces.Button;
import com.example.patronesdisenio.abstract_factory.interfaces.CheckBox;
import com.example.patronesdisenio.abstract_factory.interfaces.GUIFactory;

public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacOSCheckBox();
    }
}
