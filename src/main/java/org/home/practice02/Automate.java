package org.home.practice02;

public class Automate {
    public static void main(String[] args) {
        PizzaBakerFactory pizzaBakerFactory = new UkrainePizzaBakerFactory();
        AbstractPizzaBaker pizzaBaker = pizzaBakerFactory.getPizzaBaker(Buttons.BUTTON_B);
        System.out.println("смачного " + pizzaBaker.preparePizza());
    }


}
