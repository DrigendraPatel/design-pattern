package com.creational.factory.headfirst.simplefactory;

public class PizzaStore {

    public static Pizza  orderPizza(String type){
        Pizza pizza=SimplePizzaFactory.createPizza(type);

     /*
       This piece of code is move from the orderPizaa to Simple factory class
       which is responsible to produce the pizza object.
       // if the code were not  encapsulated from here if there is some changes
       // in the implementation (for example we have addded some more classed in the pizza family) it then
       we have to make the changes in the below code as well which will violate the rule of solid patterns.

       if("cheese".equalsIgnoreCase(type)){
            return new CheesePizza();
        } else if ("pepperoni".equalsIgnoreCase(type)) {
            return new PepperoniPizza();
        } else if ("clam".equalsIgnoreCase(type)) {
            return  new ClamPizza();
        } else if ("veggie".equalsIgnoreCase(type)) {
            return new VeggiePizza();
        }*/


        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;

    }

}
