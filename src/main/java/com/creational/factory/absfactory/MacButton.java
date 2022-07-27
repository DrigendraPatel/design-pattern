package com.creational.factory.absfactory;

public class MacButton implements IButton{

    @Override
    public void press() {
        System.out.println("Mac button pressed..");
    }
}
