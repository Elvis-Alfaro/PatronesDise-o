package com.example.patronesdisenio.abstract_factory.factory;

import com.example.patronesdisenio.abstract_factory.entity.WindowsButton;
import com.example.patronesdisenio.abstract_factory.entity.WindowsCheckBox;
import com.example.patronesdisenio.abstract_factory.interfaces.Button;
import com.example.patronesdisenio.abstract_factory.interfaces.CheckBox;
import com.example.patronesdisenio.abstract_factory.interfaces.GUIFactory;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowsCheckBox();
    }
}
