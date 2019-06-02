package com.jakob.designpatterns.factory;

/**
 * @author Jakob
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if (type.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
        } else if (type.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
        }
        // ....
        return pizza;
    }
}
