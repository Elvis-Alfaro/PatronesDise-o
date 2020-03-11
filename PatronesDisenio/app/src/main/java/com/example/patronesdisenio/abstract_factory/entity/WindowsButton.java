package com.example.patronesdisenio.abstract_factory.entity;

import com.example.patronesdisenio.abstract_factory.interfaces.Button;

public class WindowsButton implements Button {
    @Override
    public String paint() {
        System.out.println("You have created WindowsButton");
        return "You have created WindowsButton";
    }
}
