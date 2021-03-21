package factory.pizza;

import factory.Pizza;

public class NYCheese extends Pizza {

    @Override
    public void prepare() {
        System.out.println("Preparing NY Styled Cheese Pizza");
    }

}
