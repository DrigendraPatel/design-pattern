package com.creational.factory.headfirst.simplefactory;

public class Client {
    public static void main(String[] args) {
        //Pizza pizza=SimplePizzaFactory.createPizza("cheese");
        Pizza pizza =OrderPizza.orderPizza("cheese");
        System.out.println(pizza);
    }
}
