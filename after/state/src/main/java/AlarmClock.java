public class AlarmClock {
    enum BUTTON {TIME, ALARM, HOURS, MINUTES, SNOOZE, ALARM_ON, ALARM_OFF}

    private AlarmState alarmState;
    private ClockState clockState;

    private Time time;
    private Time alarm;

    public AlarmClock() {
        alarmState = new AlarmStateOff(this);
        clockState = new ClockStateIdle(this);

        this.time = new Time(0, 0);
        this.alarm = new Time(0, 0);
    }

    public void buttonPressed(BUTTON button) {
        alarmState.buttonPressed(button);
        clockState.buttonPressed(button);
    }

    public void buttonReleased(BUTTON button) {
        alarmState.buttonReleased(button);
        clockState.buttonReleased(button);
    }

    public void minutePassed() {
        time.incrementMinute();

        alarmState.minutePassed();
        clockState.minutePassed();
    }

    public Time getTime() {
        return time;
    }

    public Time getAlarm() {
        return alarm;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public void setAlarm(Time time) {
        this.alarm = time;
    }

    public boolean isAlarmPlaying() {
        return alarmState instanceof AlarmStatePlaying;
    }

    public void setClockState(ClockState clockState) {
        this.clockState = clockState;
    }

    public void setAlarmState(AlarmState alarmState) {
        this.alarmState = alarmState;
    }

}
