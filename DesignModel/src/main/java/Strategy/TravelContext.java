package Strategy;

public class TravelContext {
    private TravelStrategy strategy;

    public void setStrategy(TravelStrategy strategy) {
        this.strategy = strategy;
    }

    public void executeTravel(String from, String to) {
        if (strategy == null) {
            System.out.println("请先选择出行策略！");
        } else {
            strategy.travel(from, to);
        }
    }
}

