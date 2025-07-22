package Decorator;

public class Client {
    public static void main(String []args){
        // Coffee + Milk + Sugar
        Coffee coffee = new Coffee();
        MilkDecorator milkDecorator = new MilkDecorator(coffee);
        SugarDecorator sugarDecorator = new SugarDecorator(coffee);

        double cost = coffee.getCost()+ milkDecorator.getCost()+ sugarDecorator.getCost();
        System.out.println("饮料描述："+coffee.getDescription()+" + "+milkDecorator.getDescription()+" + "+sugarDecorator.getDescription());
        System.out.println("总价："+cost+"元");
    }
}
