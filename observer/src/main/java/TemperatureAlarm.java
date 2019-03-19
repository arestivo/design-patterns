public class TemperatureAlarm {
    private int maximum;
    private boolean alarm;

    public TemperatureAlarm(int maximum) {
        this.maximum = maximum;
        this.alarm = false;
    }

    public void currentTemperature(int temperature) {
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
    }

    private void turnOn() {
        alarm = true;
    }
}
