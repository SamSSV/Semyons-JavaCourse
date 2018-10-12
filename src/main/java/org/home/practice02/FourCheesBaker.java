package org.home.practice02;

public class FourCheesBaker extends AbstractPizzaBaker {
    public FourCheesBaker() {
        super("Четыре сыра");
    }

    @Override
    protected void addIngridients() {
        System.out.println("Добавление ингридиентов");
        System.out.println("Томаты");
        System.out.println("Сыр камамбер");
        System.out.println("Сыр бри");
        System.out.println("Сыр сулугуни");
        System.out.println("Сыр брынза");
    }

    @Override
    protected void bake() {
        try {
            System.out.println("Выпекаем");
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
