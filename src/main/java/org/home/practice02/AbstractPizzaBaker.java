package org.home.practice02;

public abstract class AbstractPizzaBaker {

    protected final String pizzaType;

    AbstractPizzaBaker(String type) {
        this.pizzaType = type;
    }

    public String preparePizza() {
        getHarvesting();
        addIngridients();
        bake();
        slice();
        box();
        return pizzaType;
    }

    private void getHarvesting() {
        System.out.println("берем заготовку");
    }

    protected abstract void addIngridients();

    protected abstract void bake();

    private void slice() {
        System.out.println("нарезать пиццу на 8 кусков");
    }

    private void box() {
        System.out.println("упаковать пиццу");
    }

}
