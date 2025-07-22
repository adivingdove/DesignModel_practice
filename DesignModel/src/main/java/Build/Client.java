package Build;

public class Client {
    public static void main(String[] args) {
        Director director = new Director();

        // laptop
        ComputerBuilder laptopBuilder = new LaptopBuilder();
        director.construct(laptopBuilder);
        Computer laptop = laptopBuilder.getComputer();
        laptop.showInfo();

        System.out.println();

        // server
        ComputerBuilder serverBuilder = new ServerBuilder();
        director.construct(serverBuilder);
        Computer server = serverBuilder.getComputer();
        server.showInfo();
    }
}

