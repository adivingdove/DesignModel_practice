package Strategy;

public class SubwayStrategy implements TravelStrategy{
    @Override
    public void travel(String from, String to) {
        System.out.println("使用地铁出行，从"+from+"到"+to+"只需10分钟。");
    }
}
