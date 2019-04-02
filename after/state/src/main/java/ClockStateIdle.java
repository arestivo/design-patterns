public class ClockStateIdle extends ClockState{
    public ClockStateIdle(AlarmClock alarmClock) {
        super(alarmClock);
    }

    @Override
    public void buttonPressed(AlarmClock.BUTTON button) {
        if (button == AlarmClock.BUTTON.TIME)
            alarmClock.setClockState(new ClockStateSettingTime(alarmClock));
        if (button == AlarmClock.BUTTON.ALARM)
            alarmClock.setClockState(new ClockStateSettingAlarm(alarmClock));
    }

    @Override
    public void buttonReleased(AlarmClock.BUTTON button) {

    }

    @Override
    public void minutePassed() {

    }
}
