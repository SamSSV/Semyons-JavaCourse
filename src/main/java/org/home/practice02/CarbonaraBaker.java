package org.home.practice02;

public class CarbonaraBaker extends AbstractPizzaBaker {

    public CarbonaraBaker() {
       super("Carbonara");
    }


    @Override
    protected void addIngridients() {
        System.out.println("Добавление ингридиентов");
        System.out.println("Томаты");
        System.out.println("Ветчина");
        System.out.println("Яйцо");
        System.out.println("Зелень");

    }

    @Override
    protected void bake() {
        try {
            System.out.println("Выпекаем");
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
