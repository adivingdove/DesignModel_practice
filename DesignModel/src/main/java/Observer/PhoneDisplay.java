package Observer;

public class PhoneDisplay implements Observer{
    @Override
    public void update(float temp, float humidity, float pressure) {
        System.out.println("[手机显示] 当前温度："+temp+"℃ 湿度："+humidity+"% 气压："+pressure+"hPa");
    }
}
