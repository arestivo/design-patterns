public class Application {
    public static void main(String[] args) {
        Thermometer thermometer = new Thermometer(18);
        TemperatureAlarm alarm = new TemperatureAlarm(30);
        SMSSender sender = new SMSSender("123123123");

        thermometer.setTemperature(32);
        alarm.currentTemperature(thermometer.getTemperature());
        if (alarm.isAlarm()) sender.sendMessage("Temperature: " + thermometer.getTemperature());
    }
}
