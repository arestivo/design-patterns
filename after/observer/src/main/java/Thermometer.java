import java.util.ArrayList;
import java.util.List;

public class Thermometer {
    private int temperature;
    private List<ThermometerObserver> observers;

    public Thermometer(int temperature) {
        this.temperature = temperature;
        this.observers = new ArrayList<>();
    }

    public void addObserver(ThermometerObserver observer) {
        this.observers.add(observer);
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    private void notifyObservers() {
        for (ThermometerObserver observer : observers)
            observer.temperatureChanged(temperature);
    }

    public int getTemperature() {
        return temperature;
    }
}
