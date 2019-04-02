public class ClockStateSettingTime extends ClockState{
    public ClockStateSettingTime(AlarmClock alarmClock) {
        super(alarmClock);
    }

    @Override
    public void buttonPressed(AlarmClock.BUTTON button) {
        if (button == AlarmClock.BUTTON.HOURS)
            alarmClock.getTime().incrementHour();
        if (button == AlarmClock.BUTTON.MINUTES)
            alarmClock.getTime().incrementMinute();
    }

    @Override
    public void buttonReleased(AlarmClock.BUTTON button) {
        if (button == AlarmClock.BUTTON.TIME)
            alarmClock.setClockState(new ClockStateIdle(alarmClock));
    }

    @Override
    public void minutePassed() {

    }
}
