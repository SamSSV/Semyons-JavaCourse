package org.home.practice02;

public class PapperoniBaket extends AbstractPizzaBaker {

    public PapperoniBaket() {
        super("Папперони");
    }

    @Override
    protected void addIngridients() {
        System.out.println("Добавление ингридиентов");
        System.out.println("Томаты");
        System.out.println("колбаски");
        System.out.println("перец");
        System.out.println("Зелень");
    }

    @Override
    protected void bake() {
        try {
            System.out.println("Выпекаем");
            Thread.sleep(21000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
