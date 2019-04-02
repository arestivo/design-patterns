import java.util.Objects;

public class Time {
    private int hours;
    private int minutes;

    public Time(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public void incrementHour() {
        if (++hours > 23) hours = 0;
    }

    public void incrementMinute() {
        if (++minutes > 59) {
            minutes = 0;
            incrementHour();
        }
    }

    @Override
    public String toString() {
        return (hours < 10 ? "0" : "") + hours + ":" + (minutes < 10 ? "0" : "") + minutes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Time time = (Time) o;
        return hours == time.hours && minutes == time.minutes;
    }
}
