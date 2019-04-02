public class AlarmClock {
    enum BUTTON {TIME, ALARM, HOURS, MINUTES, SNOOZE, ALARM_ON, ALARM_OFF}

    private boolean timePressed;
    private boolean alarmPressed;
    private boolean alarmOn;
    private boolean alarmPlaying;

    private Time time;
    private Time alarm;

    private int snoozeTime;

    public AlarmClock() {
        this.timePressed = false;
        this.alarmPressed = false;
        this.alarmOn = false;
        this.alarmPlaying = false;

        this.time = new Time(0, 0);
        this.alarm = new Time(0, 0);

        this.snoozeTime = 0;
    }

    public void buttonPressed(BUTTON button) {
        switch (button) {
            case TIME:
                timePressed = true;
                break;
            case ALARM:
                alarmPressed = true;
                break;
            case HOURS:
                if (timePressed) time.incrementHour();
                else if (alarmPressed) alarm.incrementHour();
                break;
            case MINUTES:
                if (timePressed) time.incrementMinute();
                else if (alarmPressed) alarm.incrementMinute();
                break;
            case SNOOZE:
                if (alarmPlaying) {
                    alarmPlaying = false;
                    snoozeTime = 5;
                }
                break;
            case ALARM_ON:
                alarmOn = true;
                break;
            case ALARM_OFF:
                alarmOn = false;
                alarmPlaying = false;
                snoozeTime = 0;
                break;
        }
    }

    public void buttonReleased(BUTTON button) {
        switch (button) {
            case TIME:
                timePressed = false;
                break;
            case ALARM:
                alarmPressed = false;
                break;
        }
    }

    public void minutePassed() {
        time.incrementMinute();
        if (alarmOn && time.equals(alarm))
            alarmPlaying = true;
        if (alarmOn && !alarmPlaying && snoozeTime > 0 && --snoozeTime == 0)
            alarmPlaying = true;
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
        return alarmPlaying;
    }
}
