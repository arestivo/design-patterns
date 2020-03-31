public abstract class State {
    public State(AlarmClock alarmClock) {
        this.alarmClock = alarmClock;
    }

    protected AlarmClock alarmClock;

    public abstract void buttonPressed(AlarmClock.BUTTON button);
    public abstract void buttonReleased(AlarmClock.BUTTON button);
    public abstract void minutePassed();
}
