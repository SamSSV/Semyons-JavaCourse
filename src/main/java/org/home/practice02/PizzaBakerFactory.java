package org.home.practice02;

public interface PizzaBakerFactory {

    AbstractPizzaBaker getPizzaBaker(Buttons button);
}
