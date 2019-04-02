public class AlarmStateOff extends AlarmState {
    public AlarmStateOff(AlarmClock alarmClock) {
        super(alarmClock);
    }

    @Override
    public void buttonPressed(AlarmClock.BUTTON button) {
        if (button == AlarmClock.BUTTON.ALARM_ON)
            alarmClock.setAlarmState(new AlarmStateOn(alarmClock));
    }

    @Override
    public void buttonReleased(AlarmClock.BUTTON button) {

    }

    @Override
    public void minutePassed() {

    }
}
