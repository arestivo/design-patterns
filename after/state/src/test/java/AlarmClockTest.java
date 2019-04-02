import org.junit.Test;

import static org.junit.Assert.*;

public class AlarmClockTest {

    @Test
    public void setTime() {
        AlarmClock alarmClock = new AlarmClock();

        assertEquals("00:00", alarmClock.getTime().toString());

        alarmClock.buttonPressed(AlarmClock.BUTTON.HOURS);
        alarmClock.buttonPressed(AlarmClock.BUTTON.MINUTES);
        assertEquals("00:00", alarmClock.getTime().toString());

        alarmClock.buttonPressed(AlarmClock.BUTTON.TIME);
        alarmClock.buttonPressed(AlarmClock.BUTTON.HOURS);
        assertEquals("01:00", alarmClock.getTime().toString());

        alarmClock.buttonPressed(AlarmClock.BUTTON.MINUTES);
        assertEquals("01:01", alarmClock.getTime().toString());

        alarmClock.buttonReleased(AlarmClock.BUTTON.TIME);
        alarmClock.buttonPressed(AlarmClock.BUTTON.HOURS);
        alarmClock.buttonPressed(AlarmClock.BUTTON.MINUTES);
        assertEquals("01:01", alarmClock.getTime().toString());
    }


    @Test
    public void setAlarm() {
        AlarmClock alarmClock = new AlarmClock();

        assertEquals("00:00", alarmClock.getAlarm().toString());

        alarmClock.buttonPressed(AlarmClock.BUTTON.HOURS);
        alarmClock.buttonPressed(AlarmClock.BUTTON.MINUTES);
        assertEquals("00:00", alarmClock.getAlarm().toString());

        alarmClock.buttonPressed(AlarmClock.BUTTON.ALARM);
        alarmClock.buttonPressed(AlarmClock.BUTTON.HOURS);
        assertEquals("01:00", alarmClock.getAlarm().toString());

        alarmClock.buttonPressed(AlarmClock.BUTTON.MINUTES);
        assertEquals("01:01", alarmClock.getAlarm().toString());

        alarmClock.buttonReleased(AlarmClock.BUTTON.ALARM);
        alarmClock.buttonPressed(AlarmClock.BUTTON.HOURS);
        alarmClock.buttonPressed(AlarmClock.BUTTON.MINUTES);
        assertEquals("01:01", alarmClock.getAlarm().toString());
    }

    @Test
    public void timePasses() {
        AlarmClock alarmClock = new AlarmClock();

        assertEquals("00:00", alarmClock.getTime().toString());

        alarmClock.minutePassed();
        assertEquals("00:01", alarmClock.getTime().toString());

        alarmClock.setTime(new Time(5, 59));
        assertEquals("05:59", alarmClock.getTime().toString());
        alarmClock.minutePassed();
        assertEquals("06:00", alarmClock.getTime().toString());

        alarmClock.setTime(new Time(23, 59));
        assertEquals("23:59", alarmClock.getTime().toString());
        alarmClock.minutePassed();
        assertEquals("00:00", alarmClock.getTime().toString());
    }

    @Test
    public void alarmOn() {
        AlarmClock alarmClock = new AlarmClock();

        alarmClock.setAlarm(new Time(0, 5));

        alarmClock.buttonPressed(AlarmClock.BUTTON.ALARM_ON);

        alarmClock.minutePassed();
        assertEquals("00:01", alarmClock.getTime().toString());
        assertFalse(alarmClock.isAlarmPlaying());

        alarmClock.minutePassed();
        assertEquals("00:02", alarmClock.getTime().toString());
        assertFalse(alarmClock.isAlarmPlaying());

        alarmClock.minutePassed();
        assertEquals("00:03", alarmClock.getTime().toString());
        assertFalse(alarmClock.isAlarmPlaying());

        alarmClock.minutePassed();
        assertEquals("00:04", alarmClock.getTime().toString());
        assertFalse(alarmClock.isAlarmPlaying());

        alarmClock.minutePassed();
        assertEquals("00:05", alarmClock.getTime().toString());
        assertTrue(alarmClock.isAlarmPlaying());

        alarmClock.minutePassed();
        assertEquals("00:06", alarmClock.getTime().toString());
        assertTrue(alarmClock.isAlarmPlaying());
    }

    @Test
    public void alarmOff() {
        AlarmClock alarmClock = new AlarmClock();

        alarmClock.setAlarm(new Time(0, 5));

        alarmClock.minutePassed();
        assertEquals("00:01", alarmClock.getTime().toString());
        assertFalse(alarmClock.isAlarmPlaying());

        alarmClock.minutePassed();
        assertEquals("00:02", alarmClock.getTime().toString());
        assertFalse(alarmClock.isAlarmPlaying());

        alarmClock.minutePassed();
        assertEquals("00:03", alarmClock.getTime().toString());
        assertFalse(alarmClock.isAlarmPlaying());

        alarmClock.minutePassed();
        assertEquals("00:04", alarmClock.getTime().toString());
        assertFalse(alarmClock.isAlarmPlaying());

        alarmClock.minutePassed();
        assertEquals("00:05", alarmClock.getTime().toString());
        assertFalse(alarmClock.isAlarmPlaying());

        alarmClock.minutePassed();
        assertEquals("00:06", alarmClock.getTime().toString());
        assertFalse(alarmClock.isAlarmPlaying());
    }

    @Test
    public void snooze() {
        AlarmClock alarmClock = new AlarmClock();

        alarmClock.setAlarm(new Time(0, 2));
        alarmClock.buttonPressed(AlarmClock.BUTTON.ALARM_ON);

        alarmClock.minutePassed();
        assertEquals("00:01", alarmClock.getTime().toString());
        assertFalse(alarmClock.isAlarmPlaying());

        alarmClock.minutePassed();
        assertEquals("00:02", alarmClock.getTime().toString());
        assertTrue(alarmClock.isAlarmPlaying());

        alarmClock.minutePassed();
        assertEquals("00:03", alarmClock.getTime().toString());
        assertTrue(alarmClock.isAlarmPlaying());

        alarmClock.buttonPressed(AlarmClock.BUTTON.SNOOZE);
        assertFalse(alarmClock.isAlarmPlaying());

        alarmClock.minutePassed();
        assertEquals("00:04", alarmClock.getTime().toString());
        assertFalse(alarmClock.isAlarmPlaying());

        alarmClock.minutePassed();
        assertEquals("00:05", alarmClock.getTime().toString());
        assertFalse(alarmClock.isAlarmPlaying());

        alarmClock.minutePassed();
        assertEquals("00:06", alarmClock.getTime().toString());
        assertFalse(alarmClock.isAlarmPlaying());

        alarmClock.minutePassed();
        assertEquals("00:07", alarmClock.getTime().toString());
        assertFalse(alarmClock.isAlarmPlaying());

        alarmClock.minutePassed();
        assertEquals("00:08", alarmClock.getTime().toString());
        assertTrue(alarmClock.isAlarmPlaying());
    }

    @Test
    public void turnOffAlarm() {
        AlarmClock alarmClock = new AlarmClock();

        alarmClock.setAlarm(new Time(0, 2));
        alarmClock.buttonPressed(AlarmClock.BUTTON.ALARM_ON);

        alarmClock.minutePassed();
        assertEquals("00:01", alarmClock.getTime().toString());
        assertFalse(alarmClock.isAlarmPlaying());

        alarmClock.minutePassed();
        assertEquals("00:02", alarmClock.getTime().toString());
        assertTrue(alarmClock.isAlarmPlaying());

        alarmClock.buttonPressed(AlarmClock.BUTTON.ALARM_OFF);
        assertFalse(alarmClock.isAlarmPlaying());
    }

}