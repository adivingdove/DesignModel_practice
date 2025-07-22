package Decorator;

public class Coffee extends Beverage {
    @Override
    String getDescription() {
        return "Coffee";
    }

    @Override
    double getCost() {
        return 5.0;
    }
}
