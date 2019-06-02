package com.jakob.designpatterns.factory;

import com.jakob.designpatterns.factory.ingredient.*;

/**
 * @author Jakob
 */
public interface PizzaIngredientFactory {
    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();

    Veggie[] createVeggies();

    Pepperoni createPepperoni();

    Clam createClam();
}
