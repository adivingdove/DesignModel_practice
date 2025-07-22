package Decorator;

public class MilkDecorator extends BeverageDecorator{
    public MilkDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    String getDescription() {
        return "Milk";
    }

    @Override
    double getCost() {
        return 4.0;
    }
}
