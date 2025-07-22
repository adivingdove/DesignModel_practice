package Decorator;

public class Tea extends Beverage{
    @Override
    String getDescription() {
        return "Tea";
    }

    @Override
    double getCost() {
        return 3.0;
    }
}
