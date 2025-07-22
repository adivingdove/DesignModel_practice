package Strategy;

public class BikeStrategy implements TravelStrategy{
    @Override
    public void travel(String from, String to) {
        System.out.println("使用自行车出行，从"+from+"到"+to+"需要约30分钟。");
    }
}
