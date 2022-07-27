package com.creational.factory.absfactory;

public class Client {
    public static void main(String[] args) {
        IFactory macFactory=GUIAbstractFactory.getInstance("mac");
        IButton macButton=macFactory.createButton();
        macButton.press();
        ITextBox macTextBox=macFactory.createTextBox();
        macTextBox.showText();
    }
}
