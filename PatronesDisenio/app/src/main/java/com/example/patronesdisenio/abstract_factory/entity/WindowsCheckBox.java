package com.example.patronesdisenio.abstract_factory.entity;

import com.example.patronesdisenio.abstract_factory.interfaces.CheckBox;

public class WindowsCheckBox implements CheckBox {
    @Override
    public String paint() {
        System.out.println("You have created WindowsCheckBox");
        return "You have created WindowsCheckBox";
    }
}
