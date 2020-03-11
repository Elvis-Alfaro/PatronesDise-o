package com.example.patronesdisenio.abstract_factory.entity;

import com.example.patronesdisenio.abstract_factory.interfaces.Button;

public class MacOSButton implements Button {
    @Override
    public String paint() {
        System.out.println("You have created MacOSButton");
        return "You have created MacOSButton";
    }
}
