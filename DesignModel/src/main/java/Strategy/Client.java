package Strategy;

public class Client {
    public static void main(String[] args) {
        TravelContext context = new TravelContext();
        String from = "A";
        String to = "B";

        // 自行车
        System.out.println("从" + from + "出发到" + to + "，选择出行方式：骑自行车");
        context.setStrategy(new BikeStrategy());
        context.executeTravel(from, to);

        System.out.println("---");

        // 地铁
        System.out.println("从" + from + "出发到" + to + "，选择出行方式：地铁");
        context.setStrategy(new SubwayStrategy());
        context.executeTravel(from, to);
    }
}
