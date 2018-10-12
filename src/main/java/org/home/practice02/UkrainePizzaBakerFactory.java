package org.home.practice02;

public class UkrainePizzaBakerFactory implements PizzaBakerFactory {

    @Override
    public AbstractPizzaBaker getPizzaBaker(Buttons button) {
        switch (button) {
            case BUTTON_A:
                return new ApolloBaker();
            case BUTTON_B:
                return new CarbonaraBaker();
            case BUTTON_C:
                return new FourCheesBaker();
            case BUTTON_D:
                return new PapperoniBaket();
                
        }
        return null;
    }

}
