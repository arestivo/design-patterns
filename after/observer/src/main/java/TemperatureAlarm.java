import java.util.ArrayList;
import java.util.List;

public class TemperatureAlarm implements ThermometerObserver {
    private int maximum;
    private boolean alarm;
    private List<AlarmObserver> observers;

    public TemperatureAlarm(int maximum) {
        this.maximum = maximum;
        this.alarm = false;
        this.observers = new ArrayList<>();
    }

    public void addObserver(AlarmObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void temperatureChanged(int temperature) {
        if (!alarm && temperature > maximum) {
            turnOn();
        } else if (alarm && temperature < maximum){
            turnOff();
        }
    }

    public boolean isAlarm() {
        return alarm;
    }

    private void turnOff() {
        alarm = false;
        notifyObservers();
    }

    private void turnOn() {
        alarm = true;
        notifyObservers();
    }

    private void notifyObservers() {
        for (AlarmObserver observer : observers)
            if (alarm) observer.alarmActivated();
            else observer.alarmDeactivated();
    }
}
