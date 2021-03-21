package factory;

import factory.pizza.NYCheese;

public class PizzaStore {

    public void orderPizza(String pizzaName) {

    }

    public Pizza createPizza(String pizzaName) {

        if (pizzaName.equalsIgnoreCase("cheese")) {
            return new NYCheese()
        }

    }

}
