import java.util.*;

public class WeatherStation implements Subject{

    private List<Observer> observers=new ArrayList<>();


    private float temperature;

    private float humidity;


    @Override
    public void addObserver(Observer obs) {
        observers.add(obs);
    }

    @Override
    public void removeObserver(Observer obs) {
        observers.remove(obs);
    }

    @Override
    public void notifyObserver () {
        for (Observer obs : observers) {

            obs.update(temperature, humidity);
        }
    }

public void setWeatherData(float temperature,float humidity){

        this.temperature=temperature;

        this.humidity=humidity;

        notifyObserver();

    }
}
