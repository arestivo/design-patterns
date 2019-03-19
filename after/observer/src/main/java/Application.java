public class Application {
    public static void main(String[] args) {
        Thermometer thermometer = new Thermometer(18);
        TemperatureAlarm alarm = new TemperatureAlarm(30);
        SMSSender sender = new SMSSender("123123123");

        thermometer.addObserver(alarm);
        alarm.addObserver(new AlarmObserver() {
            @Override
            public void alarmActivated() {
                sender.sendMessage("Temperature: " + thermometer.getTemperature());
            }

            @Override
            public void alarmDeactivated() {

            }
        });

        thermometer.setTemperature(32);
        thermometer.setTemperature(18);
        thermometer.setTemperature(40);
        thermometer.setTemperature(20);
        thermometer.setTemperature(26);
    }
}
