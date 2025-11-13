
public class Main {
    public static void main(String[] args) throws InterruptedException{

        WeatherStation ws =new WeatherStation();

        Observer phone =new PhoneDisplay();

        Observer tv=new TVDisplay();

        Observer web =new WebDashBoard();


        ws.addObserver(phone);

        ws.addObserver(tv);

        ws.addObserver(web);

        ws.setWeatherData(26,58);

        Thread.sleep(2000);
    }
}