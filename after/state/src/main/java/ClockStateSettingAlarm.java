public class ClockStateSettingAlarm extends ClockState{
    public ClockStateSettingAlarm(AlarmClock alarmClock) {
        super(alarmClock);
    }

    @Override
    public void buttonPressed(AlarmClock.BUTTON button) {
        if (button == AlarmClock.BUTTON.HOURS)
            alarmClock.getAlarm().incrementHour();
        if (button == AlarmClock.BUTTON.MINUTES)
            alarmClock.getAlarm().incrementMinute();
    }

    @Override
    public void buttonReleased(AlarmClock.BUTTON button) {
        if (button == AlarmClock.BUTTON.ALARM)
            alarmClock.setClockState(new ClockStateIdle(alarmClock));
    }

    @Override
    public void minutePassed() {

    }
}
