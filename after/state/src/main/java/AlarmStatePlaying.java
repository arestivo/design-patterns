public class AlarmStatePlaying extends AlarmState {
    public AlarmStatePlaying(AlarmClock alarmClock) {
        super(alarmClock);
    }

    @Override
    public void buttonPressed(AlarmClock.BUTTON button) {
        if (button == AlarmClock.BUTTON.ALARM_OFF)
            alarmClock.setAlarmState(new AlarmStateOff(alarmClock));
        if (button == AlarmClock.BUTTON.SNOOZE)
            alarmClock.setAlarmState(new AlarmStateSnoozing(alarmClock));
    }

    @Override
    public void buttonReleased(AlarmClock.BUTTON button) {

    }

    @Override
    public void minutePassed() {

    }
}
