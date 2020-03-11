package com.example.patronesdisenio.abstract_factory.entity;

import com.example.patronesdisenio.abstract_factory.interfaces.CheckBox;

public class MacOSCheckBox implements CheckBox {
    @Override
    public String paint() {
        System.out.println("You have created MacOSCheckBox");
        return "You have created MacOSCheckBox";
    }
}
