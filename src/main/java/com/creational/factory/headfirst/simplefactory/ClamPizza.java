package com.creational.factory.headfirst.simplefactory;

public class ClamPizza implements Pizza{
    @Override
    public void prepare() {
        System.out.println("ClamPizza prepared");
    }

    @Override
    public void bake() {
        System.out.println("ClamPizza bake");
    }

    @Override
    public void cut() {
        System.out.println("ClamPizza cut");
    }

    @Override
    public void box() {
        System.out.println("ClamPizza box");
    }
}
