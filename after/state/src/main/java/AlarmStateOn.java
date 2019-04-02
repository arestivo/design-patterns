public class AlarmStateOn extends AlarmState {
    public AlarmStateOn(AlarmClock alarmClock) {
        super(alarmClock);
    }

    @Override
    public void buttonPressed(AlarmClock.BUTTON button) {
        if (button == AlarmClock.BUTTON.ALARM_OFF)
            alarmClock.setAlarmState(new AlarmStateOff(alarmClock));
    }

    @Override
    public void buttonReleased(AlarmClock.BUTTON button) {

    }

    @Override
    public void minutePassed() {
        if (alarmClock.getTime().equals(alarmClock.getAlarm()))
            alarmClock.setAlarmState(new AlarmStatePlaying(alarmClock));
    }
}
