package org.home.practice02;

public class ApolloBaker extends AbstractPizzaBaker {

    public ApolloBaker() {
        super("Аполло");
    }

    @Override
    protected void addIngridients() {
        System.out.println("Добавление ингридиентов");
        System.out.println("Томаты");
        System.out.println("Ветчина");
        System.out.println("Ананас");
        System.out.println("Зелень");
    }

    @Override
    protected void bake() {
        try {
            System.out.println("Выпекаем");
            Thread.sleep(19000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
