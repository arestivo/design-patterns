public abstract class State {
    protected AlarmClock alarmClock;

    public State(AlarmClock alarmClock) {
        this.alarmClock = alarmClock;
    }

    public abstract void buttonPressed(AlarmClock.BUTTON button);
    public abstract void buttonReleased(AlarmClock.BUTTON button);
    public abstract void minutePassed();
}
