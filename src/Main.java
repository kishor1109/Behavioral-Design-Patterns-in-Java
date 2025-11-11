//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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

        ws.setWeatherData(28,60);

        ws.removeObserver(tv);

        ws.setWeatherData(30,65);

    }
}