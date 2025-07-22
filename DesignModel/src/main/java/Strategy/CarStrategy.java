package Strategy;

public class CarStrategy implements TravelStrategy{
    @Override
    public void travel(String from, String to) {
        System.out.println("使用汽车出行，从"+from+"到"+to+"需要约8分钟。");
    }
}
