package com.creational.simplefactory;

public class SimplePizzaFactory {


    public static Pizza createPizza(String type){

        if("cheese".equalsIgnoreCase(type)){
            return new CheesePizza();
        } else if ("pepperoni".equalsIgnoreCase(type)) {
            return new PepperoniPizza();
        } else if ("clam".equalsIgnoreCase(type)) {
            return  new ClamPizza();
        } else if ("veggie".equalsIgnoreCase(type)) {
            return new VeggiePizza();
        }else {
            throw new IllegalArgumentException("invalid pizza type"+type);
        }

    }
}
