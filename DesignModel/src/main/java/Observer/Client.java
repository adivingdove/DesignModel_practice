package Observer;


public class Client {
    public static void main(String []args){
        Subject subject = new WeatherData();

        Observer obs1 ,obs2;
        obs1 = new PhoneDisplay();
        obs2 = new TVDisplay();

        subject.registerObserver(obs1);
        subject.registerObserver(obs2);


        subject.notifyObservers(28.0F,65.0F,1012.0F);
    }
}
