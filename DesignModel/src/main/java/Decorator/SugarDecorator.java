package Decorator;

public class SugarDecorator extends BeverageDecorator{

    public SugarDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    String getDescription() {
        return "Sugar";
    }

    @Override
    double getCost() {
        return 2.0;
    }
}
