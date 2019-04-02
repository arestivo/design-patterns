public class AlarmStateSnoozing extends AlarmState {
    private int snoozeTime;

    public AlarmStateSnoozing(AlarmClock alarmClock) {
        super(alarmClock);
        this.snoozeTime = 5;
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
        if (--snoozeTime == 0)
            alarmClock.setAlarmState(new AlarmStatePlaying(alarmClock));
    }
}
