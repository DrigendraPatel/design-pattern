package com.creational.factory.absfactory;

public abstract class GUIAbstractFactory {

    public static IFactory getInstance(String osType) {
        if ("mac".equals(osType)) {
            return new MacFactory();
        } else if ("windows".equals(osType)) {
            return new WindowsFactory();
        } else {
            throw new IllegalArgumentException("invalid osType" + osType);
        }
    }

}
